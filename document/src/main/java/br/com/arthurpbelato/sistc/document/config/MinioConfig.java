package br.com.arthurpbelato.sistc.document.config;

import br.com.arthurpbelato.sistc.document.config.property.ApplicationProperties;
import br.com.arthurpbelato.sistc.document.config.property.MinioProperties;
import io.minio.BucketExistsArgs;
import io.minio.MakeBucketArgs;
import io.minio.MinioClient;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MinioConfig {

    private final ApplicationProperties applicationProperties;

    @Bean
    public MinioClient minioClient() {
        MinioProperties minioProperties = applicationProperties.getMinio();

        MinioClient minioClient = MinioClient.builder()
                .endpoint(minioProperties.getUrl())
                .credentials(minioProperties.getAccessKey(), minioProperties.getSecretKey())
                .build();
        createBucket(minioClient);
        return minioClient;
    }

    @SneakyThrows
    private void createBucket(MinioClient minioClient) {
        String bucketName = applicationProperties.getMinio().getBucket();
        if (!bucketExists(minioClient, bucketName)) {
            minioClient.makeBucket(MakeBucketArgs.builder()
                    .bucket(bucketName)
                    .build());
        }


    }

    @SneakyThrows
    private boolean bucketExists(MinioClient minioClient, String bucketName) {
        return minioClient.bucketExists(BucketExistsArgs.builder()
                .bucket(bucketName)
                .build());
    }
}

package br.com.arthurpbelato.sistc.service.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CobrancaViagemDTO {
    private Long id;
    private LocalDateTime dataHora;
    private Double valor;
    private Long idOnibus;
    private Long idPasse;
}

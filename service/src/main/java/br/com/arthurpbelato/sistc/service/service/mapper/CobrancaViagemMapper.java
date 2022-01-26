package br.com.arthurpbelato.sistc.service.service.mapper;

import br.com.arthurpbelato.sistc.service.model.CobrancaViagem;
import br.com.arthurpbelato.sistc.service.service.dto.CobrancaViagemDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CobrancaViagemMapper extends EntityMapper<CobrancaViagemDTO, CobrancaViagem> {

    @Override
    @Mapping(source = "idOnibus", target = "onibus.id")
    @Mapping(source = "idPasse", target = "passe.id")
    CobrancaViagem toEntity(CobrancaViagemDTO dto);

    @Override
    @InheritInverseConfiguration
    CobrancaViagemDTO toDto(CobrancaViagem entity);
}

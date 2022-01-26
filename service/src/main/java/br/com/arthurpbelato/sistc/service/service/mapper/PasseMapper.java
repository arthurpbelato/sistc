package br.com.arthurpbelato.sistc.service.service.mapper;

import br.com.arthurpbelato.sistc.service.model.Passe;
import br.com.arthurpbelato.sistc.service.service.dto.PasseDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PasseMapper extends EntityMapper<PasseDTO, Passe> {

    @Override
    @Mapping(source = "idPessoa", target = "pessoa.id")
    Passe toEntity(PasseDTO dto);

    @Override
    @InheritInverseConfiguration
    PasseDTO toDto(Passe entity);
}

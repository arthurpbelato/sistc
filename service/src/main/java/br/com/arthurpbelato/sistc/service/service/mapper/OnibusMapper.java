package br.com.arthurpbelato.sistc.service.service.mapper;

import br.com.arthurpbelato.sistc.service.model.Onibus;
import br.com.arthurpbelato.sistc.service.service.dto.OnibusDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OnibusMapper extends EntityMapper<OnibusDTO, Onibus> {
}

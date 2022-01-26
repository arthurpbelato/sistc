package br.com.arthurpbelato.sistc.service.service.mapper;

import br.com.arthurpbelato.sistc.service.model.Pessoa;
import br.com.arthurpbelato.sistc.service.service.dto.PessoaDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PessoaMapper extends EntityMapper<PessoaDTO, Pessoa> {
}

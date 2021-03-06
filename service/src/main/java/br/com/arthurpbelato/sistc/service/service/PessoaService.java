package br.com.arthurpbelato.sistc.service.service;

import br.com.arthurpbelato.sistc.service.repository.PessoaRepository;
import br.com.arthurpbelato.sistc.service.service.dto.PessoaDTO;
import br.com.arthurpbelato.sistc.service.service.mapper.PessoaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class PessoaService {

    private final PessoaRepository repository;
    private final PessoaMapper mapper;

    public PessoaDTO salvar(PessoaDTO dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    public PessoaDTO obterPorId(Long id) {
        return mapper.toDto(repository.findById(id).orElseThrow(RuntimeException::new));
    }

    public List<PessoaDTO> obterTodos() {
        return mapper.toDto(repository.findAll());
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

}

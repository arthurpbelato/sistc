package br.com.arthurpbelato.sistc.service.service;

import br.com.arthurpbelato.sistc.service.repository.PessoaRepository;
import br.com.arthurpbelato.sistc.service.service.dto.PessoaDTO;
import br.com.arthurpbelato.sistc.service.service.exceptions.ResourceNotExistsException;
import br.com.arthurpbelato.sistc.service.service.mapper.PessoaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
@Transactional
public class PessoaService {

    private static final String CLASS_NAME = "Pessoa";

    private final PessoaRepository pessoaRepository;
    private final PessoaMapper pessoaMapper;

    public PessoaDTO salvar(PessoaDTO dto) {
        return pessoaMapper.toDto(pessoaRepository.save(pessoaMapper.toEntity(dto)));
    }

    public PessoaDTO obterPorId(Long id) {
        return pessoaMapper.toDto(pessoaRepository.findById(id).orElseThrow(RuntimeException::new));
    }

    public List<PessoaDTO> obterTodos() {
        return pessoaMapper.toDto(pessoaRepository.findAll());
    }

    public void deletar(Long id) {
        pessoaRepository.deleteById(id);
    }

}

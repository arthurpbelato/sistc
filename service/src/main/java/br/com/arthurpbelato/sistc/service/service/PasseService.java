package br.com.arthurpbelato.sistc.service.service;

import br.com.arthurpbelato.sistc.service.repository.PasseRepository;
import br.com.arthurpbelato.sistc.service.service.dto.PasseDTO;
import br.com.arthurpbelato.sistc.service.service.mapper.PasseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PasseService {

    private final PasseRepository repository;
    private final PasseMapper mapper;

    public PasseDTO salvar(PasseDTO dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    public PasseDTO obterPorId(Long id) {
        return mapper.toDto(repository.findById(id).orElseThrow(RuntimeException::new));
    }

    public List<PasseDTO> obterTodos() {
        return mapper.toDto(repository.findAll());
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

}

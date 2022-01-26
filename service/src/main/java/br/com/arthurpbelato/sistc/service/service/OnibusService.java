package br.com.arthurpbelato.sistc.service.service;

import br.com.arthurpbelato.sistc.service.repository.OnibusRepository;
import br.com.arthurpbelato.sistc.service.service.dto.OnibusDTO;
import br.com.arthurpbelato.sistc.service.service.mapper.OnibusMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class OnibusService {

    private final OnibusRepository repository;
    private final OnibusMapper mapper;

    public OnibusDTO salvar(OnibusDTO dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    public OnibusDTO obterPorID(Long id) {
        return mapper.toDto(repository.findById(id).orElseThrow(RuntimeException::new));
    }

    public List<OnibusDTO> obterTodos() {
        return mapper.toDto(repository.findAll());
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

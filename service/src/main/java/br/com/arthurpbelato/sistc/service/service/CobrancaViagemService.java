package br.com.arthurpbelato.sistc.service.service;

import br.com.arthurpbelato.sistc.service.repository.CobrancaViagemRepository;
import br.com.arthurpbelato.sistc.service.service.dto.CobrancaViagemDTO;
import br.com.arthurpbelato.sistc.service.service.mapper.CobrancaViagemMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CobrancaViagemService {

    private final CobrancaViagemRepository repository;
    private final CobrancaViagemMapper mapper;

    public CobrancaViagemDTO salvar(CobrancaViagemDTO dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    public CobrancaViagemDTO obterPorId(Long id) {
        return mapper.toDto(repository.findById(id).orElseThrow(RuntimeException::new));
    }

    public List<CobrancaViagemDTO> obterTodos() {
        return mapper.toDto(repository.findAll());
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}

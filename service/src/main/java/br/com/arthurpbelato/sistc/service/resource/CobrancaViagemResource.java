package br.com.arthurpbelato.sistc.service.resource;

import br.com.arthurpbelato.sistc.service.service.CobrancaViagemService;
import br.com.arthurpbelato.sistc.service.service.dto.CobrancaViagemDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/cobrancas-viagens")
public class CobrancaViagemResource {
    private final CobrancaViagemService service;

    @PostMapping
    public ResponseEntity<CobrancaViagemDTO> salvar(@RequestBody CobrancaViagemDTO dto) {
        CobrancaViagemDTO pessoaSalva = service.salvar(dto);
        return new ResponseEntity<>(pessoaSalva, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<CobrancaViagemDTO>> obterTodos() {
        List<CobrancaViagemDTO> dtos = service.obterTodos();
        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CobrancaViagemDTO> obterPorId(@PathVariable("id") Long id) {
        CobrancaViagemDTO dto = service.obterPorId(id);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable("id") Long id) {
        service.deletar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping
    public ResponseEntity<CobrancaViagemDTO> atualizar(@RequestBody CobrancaViagemDTO dto) {
        CobrancaViagemDTO atualizado = service.salvar(dto);
        return new ResponseEntity<>(atualizado, HttpStatus.OK);
    }

}

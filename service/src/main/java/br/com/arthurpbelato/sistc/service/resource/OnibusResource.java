package br.com.arthurpbelato.sistc.service.resource;

import br.com.arthurpbelato.sistc.service.service.OnibusService;
import br.com.arthurpbelato.sistc.service.service.dto.OnibusDTO;
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
@RequestMapping("/api/onibus")
public class OnibusResource {
    private final OnibusService service;

    @PostMapping
    public ResponseEntity<OnibusDTO> salvar(@RequestBody OnibusDTO dto) {
        OnibusDTO salvo = service.salvar(dto);
        return new ResponseEntity<>(salvo, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<OnibusDTO>> obterTodos() {
        List<OnibusDTO> dtos = service.obterTodos();
        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OnibusDTO> obterPorId(@PathVariable("id") Long id) {
        OnibusDTO dto = service.obterPorID(id);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<OnibusDTO> atualizar(@RequestBody OnibusDTO dto) {
        OnibusDTO salvo = service.salvar(dto);
        return new ResponseEntity<>(salvo, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable("id") Long id) {
        service.deletar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}

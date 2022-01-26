package br.com.arthurpbelato.sistc.service.resource;

import br.com.arthurpbelato.sistc.service.service.PessoaService;
import br.com.arthurpbelato.sistc.service.service.dto.PessoaDTO;
import lombok.Getter;
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
@RequestMapping("/api/pessoa")
public class PessoaResource {

    private final PessoaService pessoaService;

    @PostMapping
    public ResponseEntity<PessoaDTO> salvar(@RequestBody PessoaDTO dto) {
        PessoaDTO pessoaSalva = pessoaService.salvar(dto);
        return new ResponseEntity<>(pessoaSalva, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<PessoaDTO>> obterTodos() {
        List<PessoaDTO> dtos = pessoaService.obterTodos();
        return new ResponseEntity<>(dtos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PessoaDTO> obterPorId(@PathVariable("id") Long id){
        PessoaDTO dto = pessoaService.obterPorId(id);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable("id") Long id){
        pessoaService.deletar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping
    public ResponseEntity<PessoaDTO> atualizar(@RequestBody PessoaDTO dto) {
        PessoaDTO atualizado = pessoaService.salvar(dto);
        return new ResponseEntity<>(atualizado, HttpStatus.OK);
    }

}

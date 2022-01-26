package br.com.arthurpbelato.sistc.service.repository;

import br.com.arthurpbelato.sistc.service.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}

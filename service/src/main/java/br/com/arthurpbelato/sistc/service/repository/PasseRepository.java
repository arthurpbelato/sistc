package br.com.arthurpbelato.sistc.service.repository;

import br.com.arthurpbelato.sistc.service.model.Passe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasseRepository extends JpaRepository<Passe, Long> {
}

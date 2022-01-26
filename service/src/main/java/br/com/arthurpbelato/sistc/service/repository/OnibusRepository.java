package br.com.arthurpbelato.sistc.service.repository;

import br.com.arthurpbelato.sistc.service.model.Onibus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnibusRepository extends JpaRepository<Onibus, Long> {
}

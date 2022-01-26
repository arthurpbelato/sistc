package br.com.arthurpbelato.sistc.service.repository;

import br.com.arthurpbelato.sistc.service.model.CobrancaViagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CobrancaViagemRepository extends JpaRepository<CobrancaViagem, Long> {
}

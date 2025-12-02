package senai.app.AdoteUmAmigo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import senai.app.AdoteUmAmigo.models.adotante.Adotante;

@Repository
public interface AdotanteRepository extends JpaRepository<Adotante, Long> {
}

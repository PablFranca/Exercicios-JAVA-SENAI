package senai.app.AdoteUmAmigo.repositories;

import org.springframework.stereotype.Repository;
import senai.app.AdoteUmAmigo.models.pet.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long>{

}

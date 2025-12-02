package main.java.senai.app.AdoteUmAmigo.repositories;

import main.java.senai.app.AdoteUmAmigo.models.pet.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long>{

}

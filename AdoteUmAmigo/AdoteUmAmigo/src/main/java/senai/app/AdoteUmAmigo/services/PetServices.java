package senai.app.AdoteUmAmigo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import senai.app.AdoteUmAmigo.models.pet.Pet;
import senai.app.AdoteUmAmigo.repositories.PetRepository;

@Service
public class PetServices {

    @Autowired
    private PetRepository petRepository;

    public Pet registrarPet(String nome, String especie, String raca, int idade){

    }
}

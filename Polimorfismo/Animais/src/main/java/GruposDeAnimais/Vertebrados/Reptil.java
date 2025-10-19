package GruposDeAnimais.Vertebrados;

import GruposDeAnimais.*;

public class Reptil extends Animal {
    public Reptil(String nomePopular, String nomeCientifico, double peso, double altura) {
        super(nomePopular, nomeCientifico, GrupoAnimal.REPTIL, peso, altura);
    }

    @Override
    public void emitirSom() {

    }
}

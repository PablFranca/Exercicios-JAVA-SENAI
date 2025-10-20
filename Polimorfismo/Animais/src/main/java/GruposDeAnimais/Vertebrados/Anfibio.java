package GruposDeAnimais.Vertebrados;

import GruposDeAnimais.*;

public class Anfibio extends Animal {

    public Anfibio(String nomePopular, String nomeCientifico, double peso, double altura) {
        super(nomePopular, nomeCientifico, GrupoAnimal.ANFIBIO, peso, altura);
    }
}

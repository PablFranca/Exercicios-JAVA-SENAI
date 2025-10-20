package GruposDeAnimais.Invertebrados;

import GruposDeAnimais.*;

public class Artropode extends Animal {
    public Artropode(String nomePopular, String nomeCientifico, double peso, double altura) {
        super(nomePopular, nomeCientifico, GrupoAnimal.ARTROPODE, peso, altura);
    }
}

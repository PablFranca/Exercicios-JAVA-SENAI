package GruposDeAnimais.Invertebrados;

import GruposDeAnimais.*;

public class Cnidario extends Animal {
    public Cnidario(String nomePopular, String nomeCientifico, double peso, double altura) {
        super(nomePopular, nomeCientifico, GrupoAnimal.CNIDARIO, peso, altura);
    }
}

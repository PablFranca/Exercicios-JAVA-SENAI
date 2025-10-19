package GruposDeAnimais.Vertebrados;

import GruposDeAnimais.*;

public class Peixe extends Animal {
    public Peixe(String nomePopular, String nomeCientifico, double peso, double altura) {
        super(nomePopular, nomeCientifico, GrupoAnimal.PEIXE, peso, altura);
    }

    @Override
    public void emitirSom() {

    }
}

package GruposDeAnimais.Vertebrados;

import GruposDeAnimais.*;

public class Ave extends Animal {
    public Ave(String nomePopular, String nomeCientifico, double peso, double altura) {
        super(nomePopular, nomeCientifico, GrupoAnimal.AVE, peso, altura);
    }
}

package GruposDeAnimais;

import GruposDeAnimais.Vertebrados.Peixe;

public enum GrupoAnimal {
    PEIXE(Familia.VERTEBRADO),
    ANFIBIO(Familia.VERTEBRADO),
    REPTIL(Familia.VERTEBRADO),
    AVE(Familia.VERTEBRADO),
    MAMIFERO(Familia.VERTEBRADO),

    PORIFERO(Familia.INVERTEBRADO),
    CNIDARIO(Familia.INVERTEBRADO),
    ARTROPODE(Familia.INVERTEBRADO),
    ANELIDEO(Familia.INVERTEBRADO),
    EQUINODERMO(Familia.INVERTEBRADO);


    private final Familia familia;
    GrupoAnimal(Familia familia){
        this.familia=familia;

    }
    Familia getGrupoAnimal(){
        return familia;
    }
}

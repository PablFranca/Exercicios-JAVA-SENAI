package com.springapp.lanches_da_tia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable

public class Endereco {
    @Column(name = "rua")
    private String rua;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "cep")
    private String cep;

    @Column(name = "estado")
    private String estado;

    protected Endereco(){

    }
    protected Endereco(String rua,
                       String cidade,
                       String cep,
                       String estado){
        this.rua = rua;
        this.cidade = cidade;
        this.cep = cep;
        this.estado = estado;
    }

}

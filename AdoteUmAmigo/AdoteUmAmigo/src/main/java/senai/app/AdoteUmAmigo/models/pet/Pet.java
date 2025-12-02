package main.java.senai.app.AdoteUmAmigo.models.pet;

import java.time.LocalDate;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Entity
@Tabble(name = "pets")
@Getter
@Setter

public class Pet {
    @Column
    private String nome;

    @Column
    private String especie;

    @Column
    private String raca;

    @Column
    private int idade;

    @Column
    private Porte porte;

    @Column
    private String descricao;

    @Column
    private boolean disponibilidade;

    @Column
    private LocalDate dataEntrada;

    @Column
    private List<String> vacinas;

    public Pet(String nome,
               String especie,
               String raca,
               int idade,
               Porte porte,
               String descricao
    ){
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade= idade;
        this.porte = porte;
        this.descricao = descricao;
    }
    public Pet(){

    }
}

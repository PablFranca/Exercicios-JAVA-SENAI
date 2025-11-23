package com.springapp.lanches_da_tia.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "lanche")
@Getter
@Setter
public class Lanche {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 50, unique = true)
    private String nome;

    @Column(nullable = false)
    private String descricao;

    @DecimalMin("0.01")
    @Column(nullable = false)
    private Double preco;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoDeLanche tipoDeLanche;

    @Column(nullable = false)
    private boolean disponivel;

    @Column(nullable = false)
    private int tempoDePreparoEmMinutos;

public Lanche(){

}
public Lanche(String nome, String descricao, Double preco,TipoDeLanche tipoDeLanche,boolean disponivel, int tempoDePreparoEmMinutos ){
    this.nome = nome;
    this.descricao = descricao;
    this.preco = preco;
    this.tipoDeLanche = tipoDeLanche;
    this.disponivel = disponivel;
    this.tempoDePreparoEmMinutos = tempoDePreparoEmMinutos;
}
}
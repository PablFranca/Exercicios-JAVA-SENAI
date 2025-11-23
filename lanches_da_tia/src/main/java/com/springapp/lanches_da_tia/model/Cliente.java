package com.springapp.lanches_da_tia.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "clientes")
@Setter
@Getter

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int identificador;

    @Column(name= "nome_completo", nullable = false, length = 120)
    private String nomeCompleto;

    @Pattern(regexp ="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$", message = "Formato de email inválido" )
    @Column(name = "email", nullable = false, unique = true, length = 100)
    private String email;

    @Pattern(regexp = "^\\d{2}\\s\\d{5}-\\d{4}$", message = "Formato de telefone inválido")
    @Column(name = "telefone")
    private String telefone;

    @Embedded
    private Endereco endereco;

    @Column(name = "data_de_cadastro")
    private LocalDate dataDeCadastro;

    @Column(name = "cliente_esta_ativo")
    private boolean estaAtivo;

    @Column(name = "preferencias")
    private String preferencias;

    @Pattern(regexp = "^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$", message = "Formato de CpfInvalido")
    @Column(name = "cpf", nullable = false, unique = true)
    private String cpf;


    protected Cliente (){

    }
    protected Cliente(String nomeCompleto,
                      String email,
                      String telefone,
                      Endereco endereco,
                      String cpf
                      ){
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
    }
}


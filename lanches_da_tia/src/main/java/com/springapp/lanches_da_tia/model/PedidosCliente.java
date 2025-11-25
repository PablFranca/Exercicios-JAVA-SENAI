package com.springapp.lanches_da_tia.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="pedidos_cliente")
@Getter
@Setter

public class PedidosCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="id_cliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name="id_lanche", nullable = false)
    private Lanche lanche;

    @Column
    private int quantidade;







    protected PedidosCliente() {}
}

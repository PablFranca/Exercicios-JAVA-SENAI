package com.springapp.lanches_da_tia.repository;

import com.springapp.lanches_da_tia.model.PedidosCliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidosRepository extends JpaRepository<PedidosCliente, Integer> {
}

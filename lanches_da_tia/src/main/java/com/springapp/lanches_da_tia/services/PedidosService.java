package com.springapp.lanches_da_tia.services;

import com.springapp.lanches_da_tia.model.PedidosCliente;
import com.springapp.lanches_da_tia.repository.PedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidosService {
    @Autowired
    private PedidosRepository pedidosRepository;


}

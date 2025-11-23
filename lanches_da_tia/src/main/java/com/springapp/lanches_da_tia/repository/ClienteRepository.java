package com.springapp.lanches_da_tia.repository;
import java.util.List;
import java.util.Optional;

import com.springapp.lanches_da_tia.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    List<Cliente> findByEstaAtivo(boolean estaAtivo);
    Optional<Cliente> findByEmail(String email);
}

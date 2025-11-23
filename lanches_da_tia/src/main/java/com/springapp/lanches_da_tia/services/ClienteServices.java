package com.springapp.lanches_da_tia.services;

import com.springapp.lanches_da_tia.model.Cliente;
import com.springapp.lanches_da_tia.model.Endereco;
import com.springapp.lanches_da_tia.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteServices {
    @Autowired
    private ClienteRepository repositorioDeClientes;

    public List<Cliente> listarClientesAtivos(){
        return repositorioDeClientes.findByEstaAtivo(true);
    }

    public Optional<Cliente> buscarClientePorId( Integer id){
        return repositorioDeClientes.findById(id);
    }

    public Optional<Cliente> buscarClientePorEmail(String email){
        return repositorioDeClientes.findByEmail(email);
    }
    public List<Cliente> adicionarClientes(List<Cliente> clientes){
        //Seta todos os clientes para ativos ao criá-los
        clientes.forEach(cliente-> {
            cliente.setEstaAtivo(true);
            cliente.setDataDeCadastro(LocalDate.now());
        });
        return repositorioDeClientes.saveAll(clientes);
    }

    public Cliente atualizarDadosDoCliente(Integer idCliente,Cliente dadosModificados ){

        Cliente clienteModificado = repositorioDeClientes.findById(idCliente)
                .orElseThrow(()-> new RuntimeException("Cliente com ID " + idCliente + " não encontrado"));
        clienteModificado.setNomeCompleto(dadosModificados.getNomeCompleto());
        clienteModificado.setTelefone(dadosModificados.getTelefone());
        clienteModificado.setEndereco(dadosModificados.getEndereco());

        return repositorioDeClientes.save(clienteModificado);

    }
}

package com.springapp.lanches_da_tia.controler;

import com.springapp.lanches_da_tia.model.Cliente;
import com.springapp.lanches_da_tia.services.ClienteServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clientes/")
public class ClienteControler {
    @Autowired
    private ClienteServices clienteServices;

    @GetMapping
    public ResponseEntity<List<Cliente>> listarClientes(){
        List<Cliente> clientes = clienteServices.listarClientesAtivos();
        if(!clientes.isEmpty()){
            return ResponseEntity.ok(clientes);
        }else return ResponseEntity.notFound().build();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarClientePorId(@PathVariable Integer id){
        Optional<Cliente> cliente = clienteServices.buscarClientePorId(id);
        if(cliente.isPresent()){
            return ResponseEntity.ok(cliente.get());
        } else return ResponseEntity.notFound().build();
    }
    @PostMapping
    public ResponseEntity<List<Cliente>> adicionarCliente(@RequestBody @Valid List<Cliente> clientes){
        List<Cliente> clientesSalvos = clienteServices.adicionarClientes(clientes);

        return ResponseEntity.status(HttpStatus.CREATED).body(clientesSalvos);
    }
    @PutMapping("/{id_cliente}")
    public ResponseEntity<Cliente> atualizarCliente(@PathVariable Integer id_cliente,
                                                    @RequestBody @Valid Cliente clienteAtualizado){
    try{
        Cliente clienteModificado = clienteServices.atualizarDadosDoCliente(id_cliente,clienteAtualizado);
        return ResponseEntity.ok(clienteModificado);
    }catch(RuntimeException e){
        return ResponseEntity.notFound().build();
    }
    }
    @GetMapping("/email/{email}")
    public ResponseEntity<Cliente> buscarPorEmail(@PathVariable String email){
        try{
            Optional<Cliente> clienteBuscado = clienteServices.buscarClientePorEmail(email);
            return ResponseEntity.ok(clienteBuscado.get());
        }catch (RuntimeException e){
            return ResponseEntity.notFound().build();
        }
    }
}

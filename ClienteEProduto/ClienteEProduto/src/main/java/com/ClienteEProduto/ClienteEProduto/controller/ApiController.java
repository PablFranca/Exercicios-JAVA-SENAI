package com.ClienteEProduto.ClienteEProduto.controller;

import com.ClienteEProduto.ClienteEProduto.produto.Produto;
import com.ClienteEProduto.ClienteEProduto.cliente.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/")
public class ApiController {

    @GetMapping
    public Map<String, Object> raiz(){
        Map<String, Object> resposta = new HashMap<>();
        resposta.put("mensagem","Bem vindo a API de Cliente e Produtos! ");
        resposta.put("versao", "1.0.0");
        resposta.put("descricao","API REST com Spring Boot");

        Map<String, String> endpoints = new HashMap<>();
        endpoints.put("Info", "GET /");
        endpoints.put("1 Cliente", "GET /cliente");
        endpoints.put("Vários Clientes","GET /clientes");
        endpoints.put("1 Produto", "GET /produto");
        endpoints.put("Vários produtos","GET /clientes-maiores-30");
        endpoints.put("Tudo Junto", "GET /dados");
        endpoints.put("Clientes por faixa etaria","GET /clientes-maiores-30");
        endpoints.put("Produtos Baratos", "GET /produtos-baratos");

        resposta.put("endpoints",endpoints);
        resposta.put("status","Online");

        return resposta;

    }
    @GetMapping("/cliente")
    public Cliente obterCliente(){
        return new Cliente("João Silva", 28,"joao@email.com");
    }

    @GetMapping("/clientes")
    public List<Cliente> obterClientes(){
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("João Silva", 28, "joao@email.com"));
        clientes.add(new Cliente("Maria Santos", 35, "maria@email.com"));
        clientes.add(new Cliente("Pedro Oliveira",42, "pedro@email.com"));
        clientes.add(new Cliente("Ana Costa",31,"ana@email.com"));
        clientes.add(new Cliente("Carlos Mendes", 25,"carlos@email.com"));
        clientes.add(new Cliente("Juliana Pereira",38,"juliana@email.com"));
        clientes.add(new Cliente("Roberto Ferreira",55,"roberto@email.com"));
        clientes.add(new Cliente("Fernanda Lima",29,"fernanda@email.com"));
        clientes.add(new Cliente("Lucas Rocha",23,"lucas@email.com"));
        clientes.add(new Cliente("Patricia Gomes", 44, "patricia@email.com"));
        return clientes;
    }

    @GetMapping("/produto")
    public Produto obterProduto(){
        return new Produto("Notebook DELL", 3500.00,"Note");
    }

    @GetMapping("/produtos")
    public List<Produto> obterProdutos(){
        List<Produto> produtos = new ArrayList<>();
        //Notebooks

        produtos.add(new Produto("Notebook DELL", 3500.00,"Note"));
        produtos.add(new Produto("Notebook Lenovo Ideapad", 2800.00,"Note"));
        produtos.add(new Produto("Notebook HP Pavilion", 3200.00,"Note"));
        produtos.add(new Produto("Notebook Asus VivoBook", 2600.00,"Note"));

        //Perifericos
        produtos.add(new Produto("Mouse Logitech MX Master",350.00,"Mouse"));
        produtos.add(new Produto("Mouse Razer DeathAdder",280.00,"Mouse"));
        produtos.add(new Produto("Teclado Mecanico RGB",450.00,"Mouse"));
        produtos.add(new Produto("Teclado Bluetooth Wireless",180.00,"Mouse"));

        //Monitores
        produtos.add(new Produto("Monitor LG 24 Polegadas", 350.00, "Monitor"));
        produtos.add(new Produto("Monitor Dell 27 Polegadas 144Hz", 1400.00,"Monitor"));
        produtos.add(new Produto("Monitor Samsung 32 polegadas 4K", 2200.00, "Monitor"));
        produtos.add(new Produto("Monitor ASUS Curvo 34\"", 2200.00, "Monitor"));

        //WebCams e Audio
        produtos.add(new Produto("Webcam Logitech C920", 380.00,"Webcam"));
        produtos.add(new Produto("Headset HyperX Cloud Flight", 650.00,"Headset"));
        produtos.add(new Produto("Microfone Blue Yeti", 520.00,"Microfone"));
        produtos.add(new Produto("Alto-falante JBL Bluetooth", 250.00,"Alto-falante"));

        //Acessórios
        produtos.add(new Produto("Mousepad XL Gamer", 120.00,"Mousepad"));
        produtos.add(new Produto("Hub USB-C 7 em 1", 280.00, "Hub USB" ));
        produtos.add(new Produto("Webcam anel de luz LED", 180.00, "Webcam"));
        produtos.add(new Produto("Suporte para notebook", 90.00,"Suporte"));

        return produtos;
    }
    @GetMapping("/dados")
    public Map<String, Object> ObterDados(){
        Map<String, Object> dados = new HashMap<>();

        List<Cliente> clientes = obterClientes();
        List<Produto> produtos = obterProdutos();

        dados.put("clientes", clientes);
        dados.put("produtos",produtos);
        dados.put("totalClientes", clientes.size());
        dados.put("totalProdutos", produtos.size());
        dados.put("status","Dados criados com sucesso!");

        return dados;
    }

    @GetMapping("/clientes-maiores-30")
    public Map<String, Object> ObterClientesMaiores30(){
        List<Cliente> todosClientes = obterClientes();
        List<Cliente> clientesMaiores30 = todosClientes.stream()
                .filter(c -> c.getIdade()>30)
                .collect(Collectors.toList());

        Map<String, Object> resulltado = new HashMap<>();
        resulltado.put ("totalClientesMaiores",clientesMaiores30.size());
        resulltado.put("clientes", clientesMaiores30);

        return resulltado;

    }
    @GetMapping("/produtos-baratos")
    public Map<String, Object> obterProdutosBaratos(){
        List<Produto>todosProdutos = obterProdutos();
        List<Produto> produtosBaratos = todosProdutos.stream()
                .filter(p -> p.getPreco()< 500.00)
                .collect(Collectors.toList());

        Map<String, Object> resulltado = new HashMap<>();
        resulltado.put("totalEncontrados",produtosBaratos.size());
        resulltado.put("faixaDePreco","Menor que R$ 500.00");
        resulltado.put("produtos", produtosBaratos);

        return resulltado;
    }
    @GetMapping("/estatisticas")
    public Map<String,Object> obterEstatisticas(){
        List<Produto> todosProdutos = obterProdutos();
        List<Cliente> clientes = obterClientes();

        double precoMedio = 0;
        double precoMaximo = 0;
        double precoMinimo = Double.MAX_VALUE;

        for(Produto p : todosProdutos){
            if(p.getPreco()>precoMaximo)precoMaximo =p.getPreco();
            if(p.getPreco()>precoMinimo)precoMinimo =p.getPreco();
        }
        precoMedio = precoMaximo/precoMinimo;

        int idadeMedia = 0;
        for(Cliente c : clientes){
            idadeMedia += c.getIdade();
        }
        idadeMedia = idadeMedia/clientes.size();

        Map<String, Object> stats = new HashMap<>();

        stats.put("totalClientes",clientes.size());
        stats.put("idadeMedia",idadeMedia);
        stats.put("totalProdutos",todosProdutos.size());
        stats.put("precoMinimo", precoMinimo);
        stats.put("precoMedio",precoMedio);
        stats.put("precoMaximo",precoMaximo);

        return stats;
    }
}

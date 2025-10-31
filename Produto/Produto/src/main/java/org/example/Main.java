package org.example;

import Produto.ProdutoEletronico;

import java.util.ArrayList;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ProdutoEletronico> produtosEletronicos = new ArrayList<>();

        while (true) {

            System.out.print("Informe o nome do produto ou 'Sair' para interromper o cadastro de produtos ");
            String nome = sc.nextLine();
            boolean nomeValido = !nome.isEmpty();

            if (nome.equalsIgnoreCase("Sair")) {
                break;
            }else if (!nomeValido){
                System.out.println("Nenhum nome foi digitado!");
            }


            System.out.print("Informe o preço do produto ");
            double preco = sc.nextDouble();

            boolean precoValido = preco > 0;


            if  (!precoValido){
                System.out.println("Preço inválido");

            }

            System.out.print("Informe quantos Meses de garantia o produto deve ter ");
            int mesesDeGarantia = sc.nextInt();

            boolean mesesValidos = mesesDeGarantia >= 1;

            sc.nextLine();

            if (nomeValido && precoValido && mesesValidos){
                produtosEletronicos.add(new ProdutoEletronico(nome, preco,mesesDeGarantia));
                System.out.println("Produto " + nome + " cadastrado!");
            }else {
                System.out.println("Não foi possível adicionar este produto");
            }

        }
        System.out.println("==============================");


        if (produtosEletronicos.isEmpty()) {
            System.out.println("Nenhum valor foi Cadastrado!");
        } else {
                System.out.println("Exibindo produtos cadastrados");
           for(ProdutoEletronico p: produtosEletronicos){
               p.exibirDetalhes();
           }
        }
        System.out.println("-----------------------------");
        sc.close();
    }
}
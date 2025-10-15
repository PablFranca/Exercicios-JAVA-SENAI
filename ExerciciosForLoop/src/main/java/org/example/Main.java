package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a tabuada que deseja ver: ");
        int entrada = scanner.nextInt();

        if (entrada > 0){
            System.out.println("TABUADA DE "+ entrada+ " \n" );
            for(int i = 1; i <= 10; i++){
                System.out.println(i + " * " + entrada +" = " + entrada* i);
            }
        }
    }
}
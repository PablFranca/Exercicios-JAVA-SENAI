package org.example.exspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class ExController {

    @GetMapping("/api")
    public String home(){
        return "Olá, aplicação Spring Boot.";
    }
    @GetMapping("/testeSeParOuImpar/{numUm}")
    public String testaSeNumeroEhParOuImpar(@PathVariable int numUm){
        return numUm % 2 ==0 ? numUm +" é Par": numUm + "é Impar";
    }
    @GetMapping("/somar/{numUm}/{numDois}")
    public String somar(@PathVariable int numUm, @PathVariable int numDois){
        return "A soma entre "+ numUm+" e "+numDois+" é "+(numUm+numDois);
    }
    @GetMapping("/subtrair/{num1}/{num2}")
    public String subtrair(@PathVariable int num1, @PathVariable int num2){
        return "A subtração entre "+ num1 +" e "+ num2 +" é "+(num1-num2);
    }
    @GetMapping("/multiplicar/{num1}/{num2}")
    public String multiplicar(@PathVariable int num1, @PathVariable int num2){
        return "A multiplicação entre " + num1 + " e " + num2 +" é "+(num1*num2);
    }
    @GetMapping("/dividir/{num1}/{num2}")
    public String divisao(@PathVariable int num1, @PathVariable int num2){
        return num2 != 0 ? "A divisão entre " + num1 + " e " + num2 + "é" +(num1/num2): "Divisão por zero impossível";
    }

}


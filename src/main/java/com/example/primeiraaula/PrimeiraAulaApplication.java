package com.example.primeiraaula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PrimeiraAulaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrimeiraAulaApplication.class, args);

    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite um numero: ");
    double num = teclado.nextDouble();


        if(num > 5){
            System.out.println("numero menor que 5");
        }else {
            System.out.println("número maior que 5");
        }

        System.out.println("ALUNOS TOP");
        System.out.println("Atividade 1- aula 2 ");

        System.out.println("Realizar um pull desse arquivo e fazer uma" +
                " melhoria criando uma calculadora de calculo de nota da UMC ");

}
}

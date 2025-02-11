package com.example.primeiraaula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PrimeiraAulaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrimeiraAulaApplication.class, args);

    Scanner teclado = new Scanner(System.in);

    int num = 2;
    System.out.println("Digite um numero: ");
    String alunos = teclado.next();
        System.out.println(alunos);

}
}

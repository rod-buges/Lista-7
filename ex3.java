package com.mycompany.lista7exercicios;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int vetor[] = new int[6];
        int somaDosPares = 0, impares = 0;
       
        System.out.println("Insira 6 numeros");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }
      
        System.out.println("numeros pares são:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                  somaDosPares += vetor[i];
                  System.out.print(vetor[i] + " ");
            }
        }
        System.out.println("");
        System.out.println("A soma dos pares é : ");
        System.out.println(somaDosPares);
        System.out.println("");
        System.out.println("numeors impares são: " );
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                impares++;
                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println("");
        System.out.println("A quantidade de numeros impares é: " + impares);
    }
}

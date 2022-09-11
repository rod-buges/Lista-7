package com.mycompany.lista7exercicios;

import java.util.Scanner;

public class exercicio1 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetorA = new int[10];int[] vetorB = new int[10];int[] vetorC = new int[10];
        
        
        System.out.println("Coloqeu os valores do Vetor A");

       
        for (int i = 0; i < 10; ++i) {
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Coloque os valores do Vetor B");

        for (int i = 0; i < 10; ++i) {
            vetorB[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; ++i) {
            vetorC[i] = vetorA[i] - vetorB[i] * vetorA[i];
        }

        System.out.println("O Vetor C é igual a: ");

        for (int i = 0; i < 10; ++i) {
            System.out.print(vetorC[i] + " ");
        }

    }
     
}
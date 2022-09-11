
package com.mycompany.lista7exercicios;

public class exercicio2 {
     public static void main(String[] args) {
         int vetor[] = new int[100];
        int num = 0, numador = 0;

        while (vetor[99] == 0) {
            if (num % 7 != 0 || num % 10 == 7) {
                vetor[numador] = num;
                numador++;
            }
            num++;
            if (num > 100) {
                break;
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 7 == 0 || vetor[i] == 17 ||vetor[i] == 27 ||vetor[i] == 37 ||vetor[i] == 47 ||vetor[i] == 57 ||vetor[i] == 67 ||vetor[i] == 87 ||vetor[i] == 97) {
                System.out.println(" ");
            }else {
                System.out.print(vetor[i] + " ");
            }
        }
    }
}

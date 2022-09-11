
package com.mycompany.lista7exercicios;

public class exercicio5 {
    public static void main(String[] args) {
        int [] vetor = new int [100];
        int n = 7;
        vetor[0] =1;
        
        for (int i = 0; i < n; i++) {
            int aux1 =0, aux2;
            
            for (int j = 0; j < i; j++) {
                aux2 = aux1 +vetor[j];
                aux1 = vetor[j];
                vetor[j] = aux2;
                System.out.printf("%3d", vetor[j]);
            }
            System.out.println();
        }
    }
}

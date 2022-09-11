import java.util.Scanner;


public class exercicio4 extends AuxScanner {
    
    public static int vetorA[] = new int[10];
    public static int vetorB[] = new int[10];
    public static int vetorC[] = new int[20];
    public static int aux1 = 2, aux2 = 1;
    public static boolean vf = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vetor A");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = sc.nextInt();
        }
        System.out.println("Vetor B");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = sc.nextInt();
        }
        vetorC[0] = vetorA[0];
       
        System.out.println("Vetor gerado");
        vetorResultante1();
        vetorResultante2();
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }

    }

    public static void vetorResultante1() {
        for (int i = 0; i < vetorA.length; i++) {
            for (int j = 0; j < vetorC.length; j++) {
                if (vetorA[i] != vetorC[j]) {
                    vf = true;
                } else {
                    vf = false;
                    break;
                }
            }
            if (vf) {
                if (aux1 <= 18) {
                    vetorC[aux1] = vetorA[i];
                    aux1 += 2;
                } else {
                    System.out.println("Aux maior que 18");
                    break;
                }
            }

        }
    }

    public static void vetorResultante2() {
        for (int i = 0; i < vetorB.length; i++) {
            for (int j = 0; j < vetorC.length; j++) {
                if (vetorB[i] != vetorC[j]) {
                    vf = true;
                } else {
                    vf = false;
                    break;
                }
            }
            if (vf) {
                if (aux2 <= 19) {
                    vetorC[aux2] = vetorB[i];
                    aux2 += 2;
                } else {
                    System.out.println("Aux maior que 19");
                    break;
                }
            }

        }
    }
}
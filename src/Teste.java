import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[5]; // vetor com 5 posições

        // Lê os valores
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        // Mostra os valores
        System.out.println("Você digitou:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Posição " + (i + 1) + ": " + numeros[i]);
        }

        sc.close();
    }
}
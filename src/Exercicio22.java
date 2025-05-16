import java.util.Scanner;

public class Exercicio22 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int inicio, fim, passo;

        System.out.println("*** CONTADOR ESPECIAL ***");

        while (true) {
        System.out.print("\nDefina o inicio do contador (1 a 5): ");
        inicio = sc.nextInt();
        System.out.print("Defina o fim do contador (6 a 20): ");
        fim = sc.nextInt();
        System.out.print("Defina o passo (1 a 4): ");
        passo = sc.nextInt();

        if (inicio>5 || (fim<6 || fim>20) || (passo<1 || passo>4)) {
            System.out.println("\nDigito invalido. Tente novamente.");
        } else {
            break;
        }
    } 

        for (; inicio<=fim; inicio+=passo) { 
            System.out.println(inicio); 
            sc.close();
        } 
    } 
} 


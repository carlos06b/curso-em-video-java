import java.lang.Math;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.print("\nDigite o primeiro numero para fazer a exponenciação: ");
    double n1 = sc.nextDouble();
    System.out.print("Digite o segundo: ");
    double n2 = sc.nextDouble();
    double n3 = Math.pow(n1,n2);

    System.out.println("\nO resultado é: "+n3);

    sc.close();
    }
}

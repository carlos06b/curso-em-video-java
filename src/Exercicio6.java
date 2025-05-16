import java.lang.Math;
import java.util.Scanner;

public class Exercicio6 { //super calculadora
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n2, n5, n6;
        double n1, n3, n4;

        System.out.println("*** BEM VINDO A SUPER CALCULADORA ***");
        System.out.print("Digite um numero: ");
        n6 = sc.nextInt();

        n1 = (double) Math.pow(n6, 3);
        n2 = Math.abs(n6);
        n3 = (double) Math.sqrt(n6);
        n4 = (double) Math.cbrt(n6);
        n5 = n6 % 2;

        System.out.println("\nResto da Divisão por 2: "+n5);
        System.out.println("Elevado ao cubo: "+n1);
        System.out.printf("Raiz Quadrada: %.2f",n3);
        System.out.printf("\nRaiz Cubica: %.2f",n4);
        System.out.println("\nValor absoluto: "+n2);

        sc.close();
    }
}
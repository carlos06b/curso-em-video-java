import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        double soma, mult, div, sub;
        
        System.out.print("Digite um numero para calcular: ");
        num1 = scanner.nextDouble();
        System.out.print("Digite outro numero para calcular: ");
        num2 = scanner.nextDouble();

        soma = (num1 + num2);
        mult = (num1 * num2);
        div = (num1 / num2);
        sub = (num1 - num2);

        System.out.println("\nA soma dos numeros é: " +soma);
        System.out.println("A multiplicação dos numeros é: " +mult);
        System.out.println("A divisão dos numeros é: " +div);
        System.out.println("A subtração dos numeros é: " +sub);

        scanner.close();

    }
}
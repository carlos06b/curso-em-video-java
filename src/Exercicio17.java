import java.util.Scanner;

public class Exercicio17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num, fatorial;
        fatorial = 1;

        System.out.print("Digite um numero para saber seu fatorial: ");
        num = sc.nextInt();
        int contador = num;

        while (contador>1) {
            fatorial *= contador;
            contador--;
        }  
        System.out.println("O fatorial de "+ num +" é "+ fatorial);
        sc.close();
    } 
} 

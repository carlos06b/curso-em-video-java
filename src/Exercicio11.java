import java.util.Scanner;

public class Exercicio11 { //Condição composta
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nasc;
        System.out.println("Qual seu ano de nascimento?");
        nasc = sc.nextInt();
        int I = 2025 - nasc;
        System.out.println("Sua idade é: "+ I);
        if (I >=18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("*** BEM VINDO AO JOGO DE ADIVINHAÇÃO ***");

        while (true) {
        double ale = 1+Math.random()*(5-1);
        int ale2 = (int) Math.round(ale);
        int n1;

        System.out.printf("Tente adivinhar o numero que estou pensando de 1 a 5: ");
        n1 = sc.nextInt();

            if (n1 != ale2) {
                System.out.println("Você errou... tente novamente!");
            } else {
                System.out.println("PARABÉNS VOCÊ ACERTOU!!!");
                sc.close();
            } 
        }
    } 
}

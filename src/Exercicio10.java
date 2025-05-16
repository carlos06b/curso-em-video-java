import java.util.Scanner;

public class Exercicio10 { //Condição simples
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                double n1, n2, m;

        System.out.println("Qual foi a primera nota do aluno? ");
        n1 = sc.nextDouble();
        System.out.println("Qual foi a segunda nota do aluno? ");
        n2 = sc.nextDouble();
        System.out.println("A media do aluno é " + (m = (n1 + n2) / 2));
        if (m > 9) {
            System.out.println("Parabéns!!!");
        }
        sc.close();
    }
}

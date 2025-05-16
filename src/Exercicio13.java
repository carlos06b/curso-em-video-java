import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade, ano;

        System.out.println("*** VERIFICARDOR DE VOTAÇÃO ***");
        System.out.print("Qual ano você nasceu: ");
        ano = sc.nextInt();
        idade = 2025 - ano;

        if (idade<16) {
            System.out.println("Você não pode votar");
        } else if ((16>=idade && idade<18) || (70<=idade)) {
            System.out.println("Seu voto é opcional");
        } else {
            System.out.println("Seu voto é obrigatorio");
        } sc.close();
    }
}

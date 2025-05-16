import java.util.Scanner;

public class Exercicio19 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, s = 0, par = 0, impar = 0, acima = 0, media = 0, valores = 0;

        do {
            System.out.print("Digite um numero: ");
            n = sc.nextInt();
            s += n;
            valores++;
            if (n>100) {
                acima++;
            } else if (n % 2 == 0) {
                par++;
            } else if (n % 2 != 0) {
                impar++;
            } 
        } while (n!=0); 
        
        media = s / valores;

        System.out.println("Total de valores: "+ valores);
        System.out.println("A soma dos numeros é: "+ s);
        System.out.println("Total de impar: "+ impar);
        System.out.println("Total de par: "+ par);
        System.out.println("Acima de 100: "+ acima);
        System.out.println("Media dos valores: "+ media);

        sc.close();
    } 
}

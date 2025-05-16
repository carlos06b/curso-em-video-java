import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        double delta;

        System.out.print("Digite o numero para ser A: ");
        a = sc.nextDouble();
        System.out.print("Digite o numero para ser B: ");
        b = sc.nextDouble();
        System.out.print("Digite o numero para ser C: ");
        c = sc.nextDouble();

        delta = ((b*b)-4*a*c);
        System.out.println("Delta = "+ delta);
        
        if (delta>=0) {
        System.out.println("Tipo = Existem raízes Reais");
        } else {
            System.out.println("Tipo = Não existem raízes Reais");
        } sc.close();
    }
}

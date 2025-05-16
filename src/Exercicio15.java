import java.util.Scanner;

public class Exercicio15 {
    Scanner sc = new Scanner(System.in);

    int a, b, c;

    public Exercicio15 (int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
    }

    public void inicializador() {
        System.out.print("Digite o lado A do triangulo: ");
        a = sc.nextInt();

        System.out.print("Digite o lado B do triangulo: ");
        b = sc.nextInt();

        System.out.print("Digite o lado C do triangulo: ");
        c = sc.nextInt();
    }

    public void triangulotrue() {
        if (a<b+c && b<a+c && c<a+b) {
            System.out.println("\nForma um triangulo");
        } else {
            System.out.println("\nNão forma um triangulo");
        }
    }

    public void triangulotipo() {
        if (a<b+c && b<a+c && c<a+b) {
        if (a == b && b == c) {
            System.out.println("Tipo: Equilátero");
    } else if ((a != b && b == c) || (b != a && a == c) || (c != b && b == a)) {
        System.out.println("Tipo: Isósceles");
    } else {
        System.out.println("Tipo: Escaleno");
    }
} else {
    System.out.println(" ");
}
    }

    public static void main(String[] args) {
        Exercicio15 triangulo = new Exercicio15(0, 0, 0);

        System.out.println("*** IDENTIFICADOR TIPO DO TRIANGULO ***");
        triangulo.inicializador();
        triangulo.triangulotrue();
        triangulo.triangulotipo();
    } 
}
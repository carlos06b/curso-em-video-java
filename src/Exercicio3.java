import java.util.Scanner;

public class Exercicio3 {
    Scanner sc = new Scanner(System.in);

    String time1;
    String time2;
    String tec1;
    String tec2;
    int p1;
    int p2;
    int pp;

    public Exercicio3(String time1, String tec1, String time2, String tec2) {
        this.time1 = time1;
        this.tec1 = tec1;
        this.time2 = time2;
        this.tec2 = tec2;
        this.p1 = 0;
        this.p2 = 0;
        this.pp = 0;
    }

    public void pontuacaotime1() {
        p1++;
        System.out.println("PONTO PARA O TIME: "+time1);
    }

    public void pontuacaotime2() {
        p2++;
        System.out.println("PONTO PARA O TIME: "+time2);
    }

    public boolean acabarpartida() {
        if (p1 >= 25 && (p1 - p2) >= 2) {
            System.out.println("\nFIM DE JOGO!!! VITÓRIA DO " + time1);
            return true;
        } else if (p2 >= 25 && (p2 - p1) >= 2) {
            System.out.println("\nFIM DE JOGO!!! VITÓRIA DO " + time2);
            return true;
        }
        return false;
    }

    public void inicializador() {
        System.out.println("\n**** PARTIDA DE VOLEI ****");
        System.out.println(time1+" VS "+time2);
        System.out.println("\n** PONTUAÇÃO **");
        System.out.println(time1+": "+p1+" | "+time2+": "+p2);
        System.out.println(time1+" - 1");
        System.out.println(time2+" - 2");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Exercicio3 partida = new Exercicio3("Santa Cruz", "Itamar Schulle", "Sport", "Pepa");
        partida.inicializador();

        while (true) {
            System.out.print("\nQuem fez ponto? ");
            int i = input.nextInt();

            switch (i) {
                case 1:
                    partida.pontuacaotime1();
                    partida.inicializador();
                    if (partida.acabarpartida()) {
                        input.close();
                        return;
                    }
                    break;
                case 2:
                    partida.pontuacaotime2();
                    partida.inicializador();
                    if (partida.acabarpartida()) {
                        input.close();
                        return;
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
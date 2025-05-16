import java.util.Scanner;

public class Jogador {
    Scanner sc = new Scanner(System.in);
    String nome;
    int vida;
    String nome2;
    int vida2;

    public Jogador(String nome, int vida, String nome2, int vida2) {
        this.nome = nome;
        this.vida = vida;
        this.nome2 = nome2;
        this.vida2 = vida2;
    }

    public void perdervida() {
        int tiro = (int) Math.round(1 + Math.random() * 5);
        int jogada = (int) Math.round(1 + Math.random() * 5);
        if (jogada == tiro) {
            vida--;
            System.out.println("\nVocê levou um tiro! Sua vida agora é: " + vida);
        } else {
            System.out.println("\nNão tinha bala! Sua vida ainda é: " + vida);
        }
    }

    public void inicializador() {
        System.out.println("1 - *atirar em você* ");
        System.out.println("2 - *atirar no adversário* ");
    }

    public void atirar() {
        int tiro = (int) Math.round(1 + Math.random() * 5);
        int jogada = (int) Math.round(1 + Math.random() * 5);
        if (jogada == tiro) {
            vida2--;
            System.out.println("\nO adversário levou um tiro! A vida dele agora é: " + vida2);
        } else {
            System.out.println("\nNão tinha bala! A vida de "+ nome2 + " ainda é: " + vida2);
        }
    }

    public boolean acabarjogo() {
        if (vida2 == 0 || vida == 0) {
            System.out.println("\nFIM DE JOGO!!!");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Jogador partida = new Jogador("nome", 3, "Lipe", 3);

        System.out.println("*** JOGO ROLETA RUSSA ***");
        System.out.print("Qual o seu nome? ");
        partida.nome = input.nextLine(); 
        System.out.println("Boa sorte, " + partida.nome + "! Você vai enfrentar " + partida.nome2);
        partida.inicializador();

        while (true) {
            System.out.print("Qual ação deseja fazer? ");
            int i = input.nextInt();

            switch (i) {
                case 1:
                    partida.perdervida();
                    break;
                case 2:
                    partida.atirar();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            if (partida.acabarjogo()) {
                input.close();
                return;
            }

            partida.inicializador();
        }
    }
}
import java.util.Scanner;

public class Carro {
    Scanner sc = new Scanner(System.in);
    String marca;
    String modelo;
    int anof;
    String cor;
    int velocidadeAtual;

    public Carro(String marca, String modelo, int anof, String cor, int velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.anof = anof;
        this.cor = cor;
        this.velocidadeAtual = velocidadeAtual;
    }

    public void inicializador() {
        System.out.println("\n Acelerar - 1");
        System.out.println(" Frear - 2");
        System.out.println(" Ver detalhes - 3");
        System.out.println(" Sair - 4");

        System.out.print("> ");
    }

    public void exibirDetalhes() {
        System.out.println("\nA marca do carro é: "+ marca);
        System.out.println("O modelo do carro é: "+ modelo);
        System.out.println("O ano de fabricação é: "+ anof);
        System.out.println("A cor do carro é: "+ cor);
    }

    public void acelerar(int aumentar) {
        this.velocidadeAtual += aumentar;
        System.out.println("*** ACELERANDO ***");
        if (this.velocidadeAtual > 200) {
            System.out.println("\n*** A velocidade maxima do carro é 200km/h ***");
            this.velocidadeAtual = 200;
        }
        System.out.println("Velocidade: "+ velocidadeAtual + "km/h");
    }

    public void frear(int diminuir) {
        this.velocidadeAtual -= diminuir;
        if (this.velocidadeAtual < 0) {
            this.velocidadeAtual = 0;
        }
        System.out.println("\n*** FREIANDO ****");
        System.out.println("Velocidade: "+ velocidadeAtual + "km/h");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro meuCarro = new Carro("Honda", "Civic", 2005, "Preto", 0);
        boolean ligado = true;

        System.out.println("\nBEM-VINDO AO SIMULADOR DE CARRO");
       
        while (ligado){
            meuCarro.inicializador();
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                System.out.println("Quanto você deseja acelerar? ");
                int acelerar = scanner.nextInt();
                meuCarro.acelerar(acelerar);
                break;

                case 2:
                System.out.println("Quanto você deseja frear? ");
                int frear = scanner.nextInt();
                meuCarro.frear(frear);
                break;

                case 3:
                meuCarro.exibirDetalhes();
                break;

                case 4:
                System.out.println("Desligando o carro...");
                ligado = false;
                break;

                default:
                    System.out.println("Opção não existe. Tente de novo.");
            }
        }
        scanner.close();
    }
}


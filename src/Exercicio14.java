import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pernas;

        System.out.print("Quantas pernas o animal tem: ");
        pernas = sc.nextInt();

        switch (pernas) {
            case 1: 
                System.out.println("tipo do animal: Saci");
                break;
                case 2: 
                System.out.println("tipo do animal: Bípede");
                break;
                case 4: 
                System.out.println("tipo do animal: Quadrupede");
                break;
                case 6, 8: 
                System.out.println("tipo do animal: Aranha");
                break;
        
            default:
            System.out.println("Tipo: ET");
        } sc.close();
    }
}

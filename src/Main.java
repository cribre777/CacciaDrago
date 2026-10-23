import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner inTastiera = new Scanner(System.in);
        System.out.println("Inserisci il numero di battiti di ali: ");
        int num_battiti = inTastiera.nextInt();

        Thread Drago1 = new Thread(new Drago(num_battiti,"Argo"));
        Drago1.start();

        for ( int i = 0; i <= 5; i++) {
            System.out.println("main continua a fare cose .. i = " + i);
        }
    }
}
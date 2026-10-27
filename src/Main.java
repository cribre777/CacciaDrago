import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inTastiera = new Scanner(System.in);

        System.out.print("Inserisci il numero di battiti di ali: ");
        int numBattiti = inTastiera.nextInt();


        Thread threadDrago = new Thread(new Drago(numBattiti, "Argo"));
        threadDrago.start();


        Cavalliere cacciatore = new Cavalliere();


        for (int i = 0; i < numBattiti; i++) {
            System.out.println("main sta osservando il drago... " + (i + 1));

            try {

                Thread.sleep(600);
            } catch (InterruptedException e) {
                System.out.println("Osservazione interrotta.");
            }

            if (i == numBattiti / 2) {
                cacciatore.colpisciDrago(threadDrago);
            }
        }

        inTastiera.close();
    }
}
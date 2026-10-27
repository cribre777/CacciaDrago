public class Drago implements Runnable {
    private String nome;
    private int numBattiti;

    public Drago(int numBattiti, String nome) {
        this.nome = nome;
        this.numBattiti = numBattiti;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < numBattiti; i++) {
                System.out.println(this.nome + " si libera nell'aria! Battito ali " + (i + 1));

                Thread.sleep(1200);
            }
            System.out.println(this.nome + " ha completato il volo ed è atterrato sano e salvo.");
        } catch (InterruptedException e) {

            System.out.println("-> " + this.nome + " È STATO COLPITO ED È MORTO DEFINITIVAMENTE! <-");
        }
    }
}

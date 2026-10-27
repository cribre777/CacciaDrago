public class Cavalliere {

    public void colpisciDrago(Thread drago) {
        System.out.println("\n[!] IL CACCIATORE SCAGLIA UNA FRECCIA! [!]\n");
        drago.interrupt(); // Interrompe l'esecuzione del thread del drago
    }
}

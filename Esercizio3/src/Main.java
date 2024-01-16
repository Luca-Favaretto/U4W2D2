import it.epicode.be.Rubrica;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esercizio3");

        Rubrica rubrica = new Rubrica();
        rubrica.newContatto("Chiara", "345");
        rubrica.newContatto("Marta", "456");
        rubrica.newContatto("Luca", "789");

        // Stampa dei contatti prima della cancellazione
        System.out.println("Contatti prima della cancellazione:");
        rubrica.stampaContatti();

        // Cancellazione di un contatto
        rubrica.deleteContatto("Chiara");

        // Stampa dei contatti dopo la cancellazione di Chiara
        System.out.println("\nContatti dopo la cancellazione di Chiara:");
        rubrica.stampaContatti();

        // Ricerca tramite nome
        System.out.println("\nRicerca tramite nome (Marta):");
        rubrica.ricercaTramiteNome("Marta");

        // Ricerca tramite numero
        System.out.println("\nRicerca tramite numero (456):");
        rubrica.ricercaTramiteNumero("456");

        // Stampa finale dei contatti
        System.out.println("\nContatti finali:");
        rubrica.stampaContatti();
    }

}
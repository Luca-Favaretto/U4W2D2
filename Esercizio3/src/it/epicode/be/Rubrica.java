package it.epicode.be;

import java.util.HashMap;
import java.util.Map;

public class Rubrica {
    private final HashMap<String, String> contatti;


    public Rubrica() {

        this.contatti = new HashMap<>();
    }

    public void newContatto(String chiave, String valore) {
        this.contatti.put(chiave, valore);
    }

    public void deleteContatto(String chiave) {
        this.contatti.remove(chiave);
    }

    public void ricercaTramiteNome(String chiave) {
        String nome = this.contatti.get(chiave);
        System.out.println(!nome.isEmpty() ? nome : "Contatto non trovato");
    }

    public void ricercaTramiteNumero(String valore) {
        String result = "";
        for (String name : contatti.keySet()) {
            if (valore.equals(contatti.get(name))) {
                result = name;
            }
        }
        System.out.println(!result.isEmpty() ? result : "Contatto non trovato");

    }

    public void stampaContatti() {
        System.out.println("Contatti nella rubrica:");
        for (Map.Entry<String, String> entry : contatti.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", Numero: " + entry.getValue());
        }
    }


}


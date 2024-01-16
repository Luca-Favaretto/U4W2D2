import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esercizio2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero che generata tot numero casuali");
        int numElem = Integer.parseInt(scanner.nextLine());
        List<Integer> rdnList = new ArrayList<>();

        for (int i = 0; i < numElem; i++) {
            Random rdn = new Random();
            rdnList.add(rdn.nextInt(101));
        }

        List<Integer> rdnListInv = inverso(rdnList);

        System.out.println("Lista originale:");
        for (int rdn : rdnList) {
            System.out.println(rdn);
        }

        System.out.println("Lista invertita:");
        for (int rdn : rdnListInv) {
            System.out.println(rdn);
        }


        System.out.println("Inserisci true per valori pari e false per valori dispari");
        boolean bool = Boolean.parseBoolean(scanner.nextLine());

        pariDispari(rdnList, bool);
        scanner.close();
    }

    static List<Integer> inverso(List<Integer> rdnList) {
        return new ArrayList<>(rdnList).reversed();
//        List<Integer> rdnListInv = new ArrayList<>();
//
//        for (Integer rdn : rdnList) {
//            rdnListInv.addFirst(rdn);
//        }
//        return rdnListInv;
    }

    static void pariDispari(List<Integer> rdnList, boolean bool) {
        String str = bool ? "Boleana true e restituzione di valori pari" : "Boleana false e restituzione di valori dispari";
        System.out.println(str);
        for (Integer num : rdnList) {
            if (bool) {
                if (num % 2 == 0) {
                    System.out.println(num);
                }
            } else {
                if (num % 2 != 0) {
                    System.out.println(num);
                }

            }


        }
    }
}
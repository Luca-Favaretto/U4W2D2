import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Esercizio 1");
        Scanner scanner= new Scanner(System.in);
        try{

            System.out.println("Quanti parole vuoi inserire?");
            int n = Integer.parseInt(scanner.nextLine());
            Set<String> paroleDistinte = new HashSet<>();
            Set<String> paroleDuplicate = new HashSet<>();

            for (int i=0; i<n;i++){
                System.out.println("Alla posizione "+(i+1)+ " che parola vuoi inserire");
                String str= scanner.nextLine();
                boolean bool=paroleDistinte.add(str);
                if(!bool){
                    paroleDuplicate.add(str);

                }
            }
            System.out.println("Le parole duplicate sono :"+paroleDuplicate);
            System.out.println("Le parole distinte sono :"+paroleDistinte.size());
            System.out.println("Le parole distinte sono :"+paroleDistinte);


        }catch (Exception e){
            System.out.println("L'errore è"+ e);
        }finally {
            scanner.close();
        }
    }

}
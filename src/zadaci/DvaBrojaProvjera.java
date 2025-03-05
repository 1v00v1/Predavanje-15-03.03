package zadaci;
//TODO nastavljamo dalje sa izvršavanjem programa
// Kreiraį program, korisnik unosi 2 broja, ispis je zbroj.
// Ispisati korisniku poruku ukoliko nije unešen broj.
import java.util.Scanner;

public class DvaBrojaProvjera {

 static void zbroj(){
     Scanner s= new Scanner(System.in);
    int a = provjera(s);
    int b = provjera(s);

    System.out.println("Zbroj brojeva je: "+(a+b));
    s.close();
}
    static int provjera(Scanner s){

        boolean izlaz =true;
        int temp =0;
        do {
            System.out.print("Unesite cjelobrojni broj: ");
            try {
                temp = Integer.parseInt(s.nextLine());
                izlaz = false;

            } catch (Exception e) {
                System.out.println("Nepravilan unos. Pokušajte ponovo");

            }

        }while (izlaz);

        return temp;
    }
}


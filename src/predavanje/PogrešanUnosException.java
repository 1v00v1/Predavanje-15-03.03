package predavanje;

import java.util.Scanner;

public class PogrešanUnosException {

Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        int broj;
        String unos = "234d";

        try {
            broj = new Integer(unos);
        } catch (NumberFormatException e) {
            System.out.println("Unijeli ste pogrešan unos.");
            System.out.println("Postavljamo unosu vrijednost 1.");
            broj = 1;

        }

// nastavljamo dalje sa izvršavanjem programa
    }
}
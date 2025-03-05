package predavanje;

import java.util.ArrayList;

public class NedostatakMemorijeIznimka {

    public static void main(String[] args) {


        try {
            ArrayList<String> znakovniNizovi = new ArrayList<String>();

            while (true) {
                znakovniNizovi.add("Novi znakovni niz");

            }

        } catch (OutOfMemoryError e) {
            System.out.println(e.getMessage());

        }

    }
}
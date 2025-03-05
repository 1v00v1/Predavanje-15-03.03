package predavanje;

import zadaci.DvaBrojaProvjera;

public class Main {
    public static void main(String[] args) {


       int prviBroj =7;
       int drugiBroj =0;
       try {
           int rez = prviBroj /drugiBroj;
           System.out.println("Rezultat iznosi :"+rez);
       } catch (Throwable e) {
           System.out.println("Dogodila se iznimka: "+e.getMessage());
       }finally {
          System.out.println("Kalkuliranje je gotovo.");
       }
        System.out.println("izvršavanje programa završeno");


    }

}
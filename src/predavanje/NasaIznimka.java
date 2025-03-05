package predavanje;

public class NasaIznimka {
    public static void main(String[] args) {

        try {
            double rezultat = izračunajKorjen(-2);
            System.out.println(rezultat);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static double izračunajKorjen(double i) throws MojaIznimka {
        if(i<0){
           throw new MojaIznimka("Broj ne smije biti negativan","dsad");

        }
        return Math.sqrt(i);
    }
}
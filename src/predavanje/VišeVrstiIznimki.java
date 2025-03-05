package predavanje;

public class VišeVrstiIznimki {


    public static void main(String[] args) {
        int broj ;
        String unos = "234";
        int[] polje = {1,2,3};

        try {
            // 1. greška
            broj = Integer.parseInt(unos);
            // 2. greška
            broj = polje[2];
            // 3. greška
            broj = broj / 2;
        }
        catch (NumberFormatException e) {
            System.out.println("Greška pri konverziji znakovnog niza u broj");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Greška pri pristupu elementu iz polja");
        }
        catch (Exception e) {
            System.out.println("Sve ostale greške."+e.getMessage());

        }

        System.out.println("Završetak programa.");
    }
}
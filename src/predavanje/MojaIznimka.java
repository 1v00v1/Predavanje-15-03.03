package predavanje;

public class MojaIznimka extends Exception{
    private String korisnik;

    public MojaIznimka() {
    }

    public String getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(String korisnik) {
        this.korisnik = korisnik;
    }

    public MojaIznimka(String message, String korisnik) {
        super(message);
        this.korisnik = korisnik;
    }


}

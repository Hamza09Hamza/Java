package Exo1;

public class BandeDessine extends Livre {
    private String Date;

    BandeDessine(String Titre, String Auteur, int numPages, String Date) {
        super(Titre, Auteur, numPages);
        this.Date = Date;
    }

}

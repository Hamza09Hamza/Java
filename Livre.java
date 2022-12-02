package Exo1;

public class Livre extends Media {
    private String Auteur;
    private int numPages;

    Livre(String Titre, String Auteur, int numPages) {
        super(Titre);
        this.Auteur = Auteur;
        this.numPages = numPages;
    }

    @Override
    void Afficher() {
        super.Afficher();
        System.out.println(this.Auteur);
        System.out.println(this.numPages);
    }

}

package Exo1;

public class Manga extends Livre {
    private String Hero;

    Manga(String Titre, String Auteur, int numPages, String Hero) {
        super(Titre, Auteur, numPages);
        this.Hero = Hero;
    }

}

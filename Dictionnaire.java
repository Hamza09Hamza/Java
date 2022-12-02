package Exo1;

public class Dictionnaire extends Media {
    private String langue;
    private int numTomes;

    Dictionnaire(String Titre, String langue, int numTomes) {
        super(Titre);
        this.langue = langue;
        this.numTomes = numTomes;
    }

    @Override
    void Afficher() {
        super.Afficher();
        System.out.println(this.langue);
        System.out.println(this.numTomes);
    }

}

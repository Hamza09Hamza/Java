package ExoAbstraction;

public class Secretaire extends Personne {

    private String numBureau;
    private static int nbSecret = 0;

    Secretaire(String nom, String prenom, String rue, String ville, String numbureau) {
        super(nom, prenom, rue, ville);
        this.numBureau = numbureau;
        nbSecret++;
    }

    public String toString() {
        return super.toString() + " " + this.numBureau;
    }

    void ecrirePersonne() {
        System.out.println(toString());
    }

    @Override
    void modifierPersonne(String rue, String ville) {
        super.modifierPersonne(rue, ville);
        ecrirePersonne();
    }

    static int nbSecret() {
        return nbSecret;
    }
}

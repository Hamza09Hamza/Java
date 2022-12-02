package ExoAbstraction;

public class Etudiant extends Personne {
    private String DiplomeEncour;
    private static int numEtudiant;

    Etudiant(String nom, String prenom, String rue, String ville, String DiplomeEncour) {
        super(nom, prenom, rue, ville);
        this.DiplomeEncour = DiplomeEncour;
        numEtudiant++;
    }

    public String toString() {
        return super.toString() + " " + this.DiplomeEncour;
    }

    @Override
    void ecrirePersonne() {
        System.out.println(toString());
    }

    static int numEtudiant() {
        return numEtudiant;
    }
}

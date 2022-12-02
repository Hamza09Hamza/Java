package ExoAbstraction;

class Enseignant extends Personne {

    private String Spec;
    private static int numEnseignants;

    Enseignant(String nom, String prenom, String rue, String ville, String Spec) {
        super(nom, prenom, rue, ville);
        this.Spec = Spec;
        numEnseignants++;
    }

    public String toString() {
        return super.toString() + " " + this.Spec;
    }

    @Override
    void ecrirePersonne() {
        System.out.println(toString());
    }

    static int numEnseignants() {
        return numEnseignants;
    }

}
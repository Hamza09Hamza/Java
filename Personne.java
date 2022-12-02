package ExoAbstraction;

public abstract class Personne {
    protected String nom, prenom, rue, ville;
    protected static int nbPersonne;

    Personne(String nom, String prenom, String rue, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.rue = rue;
        this.ville = ville;
        nbPersonne++;
    }

    public String toString() {
        return this.nom + " " + this.prenom + " " + this.rue + " " + this.ville;
    }

    static void nbPersonne() {
        System.out.println(nbPersonne);
    }

    abstract void ecrirePersonne();

    void modifierPersonne(String rue, String ville) {
        this.rue = rue;
        this.ville = ville;
    }

}

package ExoInterfaces;

public class AA extends A {
    String nom;

    void incrementer() {
        taille++;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.nom;
    }
}

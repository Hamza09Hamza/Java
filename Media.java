package Exo1;

class Media {
    private String Titre;
    private int numero;
    static int id = -1;

    Media(String Titre) {
        this.Titre = Titre;
        this.numero = id + 1;
    }

    String getTitre() {
        return this.Titre;
    }

    int getNumero() {
        return this.numero;
    }

    void Afficher() {
        System.out.println(this.Titre);
        System.out.println(this.numero);
    }

    Boolean plusPetit(Media doc) {
        if (this.numero < doc.numero) {
            return true;
        } else {
            return false;
        }

    }
}
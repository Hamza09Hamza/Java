package Exo1;

class DictionnaireBilingue extends Dictionnaire {
    private String deuxiemeLangue;

    DictionnaireBilingue(String Titre, String langue, int numTomes, String deuxiemeLangue) {
        super(Titre, langue, numTomes);
        this.deuxiemeLangue = deuxiemeLangue;
    }

}
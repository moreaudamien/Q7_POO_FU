/*  vas créer une classe pour représenter de façon la plus fidèle possible tes camarades !

Crée une classe Wilder
Ajoute les attributs String firstname et boolean aware
Crée un constructeur permettant d'initialiser firstname et aware
Ajoute des getters et setters pour tous les attributs, en respectant les conventions
Ajoute une méthode whoAmI() retournant le texte "Je m'appelle firstname et je suis aware" ou "Je m'appelle firstname et je ne suis pas aware", en fonction de l'état des attributs firstname et aware */

//Classe Wilder

class Wilder {

    // attributs
    private String firstname;
    private boolean aware;

    // constructeur
    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    // getters et setters
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isAware() {
        return this.aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI() {
        if (this.aware) {
            return "Je m'appelle " + firstname + " et je suis aware";
        } else {
            return "Je m'appelle " + firstname + " et je ne suis pas aware";
        }
    }
}
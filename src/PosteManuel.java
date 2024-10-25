public class PosteManuel extends Poste{
    private boolean ouvert;

    public PosteManuel(int numPoste) {
        super(numPoste);
        ouvert = false; 
    }

    public void ouvrir() {
        this.ouvert = true;
    }

    public void fermer() {
        this.ouvert = false;
    }

    public boolean isOuvert() {
        return ouvert;
    }

    @Override
    public String toString() {
        return "Poste n°"+getNumPoste()+" : Manuel - " + (ouvert ? "Ouvert" : "Fermé");
    }
}

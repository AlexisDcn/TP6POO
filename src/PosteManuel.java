public class PosteManuel extends Poste{
    private boolean ouvert;

    public PosteManuel(int numPoste) {
        super(numPoste);
        ouvert = false; 
    }

    @Override
    public String toString() {
        return "Poste n°"+getNumPoste()+" : Manuel - " + (ouvert ? "Ouvert" : "Fermé");
    }
}

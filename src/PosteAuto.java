public class PosteAuto extends Poste{

    public PosteAuto(int numPoste) {
        super(numPoste);
    }

    @Override
    public String toString() {
        return "Poste n°"+getNumPoste()+" : Automatique";
    }

}

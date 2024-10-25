public class Poste {
    private int numPoste;
    private Carburant carburant;
    private double quantiteCarburantServie = 0.0;
    private double prixAuLitre = 0.0;
    private double prixTotal = 0.0;

    public Poste(int numPoste) {
        this.numPoste = numPoste;
    }

    public void setCompteur(double quantiteCarburantServie,double prixAuLitre) {
        this.quantiteCarburantServie = quantiteCarburantServie;
        this.prixAuLitre = prixAuLitre;
        this.prixTotal = quantiteCarburantServie * prixAuLitre;
    }
    
    
    public int getNumPoste() {
        return numPoste;
    }

    @Override
    public String toString() {
        return "Poste{" +
                "numPoste=" + numPoste +
                ", carburant=" + carburant +"\n"+
                ", quantiteCarburantServie=" + quantiteCarburantServie +"\n"+
                ", prixAuLitre=" + prixAuLitre +"\n"+
                ", prixTotal=" + prixTotal +
                '}';
    }
}

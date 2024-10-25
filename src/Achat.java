import java.util.Date;
public class Achat {
    private Date date;
    private int posteUtilise;
    private Carburant carburant;
    private double quantiteCarburantServie;
    private double prixAuLitre;
    private double prixPaye;
    

    public Achat(int posteUtilise, Carburant carburant, double quantiteCarburantServie, double prixAuLitre) {
        this.date = new Date(); // current date;
        this.posteUtilise = posteUtilise;
        this.carburant = carburant;
        this.quantiteCarburantServie = quantiteCarburantServie;
        this.prixAuLitre = prixAuLitre;
        this.prixPaye = quantiteCarburantServie * prixAuLitre;
    }

    @Override
    public String toString() {
        return "Achat : " + date + 
               " Poste : " + posteUtilise + 
               " Carburant : " + carburant +"\n"+
               " quantite de carburant : " + quantiteCarburantServie + "\n"+
               " prix au litre : " + prixAuLitre + "\n"+
               " prix total : " + prixPaye + " euros";
    }
}

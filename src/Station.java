import java.util.ArrayList;
import java.util.EnumMap;

public class Station {
    private boolean ouvert;
    private EnumMap<Carburant, Double> prixCarburants;
    private ArrayList<Poste> postes;
    private ArrayList<Achat> achats;
    private EnumMap<Carburant, Citerne> citernes;
    private double prixGazole;
    private double prixSP95;
    private double prixSP98;

    public Station() {
        this.ouvert = false;
        this.prixCarburants = new EnumMap<>(Carburant.class);
        this.postes = new ArrayList<>();
        this.achats = new ArrayList<>();
        this.citernes = new EnumMap<>(Carburant.class);
    }

    public void ajouterPoste(Poste poste) {
        postes.add(poste);
    }


    public void ajouterCiterne(Citerne citerne) {
        citernes.put(citerne.getCarburant(), citerne);
    }

        public void ouvrir(double prixGazole, double prixSP95, double prixSP98) {
            this.ouvert = true;
            prixCarburants.put(Carburant.Gazole, prixGazole);
            prixCarburants.put(Carburant.SP95, prixSP95);   
            prixCarburants.put(Carburant.SP98, prixSP98);
            achats.clear();

            for (Poste poste : postes) {
                if (poste instanceof PosteManuel) {
                    ((PosteManuel) poste).ouvrir();
                }
            }

    }

    public void fermer() {
        this.ouvert = false;
    }

    

}

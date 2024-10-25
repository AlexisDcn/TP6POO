public class Citerne {
    private int niveauAlerte = 1000;
    private int niveauMin = 500;
    private int niveauActuel;
    private Carburant carburant;

    public Citerne(Carburant carburant,int niveauActuel) {
        this.carburant = carburant;
        this.niveauActuel = niveauActuel;
    }

    public Carburant getCarburant() {
        return carburant;
    }

    

    public int getNiveauAlerte() {
        return niveauAlerte;
    }

    public int getNiveauMin() {
        return niveauMin;
    }

    public int getNiveauActuel() {
        return niveauActuel;
    }

    public int setNiveauActuel(int niveauActuel) {
        this.niveauActuel = niveauActuel;
        return niveauActuel;
    }

    @Override
    public String toString() {
        return "Citerne de " +carburant+"\n"+"Niveau Actuel : " + niveauActuel+" / Niveau d'Alerte : "+niveauAlerte+" / Niveau Minimum : "+niveauMin;
    }
}

class Main {
    public static void main(String[] args) {
      System.out.println("--- Station service Servisol ");
      
      // PosteAuto poste1 = new PosteAuto(1);
      // PosteManuel poste2 = new PosteManuel(2);
      // PosteManuel poste3 = new PosteManuel(3);
      
      // System.out.println(poste1);
      // System.out.println(poste2);
      // System.out.println(poste3);

      // Achat achat1 = new Achat( 1,  Carburant.Gazole, 20, 2.89);
      // System.out.println(achat1);

      // Citerne citerne1 = new Citerne(Carburant.Gazole,10000);
      // System.out.println(citerne1);

      Station station = new Station();

      station.ajouterPoste(new PosteAuto(1));
      station.ajouterPoste(new PosteManuel(2));
      station.ajouterPoste(new PosteManuel(3));
      station.ajouterPoste(new PosteManuel(4));

      station.ajouterCiterne(new Citerne(Carburant.Gazole,0));
      station.ajouterCiterne(new Citerne(Carburant.SP95,0));
      station.ajouterCiterne(new Citerne(Carburant.SP98,0));

      System.out.println(station);
    }
  }
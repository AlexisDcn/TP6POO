class Main {
    public static void main(String[] args) {
      System.out.println("--- Station service Servisol ");
      
      PosteAuto poste1 = new PosteAuto(1);
      PosteManuel poste2 = new PosteManuel(2);
      PosteManuel poste3 = new PosteManuel(3);
      
      System.out.println(poste1.toString());
      System.out.println(poste2.toString());
      System.out.println(poste3.toString());

      Achat achat1 = new Achat( 1,  Carburant.Gazole, 20, 2.89);
      System.out.println(achat1);
    }
  }
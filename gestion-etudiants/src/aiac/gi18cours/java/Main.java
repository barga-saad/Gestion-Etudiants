package aiac.gi18cours.java;

public class Main {
  public static void main(String[] args) {
    Etudiant e1 = new Etudiant(1, "hamid");
    Etudiant e2 = new Etudiant(2, "driss");
    Etudiant e3 = new Etudiant(1, "youssef");
    
    e1.note = 15;
    e2.note = 12;
    e3.note = 16;
    
    ListEtudiants mesEtudiants = new ListEtudiants();
    mesEtudiants.add(e1);
    mesEtudiants.add(e2);
    mesEtudiants.add(e3);
    
    System.out.println(mesEtudiants);
    Collections.sort(mesEtudiants);
    System.out.println(mesEtudiants);
    
    List<Etudiant> filtered = mesEtudiants.filtrer(new Condition() {
      public boolean estVrai(Etudiant e) {
        return e.note > 13;
      }
    });
    System.out.println(filtered);
  }
}

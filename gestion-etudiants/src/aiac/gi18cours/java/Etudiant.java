class Etudiant implements Comparable<Etudiant> {
  private int id;
  private String nom;
  private double note;
  
  public Etudiant(int id, String nom) {
    this.id = id;
    this.nom = nom;
    this.note = 10;
  }
  
  public String toString() {
    return nom + " : " + note;
  }
  
  public boolean equals(Object obj) {
    if (obj == null) return false;
    if (obj == this) return true;
    if (!(obj instanceof Etudiant)) return false;
    Etudiant etu = (Etudiant) obj;
    return etu.id == this.id;
  }
  
  public int compareTo(Etudiant e) {
    if (this.note > e.note) return 1;
    else if (this.note < e.note) return -1;
    else return 0;
  }
}

class ListEtudiants extends ArrayList<Etudiant> {
  public boolean add(Etudiant e) {
    for (Etudiant etu : this) {
      if (etu.equals(e)) {
        int index = this.indexOf(etu);
        this.set(index, e);
        return true;
      }
    }
    return super.add(e);
  }
  
  public List<Etudiant> filtrer(Condition c) {
    List<Etudiant> filtered = new ArrayList<>();
    for (Etudiant etu : this) {
      if (c.estVrai(etu)) {
        filtered.add(etu);
      }
    }
    return filtered;
  }
}

interface Condition {
  public boolean estVrai(Etudiant e);
}
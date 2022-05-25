package aiac.gi18cours.java;

public class Etudiant implements Comparable<Etudiant> {
	private int id;
	private String nom;
	private double note;
	public Etudiant(int A, String name){
		this.id=A;
		this.note=10.0;
		this.nom=name;
	}
	public String toString() {
		return "("+this.nom + ":"+ this.note+")";
	}
	public boolean equals(Object obj) {
		if (! (obj instanceof Etudiant) ){
			return false;
		}
	return	((Etudiant)obj).id==this.id;
	}
	public boolean compareTo(Etudiant e) {
		
		if(this.note > e.note ) return true;
		if(this.note < e.note) return false;
	}
}
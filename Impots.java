package EXO4;

import java.util.ArrayList;

public class Impots {

private int annee;
private double totalImpot;
Societe Societe;
ArrayList <Dossier>dossiers=new ArrayList<>();
public ArrayList<Dossier> getDossiers() {
	return dossiers;
}
public int getAnnee() {
	return annee;
}
public void setAnnee(int annee) {
	this.annee = annee;
}
public double getTotalImpot() {
	return totalImpot;
}

public void setTotalImpot() {
	for(Dossier d:dossiers) {
		d.calculerMontant();
		totalImpot=totalImpot+d.getMontant();}
}
public void setSociete(Societe societe) {
	Societe = societe;
}
public Impots(int annee) {
	this.annee = annee;
}
public Impots() {
	
}
public void add(Dossier d) {
	dossiers.add(d);
}

@Override
	public String toString() {
	setTotalImpot();
		String d="";
		d+="Liste des impots "+annee+"\n";
		for(Dossier b:dossiers)
			d+=b;
		d+="Total = "+totalImpot;
		return d;
	}

}

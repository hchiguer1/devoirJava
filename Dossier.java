package EXO4;


abstract class Dossier {

private long id;
protected double montant;
Impots impots;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public double getMontant() {
	return montant;
}
public void setMontant(double montant) {
	this.montant = montant;
}
public Impots getImpots() {
	return impots;
}
public Dossier(long id) {
	this.id = id;	
}
protected void calculerMontant() {

}

}

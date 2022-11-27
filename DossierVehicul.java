package EXO4;


public class DossierVehicul extends Dossier{

public DossierVehicul(long id,int nbCh,char cat) {
		super(id);
		this.nbChevaux=nbCh;
		this.categorie=cat;
		// TODO Auto-generated constructor stub
	}
private int nbChevaux;
private char categorie;
public int getNbChevaux() {
	return nbChevaux;
}
public void setNbChevaux(int nbChevaux) {
	this.nbChevaux = nbChevaux;
}
public char getCategorie() {
	return categorie;
}
public void setCategorie(char categorie) {
	this.categorie = categorie;
}
@Override
	protected void calculerMontant() {
		// TODO Auto-generated method stub
		if (categorie=='E') {
			if(nbChevaux<8)
				montant=350;
			else if(nbChevaux>=8&&nbChevaux<=10)
				montant=650;
			else if(nbChevaux>=11&&nbChevaux<=14)
				montant=3000;
			else if(nbChevaux>15)
				montant=8000;
		}
		if (categorie=='G') {
			if(nbChevaux<8)
				montant=700;
			else if(nbChevaux>=8&&nbChevaux<=10)
				montant=1500;
			else if(nbChevaux>=11&&nbChevaux<=14)
				montant=6000;
			else if(nbChevaux>=15)
				montant=20000;}
	}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		calculerMontant();
		return "Vehicule "+categorie+" "+nbChevaux+" CH, montant : "+montant+"\n";
	}
}


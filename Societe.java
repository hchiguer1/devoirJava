package EXO4;

import java.util.ArrayList;

public class Societe {

private long id;
private String raison_sociale;
ArrayList <Impots>impot= new ArrayList<>();

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getRaison_sociale() {
	return raison_sociale;
}
public void setRaison_sociale(String raison_sociale) {
	this.raison_sociale = raison_sociale;
}
public Societe(long id, String raison_sociale) {
	this.id = id;
	this.raison_sociale = raison_sociale;
}
public Impots getImpots(int annee) {
	Impots l=new Impots();
	for(Impots m:impot)
		if (m.getAnnee()==annee)	
			l=m;
	return l;
	}


public ArrayList<Impots> getImpot() {
	return impot;
}
public void add(Impots imp) {
	impot.add(imp);
}
@Override
	public String toString() {
		return "Societe : "+id+" - "+raison_sociale;
	}

}

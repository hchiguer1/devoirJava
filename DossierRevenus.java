package EXO4;


public class DossierRevenus extends Dossier{

public DossierRevenus(long id,double ca) {
		super(id);
		this.ca=ca;
		// TODO Auto-generated constructor stub
	}
private double ca;
public double getCa() {
	return ca;
}
public void setCa(double ca) {
	this.ca = ca;
}
@Override
	protected void calculerMontant() {
		// TODO Auto-generated method stub
		montant=ca*(0.15);
	}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		calculerMontant();
		return "15% de revenus "+ca+", Montant : "+montant+"\n";
	}
}


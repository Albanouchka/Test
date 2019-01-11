package packnp.horaire;

public class Date {
	private int jour;
	private int mois;
	private int annee;
	
	public Date(int jour, int mois, int annee) {
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}
	public Date() {
		this( 1, 1, 1900);
	}
	public int getJour() {
		return this.jour;
	}
	public int getMois() {
		return this.mois;
	}
	public int getAnnee() {
		return this.annee;
	}
	public void setJour( int jour) {
		this.jour = jour;
	}
	public void setMois(int mois) {
		this.mois = mois;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
     public boolean before(Date d) {
         return this.getAnnee()<d.getAnnee() 
    	   || (this.getAnnee()==d.getAnnee() 
    	       && ( this.getMois()<d.getMois() 
    	            || (this.getMois()==d.getMois() 
    	                && this.getJour()<d.getJour())));
       }
}
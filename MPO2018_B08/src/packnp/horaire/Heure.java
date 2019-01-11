package packnp.horaire;

public class Heure {
	private int h;
	private int mn;
       
	public Heure(int h, int mn) {
		this.h = h;
		this.mn = mn;
	}
	public Heure() {
		this(0,0);
	}
	public int getHeures() {
		return this.h;
	}
	public int getMinutes() {
		return this.mn;
	}
	public void setHeures(int h) {
		this.h = h;
	}
	public void setMinutes(int mn) {
		this.mn = mn;
	}
	public boolean before(Heure heure) {
		return (this.getHeures()<heure.getHeures() 
                      || (this.getHeures()==heure.getHeures() 
		              && this.getMinutes()<heure.getMinutes()));
	}
}

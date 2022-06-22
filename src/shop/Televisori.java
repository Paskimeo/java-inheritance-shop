package shop;

public class Televisori extends Prodotto {

	//attributi
	double dimensioni;
	boolean smart;
	
	//costruttore
	public Televisori(String nome, String marca, int codice, int prezzo, double iva,double dimensioni,boolean smart) {
		super(nome, marca, codice, prezzo, iva);
		this.dimensioni = dimensioni;
		this.smart = smart;
	}
	
	// inserito get- set
	public double getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(double dimensioni) {
		this.dimensioni = dimensioni;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	//frase finale
		public String toString()
		{
			String tvSmart = "";
				if(smart)
				{
					tvSmart  = "il televisiore da te scelto è smart, costerà di piu";
				}else 
				{
					tvSmart  = "il televisiore da te scelto non è smart";
				}
			
			
			
			return "Il televisore " + super.getNome()	+ " di marca " + super.getMarca() + " con il codice " +
					super.getCodice() + " e delle dimensioni " 	+getDimensioni() + " viene venduto ad un prezzo di " + super.prezzoTotale()
					 + tvSmart;
		}
	
}


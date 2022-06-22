package shop;

public class Cuffie extends Prodotto 
{
	
	//attributi
	String colore;
	boolean wireless;
	
	
	//costruttore
	public Cuffie(String nome, String marca, int codice, int prezzo, double iva, String colore, boolean wireless )
	{
		super(nome, marca, codice, prezzo, iva);
		this.colore = colore;
		this.wireless = wireless;
	
		
		

}
	//get - set
	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	
	//metodi
	public String toString()
	{
		// boolean wireless
		String wireL = "";
			if(wireless)
			{
				wireL  = "le tue cuffie sono wireless";
			}else 
			{
				wireL = "le tue cuffie hanno il cavo";
			}
		
		
		return "le cuffie " + super.getNome()	+ " di marca " + super.getMarca() + " con il codice " +
				super.getCodice() + " di colore " 	+ getColore() + " viene venduto ad un prezzo di " + super.prezzoTotale() + " e " 
				+ wireL ; 
	}
}

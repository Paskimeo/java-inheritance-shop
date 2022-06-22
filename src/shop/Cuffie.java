package shop;

public class Cuffie extends Prodotto 
{
	
	//attributi
	String colore;
	boolean wireless;
	boolean cablate;
	
	//costruttore
	public Cuffie(String nome, String marca, int codice, int prezzo, double iva, String colore, boolean wireless, boolean cablate )
	{
		super(nome, marca, codice, prezzo, iva);
		this.colore = colore;
		this.wireless = wireless;
		this.cablate = wireless;
		
		

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

	public boolean isCablate() {
		return cablate;
	}

	public void setCablate(boolean cablate) {
		this.cablate = cablate;
	}
}

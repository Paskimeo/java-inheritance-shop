package shop;

import java.util.Random;

public class Smarphone extends Prodotto {
	
	//random
	Random rand = new Random();
	
	//attributi
	private String imei;
	private int memory;
	
	//costruttore
	public Smarphone(String nome, String marca, int codice, int prezzo, double iva, int memory) {
		super(nome, marca, codice, prezzo, iva);
		this.memory = memory;
		imei= rand.nextInt(100000000) + "-" + rand.nextInt(1000000)+ "-" + rand.nextInt(10) + "-" + rand.nextInt(100);
	}
	
	
	
	
	
	
	// get set imei e memory
	public String getImei() {
		return imei;
	}


	public void setImei(String imei) {
		this.imei = imei;
	}



	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}


	//metodo
	public String toString()
	{
		return "Il telefono " + super.getNome()	+ " di marca " + super.getMarca() + " con il codice " +
				super.getCodice() + " e IMEI " 	+getImei()	+ " con memoria di Gigabyte  " +
				getMemory() + " viene venduto ad un prezzo di " + super.prezzoTotale();
	}

}

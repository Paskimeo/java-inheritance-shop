package shop;

public class Prodotto {

	//attributi
	private String nome,marca;
	private int codice,prezzo;
	private double iva;
	
	
	//costruttore
	public Prodotto(String nome, String marca, int codice, int prezzo, double iva) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.codice = codice;
		this.prezzo = prezzo;
		this.iva = iva;
	}

	// inserito get e set // IMPORTANTE - l'int codice è solo LETTURA GET
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public int getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}


	public double getIva() {
		return iva;
	}


	public void setIva(int iva) {
		this.iva = iva;
	}


	public int getCodice() {
		return codice;
	}
	
	//metodo
	double prezzoTotale() {
		return prezzo + ((prezzo / 100) * iva);
}
	
}

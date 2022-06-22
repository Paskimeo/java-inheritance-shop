package shop;

public class Catalogo {

	public static void main(String[] args) {
		
		String nome = "dawdaw"; 
		String marca = "dwadaw";
		String colore = "giallo";
	
		
		Smarphone smar = new Smarphone(nome, marca, 03232, 04343, 02323, 04333);
		System.out.println(smar.toString());

		
		Televisori tele = new Televisori(nome, marca, 22, 11, 33,22, true);
		System.out.println(tele.toString());
		
		
		Cuffie cuff = new Cuffie(nome, marca, 33, 23, 23, colore, true);
		System.out.println(cuff.toString());
	}

}

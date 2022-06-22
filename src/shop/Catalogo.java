package shop;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		
		
		//BONUS BONUS
		 Scanner scan = new Scanner(System.in);
		 String conferma;
		
		
		
		
		 
		 
		 boolean finito = false;

		    while (!finito) {
		      System.out.println(
		          "Cosa vuoi comprare ?  1 smartphone, 2 televisore, 3 Cuffie");
		      String scelta = scan.nextLine();
		
		      switch (scelta) {
		        case "1":
		          // inserire smartphone
		          System.out.print("Inserisci nome prodotto:");
		          String prodottoInput = scan.nextLine();
		          
		          System.out.print("Inserisci la marca:");
		          String marcaInput = scan.nextLine();
		          
		          System.out.print("Inserisci il codice:");
		         int codiceInput =Integer.parseInt(scan.nextLine());
		          
		          System.out.print("Inserisci il prezzo:");
		         int prezzoInput =Integer.parseInt(scan.nextLine());
		          
		          System.out.print("Inserisci l'iva:");
		         int  ivaInput =Integer.parseInt(scan.nextLine());
		          
		          System.out.print("Inserisci la memory:");
		         int memoryInput =Integer.parseInt(scan.nextLine());
		          
		          Smarphone smar = new Smarphone (prodottoInput, marcaInput,codiceInput, prezzoInput,ivaInput,   memoryInput);
		  		  System.out.println(smar.toString());
		  		  break;
		  		  
		        case "2":
		        	// inserimento cuffie
		        	 System.out.print("Inserisci nome prodotto:");
			          String prodotto = scan.nextLine();
			          
			          System.out.print("Inserisci la marca:");
			          String marca = scan.nextLine();
			          
			          System.out.print("Inserisci il codice:");
			         int codiceTv =Integer.parseInt(scan.nextLine());
			          
			          System.out.print("Inserisci il prezzo:");
			         int prezzoTv =Integer.parseInt(scan.nextLine());
			          
			          System.out.print("Inserisci l'iva:");
			         int ivaTv =Integer.parseInt(scan.nextLine());
			          
			          System.out.print("Inserisci le dimenisioni: ");
			        double  dimensioniTv =Integer.parseInt(scan.nextLine());
			        

			          System.out.print("desideri che la TV sia smart ? inserisci 1 per lo smart o 2 per no: ");
			          conferma = scan.nextLine();
			          
			          boolean Tv = false;
			          if(conferma.equalsIgnoreCase("si")) {
			        	    Tv = true;
			        	   
			          }else if(conferma.equalsIgnoreCase("no")){
			        	   Tv = false;
			          }
			          
			          Televisori tele = new Televisori(prodotto, marca,codiceTv,prezzoTv, ivaTv,dimensioniTv, Tv);
			          System.out.println(tele.toString());
			          break;
			          
			          
		        case "3":    
		        	 //inserimento cuffie
		        	 System.out.print("Inserisci nome prodotto:");
			          String prodottoCuffie = scan.nextLine();
			          
			          System.out.print("Inserisci la marca:");
			          String marcaCuffie = scan.nextLine();
			          
			          System.out.print("Inserisci il codice:");
			         int codiceCuffie =Integer.parseInt(scan.nextLine());
			          
			          System.out.print("Inserisci il prezzo:");
			         int prezzoCuffie =Integer.parseInt(scan.nextLine());
			          
			          System.out.print("Inserisci l'iva:");
			         int ivaCuffie =Integer.parseInt(scan.nextLine());
			          
			          System.out.print("Inserisci il colore: ");
			          String colore = scan.nextLine();
			        

			          System.out.print("desideri che siano wireless ? inserisci 1 per wireless o 2 per i fili: ");
			          conferma = scan.nextLine();
			          
			          boolean wire = true;
			          if(conferma.equalsIgnoreCase("si")) {
			        	    wire = true;
			        	   
			          }else if(conferma.equalsIgnoreCase("no")){
			        	   wire = false;
			          }
			          
			          Cuffie cuff = new Cuffie(prodottoCuffie, marcaCuffie, codiceCuffie,prezzoCuffie, ivaCuffie, colore, wire);
			  		  System.out.println(cuff.toString());
			  		  break;
		      }
		      
		    }
		    
		    scan.close();
		
		
		
	}

}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		//VERIFICA BASE
		//String nome = "dawdaw"; 
		//String marca = "dwadaw";
		//String colore = "giallo";
	
		
		//Smarphone smar = new Smarphone(nome, marca, 03232, 04343, 02323, 04333);
		//System.out.println(smar.toString());

		
		//Televisori tele = new Televisori(nome, marca, 22, 11, 33,22, true);
		//System.out.println(tele.toString());
		
		
		//Cuffie cuff = new Cuffie(nome, marca, 33, 23, 23, colore, true);
		//System.out.println(cuff.toString());

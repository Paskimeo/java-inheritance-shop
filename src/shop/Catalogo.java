package shop;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		
		
		//BONUS BONUS
		 Scanner scan = new Scanner(System.in);
		 String conferma;
		
		 int numero;
		 boolean finito = false;
		 
		
		 

		    while (!finito) {
		      System.out.println(
		          "Cosa vuoi comprare ?  1 smartphone, 2 televisore, 3 Cuffie, 4 per uscire");
		      String scelta = scan.nextLine();
		
		      switch (scelta) {
		        case "1":
		          // inserire smartphone
		        	System.out.println("inserisci quanti prodotti vuoi inserire:");
		   		 numero = Integer.parseInt(scan.nextLine());
		        	
		   		Prodotto[] prodotti = new Prodotto[numero];
		        	
		        for	(int i = 0; i < numero; i++) {
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
		          prodotti[i] = smar;
		        }
		        for(int i = 0; i < numero; i++) {
		          System.out.println(prodotti[i]);
		          
		        }
		  		  break;
		  		  
		        case "2":
		        	// inserimento TV
		        	System.out.println("inserisci quanti prodotti vuoi inserire:");
			   		 numero = Integer.parseInt(scan.nextLine());
			        	
			   		Prodotto[] prodottiTv = new Prodotto[numero];
			        	
			        for	(int i = 0; i < numero; i++) {
		        	
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
			          prodottiTv[i] = tele;
			        }
			        for(int i = 0; i < numero; i++) {
				          System.out.println(prodottiTv[i]);
				          
				        }
			          break;
			          
			          
		        case "3":    
		        	 //inserimento cuffie
		        	System.out.println("inserisci quanti prodotti vuoi inserire:");
			   		 numero = Integer.parseInt(scan.nextLine());
			        	
			   		Prodotto[] prodottiCuffie = new Prodotto[numero];
			   		
			   	 for	(int i = 0; i < numero; i++) {
		        	
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
			          prodottiCuffie[i] = cuff;
			     }
			        for(int i = 0; i < numero; i++) {
				          System.out.println(prodottiCuffie[i]);
				          
				        }
			  		  break;
			  		  
		        case "4":  
		        	System.out.println("grazie e arrivederci");
		        	finito = true;
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

package ExL2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/* EX1 - RETTANGOLI */
		
		int base;
		int altezza;
		
		Scanner scan = new Scanner(System.in);
		Rettangoli r1 = new Rettangoli(); 
		System.out.print("Inserisci la base del rettangolo: ");
		base = scan.nextInt();
		System.out.print("Inserisci l'altezza del rettangolo: ");
		altezza = scan.nextInt();
		r1.setLati(base, altezza);
		r1.printArea();
		r1.printPerim();
		
		Rettangoli r2 = new Rettangoli(); 
		System.out.print("Inserisci la base del rettangolo: ");
		base = scan.nextInt();
		System.out.print("Inserisci l'altezza del rettangolo: ");
		altezza = scan.nextInt();
		r2.setLati(base, altezza);
		r2.printArea();
		r2.printPerim();
		
		getSomma(r1.getArea(), r2.getArea(), "area");
		getSomma(r1.getPerim(), r2.getPerim(), "perim");    
		
		/* EX2 - SIM CARD GENERATOR */
		
		System.out.println("*** GENERO UNA NUOVA SIM");
		SimCard s1 = new SimCard();
		System.out.println("*** ESPORTO I DATI DELLA SIM:");
		s1.printSimInfo();
		s1.addCredit(5.23);
		s1.addCall(3703253928l, 15);
		s1.addCall(892892l, 5);
		s1.printCalls();			
		
		
		/* EX3 - PRODOTTI CARRELLI E CLIENTI */
		
		Customer c1 = new Customer();
		c1.setCustInfo("Vincenzo M.", "vins@maio.rana", "14/03/2023");
		
		Product p1 = new Product();
		p1.genProd("Sito in JAVA", 5.99, 10);
		
		Product p2 = new Product();
		p2.genProd("Manutenzione DB", 7.20, 10);
		
		Product p3 = new Product();
		p3.genProd("Sito in JAVA", 4.50, 10);
		
		Cart carr1 = new Cart();
		carr1.setCustomer(c1);
		
		carr1.addToCart(p1, 3);
		carr1.addToCart(p2, 2);
		carr1.addToCart(p3, 5);
		
		carr1.printInvoice();		
		
		
	}

	public static void getSomma(int a, int b, String c) {
		String ident;
		if (c == "perim") {
			ident = "del perimetro";
		} else {
			ident = "dell'area";
		}
		System.out.println("La somma " + ident + " è di: " + (a + b));
	}

}

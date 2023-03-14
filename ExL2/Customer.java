package ExL2;

import java.util.Random;

public class Customer {

	private int cid;
	Random rand = new Random();
	private String cname;
	private String cmail;
	private String cdate;
	
	
	public void getCustInfo() {
		System.out.println("Cod. Cl.: " + this.cid);
		System.out.println("Nome: " + this.cname);
		System.out.println("Email: " + this.cmail);
		System.out.println("Cliente da: " + this.cdate);
	}
	
	public void setCustInfo(String nome, String email, String date) {
		this.cname = nome;
		this.cmail = email;
		this.cdate = date;
		this.cid = rand.nextInt(128);
	}

	
}

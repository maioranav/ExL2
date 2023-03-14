package ExL2;

import java.util.Random;

public class Product {
	
	Random rand = new Random();
	
	/* PRODOTTI */
	private long pid;
	private String pdesc;
	private double pprice;
	private int pdisp;
	
	public double getPrice() {
		return this.pprice;
	}
	
	public void genProd(String desc, double price, int disp) {
		this.pid = rand.nextInt(128);
		this.pdesc = desc;
		this.pprice = price;
		this.pdisp = disp;
	}
	
	public void setPrice(double newprice) {
		this.pprice = newprice;
	}
	
	public String getDesc() {
		return this.pdesc;
	}
	
	public long getPID() {
		return this.pid;
	}
	
	public void setDisp(int inCart) {
		if (this.pdisp - inCart < 0) {
			System.out.println("*** NON CI SONO ABBASTANZA GIACENZE DI " + this.pid);
		} else {
		this.pdisp -= inCart;
		}
	}
	
	public int getDisp() {
		return this.pdisp;
	}
	
	
	
}

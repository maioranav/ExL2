package ExL2;

import java.util.ArrayList;

public class Cart {

	private Customer cid;
	private ArrayList<Product> pcart = new ArrayList<Product>();
	private ArrayList<Integer> pqty = new ArrayList<Integer>();
	private double cartPrice;
	
	public void setCustomer(Customer p) {
		this.cid = p;
	}

	public void addToCart(Product a, int qty) {
		this.pcart.add(a);
		a.setDisp(qty);
		this.pqty.add(qty);
		cartPrice += (a.getPrice()*qty);
	}
	
	public void printInvoice() {
		this.cid.getCustInfo();
		for (int i = 0; i < this.pcart.size(); i++) {
			System.out.println(this.pqty.get(i) + "x " + this.pcart.get(i).getPID() + " - " + this.pcart.get(i).getDesc() + " - " + this.pcart.get(i).getPrice() + "€ (disp: " + this.pcart.get(i).getDisp()+ ")");
		}
		System.out.println("Il totale del carrello è di " + this.cartPrice + "€ iva escl.");
	}

}

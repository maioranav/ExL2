package ExL2;

public class Rettangoli {

	private int base;
	private int altezza;
	private int area;
	private int perim;
	
	public void setLati(int a, int b) {
		this.base = a;
		this.altezza = b;
	}
	
	public void printArea() {
		this.area = base * altezza;
		System.out.println("L'area del rettangolo è: " + this.area);
	}
	
	public void printPerim() {
		this.perim = (base + altezza)*2;
		System.out.println("Il perimetro del rettangolo è: " + this.perim);
	}
	
	public int getArea() {
		return this.area;
	}
	
	public int getPerim() {
		return this.perim;
	}

	
}

package ExL2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SimCard {
	Random rand = new Random();
 private long simno = generateRandomNo();
 private double credit = 0.00d;
 private ArrayList<Long> calls = new ArrayList<Long>();
 private ArrayList<Integer> durations = new ArrayList<Integer>();
 
 public long generateRandomNo() {
	 long prefix = 3703000000l;
	 long int_random = rand.nextInt(999999);
	 System.out.println(int_random);
	 return (long) (prefix + int_random);
 }
 
 public void printSimInfo() {
	 System.out.println("SIM NO: " + this.simno);
	 System.out.println("SIM CREDIT: " + this.credit + "€");
 }
 
 public void addCredit(double add) {
	 this.credit += add;
	 System.out.println("NEW SIM CREDIT: " + this.credit + "€");
 }
 
 public void addCall(long no, int min) {
	 this.calls.add(no);
	 this.durations.add(min);
 }
 
 public void printCalls() {
	 for (int i = 0; i < this.calls.size(); i++) {
		 System.out.println("La chiamata a " + this.calls.get(i) + " è durata " + this.durations.get(i) + " minuti.");
	 }
 }

 
}

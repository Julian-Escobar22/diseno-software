package aplicacionAutor;

public class Cuenta {
	private String id; 
	private String name; 
	private int balance = 0; 
	
	public Cuenta() {
		// TODO Auto-generated constructor stub
	}
	 public Cuenta(String id,String name) {
		 this.id = id; 
		 this.name = name; 
	 }
	 
	 public Cuenta(String id, String name, int balance) {
		 this.id = id;
		 this.name = name; 
		 this.balance =balance; 
	 }
	 
	 public String getID() {
		 return id; 
	 }
	 
	 public String getName() {
		 return name;  
	 }
	 
	 public int getBalance() {
		 return balance; 
	 }
	 
	 public int credit(int amount) {
		 balance += amount; 
		 return balance; 
	 }
	 
	 public int debit(int amount) {
		 if (amount<= balance) {
			 balance -= amount ; 
		 } else {
			System.out.println(" el monto excede el balance ");
	 }
			return balance ; 

	 
	}
	 
	 public int transferTo(Cuenta another, int amount) {
	     if (amount <= balance) {
	         balance -= amount;
	         another.balance += amount;
	     } else {
	         System.out.println("El monto excede el balance.");
	     }
	     return balance;
	 
	 
	}
	 @Override 
	 
	 public String toString() {
		 
		 return "La cuenta " +  id + " Del propietario: " + name + " tiene un balance de:" + balance + " pesos"; 
	 }
}

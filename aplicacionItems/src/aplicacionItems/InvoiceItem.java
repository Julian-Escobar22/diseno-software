package aplicacionItems;

public class InvoiceItem {
	private String id; 
	private String desc; 
	private int qty; 
	private double unitPrice; 
	public InvoiceItem() {
		// TODO Auto-generated constructor stub
	}
public InvoiceItem(String id, String desc, int qty, double unitePrice) {
		
		this.id = id; 
		this.desc = desc; 
		this.qty = qty ; 
		this.unitPrice = unitePrice;
	}
	
	public String getID() {
		return id ; 
	}
	
	public String getDesc(){
		return desc; 
	}
	
	public int getQty() {
		return qty ; 
	}
	
	public void setQty(int qty) {
		this.qty = qty; 
	}
	
	public double UnitPrice() {
		return unitPrice ; 
	}
	
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice ;
	}
	
	public double getTotal() {
		double total = unitPrice * qty; 
		return total; 
	}
		
	public String toString() {
		
		return "  id del producto ; " + id + " La descripcion del color: " + desc + " las cantidades del producto son; " + qty + " y el precio unitario es de: " + unitPrice;
	}
}

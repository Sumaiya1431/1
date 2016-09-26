package in.ac.kletech.RetailShop;


public class CustomerDemo {
public static void main(String args[]){
	Customer c1= new Customer(101,"Sphoorti","Keshwapur",904940619);
	c1.validateCustName();
	c1.validateTeleNo();
	c1.displayDetails();
	
	PurchaseBill p=new PurchaseBill(311,4,980.5);
	p.calculateBill();
	p.displayDetails();

	ItemsDetails it=new ItemsDetails(1002,50);
	it.validateID();
	it.displayItem();
	
}
}


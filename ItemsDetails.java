package in.ac.kletech.RetailShop;


public class ItemsDetails {

	private int iItemID;
	private double dItemPrice;
	
	 
	public ItemsDetails(int iItemID, double dItemPrice) {
		super();
		this.iItemID = iItemID;
		this.dItemPrice = dItemPrice;
	}

	void validateID(){
		if(iItemID==1001||iItemID==1002||iItemID==1003||iItemID==1004||iItemID==1005)
			iItemID=iItemID-0;
		else 
			System.out.println("Invalid Item ID");
	}
	void displayItem(){
		System.out.println("Item ID:" +iItemID);
		System.out.println("Item price:" +dItemPrice);
	}
	public int getiItemID() {
		return iItemID;
	}
	public double getdItemPrice() {
		return dItemPrice;
	}
	
}


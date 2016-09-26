package in.ac.kletech.RetailShop;

public class PurchaseBill {
	private int iBillID;
	private int iQty;
	private double  dBillAmt;
	public int getiBillID() {
		return iBillID;
	}
	public int getiQty() {
		return iQty;
	}
	public double getdBillAmt() {
		return dBillAmt;
	}
	void calculateBill(){
		if(dBillAmt>=1000)
			dBillAmt=dBillAmt-dBillAmt*0.1;
		else if(dBillAmt>=500)
			dBillAmt=dBillAmt-dBillAmt*0.05;
		else
			dBillAmt=dBillAmt-dBillAmt*0;
	}
	void displayDetails(){
		System.out.println("bill id:"+iBillID);
		System.out.println("quantity:"+iQty);
		System.out.println("bill amt:"+dBillAmt);
	}
	public PurchaseBill(int iBillID, int iQty, double dBillAmt) {
		super();
		this.iBillID = iBillID;
		this.iQty = iQty;
		this.dBillAmt = dBillAmt;
	}
	
}

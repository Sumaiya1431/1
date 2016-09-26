package in.ac.kletech.RetailShop;

public class Customer {
	
	private int iCustID;
	private String sCustName;
	private String sAddress;
	private long lTeleNo;
	long n;
	public int getiCustID() {
		return iCustID;
	}
	public String getsCustName() {
		return sCustName;
	}
	public String getsAddress() {
		return sAddress;
	}
	public long getlTeleNo() {
		return lTeleNo;
	}
	public Customer(int iCustID, String sCustName, String sAddress, long lTeleNo) {
		super();
		this.iCustID = iCustID;
		this.sCustName = sCustName;
		this.sAddress = sAddress;
		this.lTeleNo = lTeleNo;
	}
	boolean validateTeleNo(){
		n = lTeleNo/1000000000;
		if(n>=7 && n<10)
			return(true);
		else 
			return(false);
	}
	boolean validateCustName(){
		if(sCustName.length()>=4 && sCustName.length()<=20)
			return(true);
		else
			return(false);
	}
	void displayDetails(){
		System.out.println("id:"+iCustID);
		System.out.println("custemer name:"+sCustName);
		System.out.println("adddress:"+sAddress);
		System.out.println("telephone no:"+lTeleNo);
	}
	

}

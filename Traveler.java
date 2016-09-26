package ac.in.kletech.traveler;

public class Traveler {
	private int iTravelerID;
	private String sTravelerName;
	private long lTravelerContactNo;
	float fBaggageAmount;
	boolean bNOCStatus;
	int iExpiryYear;
	String s;
	long n;
	public Traveler(int iTravelerID, String sTravelerName,
			long lTravelerContactNo, float fBaggageAmount, boolean bNOCStatus,
			int iExpiryYear) {
		super();
		this.iTravelerID = iTravelerID;
		this.sTravelerName = sTravelerName;
		this.lTravelerContactNo = lTravelerContactNo;
		this.fBaggageAmount = fBaggageAmount;
		this.bNOCStatus = bNOCStatus;
		this.iExpiryYear = iExpiryYear;
	}
	public int getiTravelerID() {
		return iTravelerID;
	}
	public String getsTravelerName() {
		return sTravelerName;
	}
	public long getlTravelerContactNo() {
		return lTravelerContactNo;
	}
	public float getfBaggageAmount() {
		return fBaggageAmount;
	}
	public boolean isbNOCStatus() {
		return bNOCStatus;
	}
	public int getiExpiryYear() {
		return iExpiryYear;
	}
	void validateName(){
		if(sTravelerName.length()>=4 && sTravelerName.length()<=20)
			s=sTravelerName;
		else
			System.out.println("invalid name entry");
	}
	void validateContactNo(){
		n=lTravelerContactNo/1000000000;
		if(n>=7 && n<10)
			n=lTravelerContactNo;
		else
			System.out.println("invalid phone umber entry");
	}
	void displayInformation(){
		System.out.println("name:"+s);
		System.out.println("ID:"+iTravelerID);
		System.out.println("contact no:"+n);
		System.out.println("Baggae amt:"+fBaggageAmount);
		System.out.println("noc status:"+bNOCStatus);
		System.out.println("expiry date"+iExpiryYear);
		
		
	}
}

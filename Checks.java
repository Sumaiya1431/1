package ac.in.kletech.traveler;

public class Checks {

	boolean checkBaggage(Traveler one){
		if(one.fBaggageAmount>=0 && one.fBaggageAmount<=40)
			return(true);
		else
			return(false);
	}
	
	boolean checkImmigration(Traveler one){
		if(one.iExpiryYear>=2001 && one.iExpiryYear<=2025)
			return(true);
		else
			return(false);
	}
	
	boolean checkSecurity(Traveler one){
		if(one.bNOCStatus==true)
			return(true);
		else
			return(false);
	}
}

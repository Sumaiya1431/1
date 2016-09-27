package in.ac.kletecch.Termwork2;

import java.util.Scanner;

public abstract class HolidayBuddy {
	static int count;
	double packageAmt;
	
	Customer c = new Customer("Sumaiya", "Dharawd", 9486789689l, "Female");
	Scanner sc = new Scanner(System.in);
	
	void display(){
		System.out.println("Customer Details:");
		System.out.println("Name: "+c.sName);
		System.out.println("Address: "+c.sAddress);
		System.out.println("Contact No: "+c.lTeleNo);
		System.out.println("Gender: "+c.gender);
	}
	double checkGender(double packageAmt, String gender) {
		
		double discount;
		double totAmt;
		if(c.gender=="Female"){
			discount=packageAmt*0.02;
			totAmt = packageAmt-discount;
			System.out.println("Discount (based on gender)= Rs."+discount);
			return totAmt;
		}
		else{
			discount=0;
			System.out.println("Discount(based on gender) = Rs."+discount);
			totAmt=packageAmt-discount;
			return totAmt;
	
		}
	}

	void calDisc(double totalAmt){
		double disc;
	
		if(count>=2){
			disc=totalAmt*0.10;
			totalAmt=totalAmt-disc;
			System.out.println("Total Amount (the customer has visited more than one time)= Rs."+totalAmt);
		}
		else{
			disc=0;
			System.out.println("Total Amount (the customer has visited only once) = Rs."+ totalAmt);
		}
		
	}
	
	
}


class TravelOnly extends HolidayBuddy{
	double dist;
	double CostFor1Km=8;
	double amt(){
		System.out.println("Enyer the distance (in Kms) between the cities");
		dist = sc.nextDouble();
		
		packageAmt=CostFor1Km*dist;
		
		System.out.println("Package Amount = Rs."+ packageAmt);
		return packageAmt;
		
	}
	
	
	
	
}

class HolidayPackage extends HolidayBuddy{
	double dist;
	int noOfDays;
	double CostFor1Km=8;
	double AmtFor1Day=800;
	
	
	double amt(){
		System.out.println("Enter the distance(in KMs) and no of days of travel");
		dist=sc.nextDouble();
		noOfDays=sc.nextInt();
		
		packageAmt=((CostFor1Km*dist)+(AmtFor1Day*noOfDays)+100);
		
		System.out.println("Package Amount = Rs."+packageAmt);
		return packageAmt;
	}

	
	
}

class BedAndBreakfast extends HolidayBuddy{
	int noOfDays;
	double Amtfor1day=800;
	double amt(){
		System.out.println("Enter the no of days");
		noOfDays=sc.nextInt();
		
		packageAmt=noOfDays*Amtfor1day;
		
		System.out.println("Package Amount = Rs."+packageAmt);
		return packageAmt;
	}
	
}







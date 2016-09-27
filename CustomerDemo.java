package in.ac.kletecch.Termwork2;

import java.util.Scanner;

public class CustomerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		double amt;
		System.out.println("Enter the choice of package:\n1 for Travel only\n2 for Holiday Package\n3 for Bed and Breakfast\n");
		choice = sc.nextInt();
		
		switch(choice){
			case 1: System.out.println("Travel only package is booked");
					TravelOnly t = new TravelOnly();
					t.display();
					amt = t.amt();
					t.calDisc(amt);
					System.out.println(t.checkGender(amt, "Female"));
					break;
			case 2: System.out.println("holiday package is booked");
					HolidayPackage h = new HolidayPackage();
					h.display();
					amt = h.amt();
					h.calDisc(amt);
					System.out.println(h.checkGender(amt, "Female"));
					break;
			case 3: System.out.println("Bed and Breakfast package is booked");
					BedAndBreakfast b= new BedAndBreakfast();
					b.display();
					amt = b.amt();
					b.calDisc(amt);
					System.out.println(b.checkGender(amt, "Female"));
					break;
			default: System.out.println("Wrong choice");		
			
			
					
		}
		
		
	}

}



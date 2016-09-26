package in.ac.kletech.University;

public class UniversityDemo 
{
    
	public static void main(String[] args)
	{
	
	University u= new University();
	
	u.addshools("1", "spoo", 10, 6);	
	u.addshools("2", "shru", 90, 8);
	u.addshools("3", "sheshu", 70, 6);
	u.addshools("4", "triveni", 60, 8);
	u.addshools("5", "spp", 10, 6);
	u.addshools("6", "soo", 50, 8);
	u.addshools("7", "sp", 10, 6);
	u.addshools("8", "rio", 10, 8);
	
	u.displayinfo();

	System.out.println("total students in university :"+u.totalstrength_of_university());
		
	u.display_no_of_students_in_each_school();
	
	}	
}

package in.ac.kletech.University;



public class University 
{
School[] s=new School[8];	
String CetCode1;
String CetCode2;
int i=0;


public University()
{
	
		
	CetCode1 = "E30";
	CetCode2 = "E241";
}
void displayinfo()
{
	
	
      System.out.println("cetcodes of university :"+CetCode1+" and "+ CetCode2);	
	
}

void addshools(String programcode, String Schoolcoordinater,int nofstudents , int noofstaff)

{
	
	if(nofstudents>120)
	{
		System.out.println("minimum seats are only 120\n");
	
		
	}
	else
	{
	    s[i++]=new School(programcode, Schoolcoordinater, nofstudents, noofstaff);
	}
	
	
}

int totalstrength_of_university()
{
	int total=0;
	for(i=0;i<s.length;i++)
	{
		total=total+s[i].nofstudents;
		
	}
	
	return total;
	
	
}
void display_no_of_students_in_each_school()
{
	
	for(i=0;i<8;i++)
	{
		
		System.out.println(" in school "+ s[i].programcode+" no of students "+s[i].nofstudents+"\n" );
		
	}
		
}
}
class School
{
	
	String programcode;
	String Schoolcoordinater;
	int nofstudents ;
	int noofstaff;
	public School(String programcode, String schoolcoordinater,
			int nofstudents, int noofstaff)
	{
		super();
		this.programcode = programcode;
		Schoolcoordinater = schoolcoordinater;
		this.nofstudents = nofstudents;
		this.noofstaff = noofstaff;
	}	
}

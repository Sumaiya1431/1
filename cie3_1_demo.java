

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.kletech.practice;

/**
 *
 * @author msp
 */
interface Student
{
    int getAttendence();
    int getCieMarks();
    String[][] getDetails();
}
interface Staff
{
    int getClassesConducted();
    String[][]  getDetails();
}
class Cse_stu implements Student
{ String name, usn;  
  int sem, totalNoOfClasses, NoOfClassAttended, minor1Marks, minor2Marks, assgnmtMarks;

    public Cse_stu(String name, String usn, int sem, int totalNoOfClasses, int NoOfClassAttended, int minor1Marks, int minor2Marks, int assgnmtMarks) {
        this.name = name;
        this.usn = usn;
        this.sem = sem;
        this.totalNoOfClasses = totalNoOfClasses;
        this.NoOfClassAttended = NoOfClassAttended;
        this.minor1Marks = minor1Marks;
        this.minor2Marks = minor2Marks;
        this.assgnmtMarks = assgnmtMarks;
    }
  
    //Override
    public int getAttendence() {
        return (int)(NoOfClassAttended/(double)totalNoOfClasses*100);
    }

    //Override
    public int getCieMarks() {
        int cie=-1;
        try {cie=minor1Marks+minor1Marks+assgnmtMarks;
             if(cie>50) throw new CieException();
        }
        catch(CieException e)
        { System.out.println(e);
          cie=-1;
        }
        return cie;
    }

    //Override
    public String[][] getDetails() {
        String[][] d=new String[3][2];
          d[0][0]="name:";d[0][1]=name;
          d[1][0]="usn:";d[1][1]=usn;
          d[2][0]="sem:";d[2][1]=""+sem;
        return d;
    }
    
}
class CieException extends Exception
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Override
    public String toString() {
        return "CIE marks is greater than 50";
    }
    
}
class Cse_staff implements Staff
{  String name, post, subHandled;
   int totalNoOfClassesToBeConducted, noOfClassesConducted;

    public Cse_staff(String name, String post, String subHandled, int totalNoOfClassesToBeConducted, int noOfClassesConducted) {
        this.name = name;
        this.post = post;
        this.subHandled = subHandled;
        this.totalNoOfClassesToBeConducted = totalNoOfClassesToBeConducted;
        this.noOfClassesConducted = noOfClassesConducted;
    }
   
    //Override
    public int getClassesConducted() {
        return (int)(noOfClassesConducted/(double)totalNoOfClassesToBeConducted*100);
    }

    //Override
    public String[][] getDetails() {
        String[][] d=new String[3][2];
          d[0][0]="name:";d[0][1]=name;
          d[1][0]="post:";d[1][1]=post;
          d[2][0]="subject taken:";d[2][1]=subHandled;
        return d;
    }
    
}
class MtechTrainee implements Student,Staff
{ String name, usn;  
  int sem, totalNoOfClasses, NoOfClassAttended, minor1Marks, minor2Marks, assgnmtMarks;
  String post, subHandled;
  int totalNoOfClassesToBeConducted, noOfClassesConducted;

    public MtechTrainee(String name, String usn, int sem, int totalNoOfClasses, int NoOfClassAttended, int minor1Marks, int minor2Marks, int assgnmtMarks, String post, String subHandled, int totalNoOfClassesToBeConducted, int noOfClassesConducted) {
        this.name = name;
        this.usn = usn;
        this.sem = sem;
        this.totalNoOfClasses = totalNoOfClasses;
        this.NoOfClassAttended = NoOfClassAttended;
        this.minor1Marks = minor1Marks;
        this.minor2Marks = minor2Marks;
        this.assgnmtMarks = assgnmtMarks;
        this.post = post;
        this.subHandled = subHandled;
        this.totalNoOfClassesToBeConducted = totalNoOfClassesToBeConducted;
        this.noOfClassesConducted = noOfClassesConducted;
    }
  
    //Override
    public int getAttendence() {
        return (int)(NoOfClassAttended/(double)totalNoOfClasses*100);
    }

    //Override
    public int getCieMarks() {
        int cie=-1;
        try {cie=minor1Marks+minor1Marks+assgnmtMarks;
             if(cie>50) throw new CieException();
        }
        catch(CieException e)
        { System.out.println(e);
          cie=-1;
        }
        return cie;
    }

    //Override
    public String[][] getDetails() {
        String[][] d=new String[3][2];
          d[0][0]="name:";d[0][1]=name;
          d[1][0]="post:";d[1][1]=post;
          d[2][0]="subject taken:";d[2][1]=subHandled;
        return d;
    }

    //Override
    public int getClassesConducted() {
        return (int)(noOfClassesConducted/(double)totalNoOfClassesToBeConducted*100);
    }
    
}
public class cie3_1_demo {
   public static void main(String[] s)
   { Student[] stu=new Student[3];
      stu[0]=new Cse_stu("student1", "2bv11cse001", 4, 50, 45, 15, 16, 7);
      stu[1]=new Cse_stu("student2", "2bv11cse002", 4, 40, 20, 8, 4, 3);
      stu[2]=new MtechTrainee("trainee1", "2bv11scs001", 3 , 40, 30, 19, 18, 10, "trainee", "java", 10, 8);
    
    Staff[] stf=new Staff[3];
      stf[0]=new Cse_staff("kmmr", "proff", "java", 50, 48);
      stf[1]=new Cse_staff("msp", "astProff", "java", 50, 45);
      stf[2]=(MtechTrainee)stu[2];
   
   System.out.println("staff details");
   for(int i=0;i<stf.length;i++)
   { String[][] d=stf[i].getDetails();
     System.out.println("staff detail no:"+i);
     for(int j=0;j<d.length;j++)
       System.out.println("    "+d[j][0]+""+d[j][1]);
     System.out.println("    classes conducted = "+stf[i].getClassesConducted()+"%");
       
   }
   
   System.out.println("students details");
   for(int i=0;i<stu.length;i++)
   { String[][] d=stu[i].getDetails();
     System.out.println("student detail no:"+i);
     for(int j=0;j<d.length;j++)
       System.out.println("    "+d[j][0]+""+d[j][1]);
     System.out.println("    attendence = "+stu[i].getAttendence()+"%");
     System.out.println("    CIE = "+stu[i].getCieMarks());  
   }
     
   }
}

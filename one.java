package in.ac.kletech.practice;

class Patient
{ String name;
  String uid;
  int mobNum;

  Patient(String name,String uid,int mobNum)
	{ this.name=name;
      this.uid=uid;
	  this.mobNum=mobNum;
	}
  static Patient search(Patient[] p,int keyMob )
	{ Patient temp=null;
	  for(int i=0;i<p.length;i++)
		{if(p[i].mobNum == keyMob)
                 {temp=p[i];
                  break;
                 }
		}
          return temp;
	}
  
  public static void main(String arg[])
  { Patient[] p=new Patient[10];
     p[0]=new Patient("patient1", "uid1", 6444);
     p[1]=new Patient("patient2", "uid2", 6445);
     p[2]=new Patient("patient3", "uid3", 6446);
     p[3]=new Patient("patient4", "uid4", 6447);
     p[4]=new Patient("patient5", "uid5", 6448);
     p[5]=new Patient("patient6", "uid6", 6449);
     p[6]=new Patient("patient7", "uid7", 6440);
     p[7]=new Patient("patient8", "uid8", 6441);
     p[8]=new Patient("patient9", "uid9", 6442);
     p[9]=new Patient("patient10", "uid10", 6443);
     
     int keyMob=6449;
     Patient pp=Patient.search(p, keyMob);
     
     if(pp==null)
       System.out.println("no patient found");
     else 
     {System.out.println("patient found with following details");
      System.out.println("name="+pp.name);
      System.out.println("uid="+pp.uid);
      System.out.println("name="+pp.mobNum);
     }
     }
     
      
  }

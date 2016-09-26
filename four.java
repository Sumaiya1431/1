package in.ac.kletech.practice;

class college
{ String name;
  Department[] departments= new Department[10];
  int depi=0;
  String colCode;

    public college(String name, String colCode) {
        this.name = name;
        this.colCode = colCode;
    }
  
  
  void addDepartment(String name,String depCode,int numOfStu)
  { departments[depi++]=new Department(name, depCode, numOfStu);
      
  }
  int getCollegeStrength()
  { int tot=0;
     for(int i=0;i<departments.length;i++)
         if(departments[i] != null)
             tot=tot+departments[i].numOfStu;
     
    return tot;
  }
  
  public static void main(String ar[])
  { college bvb=new college("BVB", "KA_BVB");
    college pcj=new college("PCJ", "KA_PCJ");
    
    bvb.addDepartment("cse", "cse_bvb", 450);
    bvb.addDepartment("ise", "ise_bvb", 400);
    bvb.addDepartment("ece", "ece_bvb", 500);
    
    pcj.addDepartment("maths", "mat_pcj", 150);
    pcj.addDepartment("phy", "phy_pcj", 100);
    pcj.addDepartment("bio", "bio_pcj", 100);
    
    System.out.println("bvb total students="+bvb.getCollegeStrength());
    System.out.println("pcj total students="+pcj.getCollegeStrength());  
  }
  
  class Department
  { String name;
    String depCode;
    int numOfStu;
    
    public Department(String name,String depCode,int numOfStu) 
    {this.name=name;
     this.depCode=depCode;
     this.numOfStu=numOfStu;
    }
    
      
  }
}

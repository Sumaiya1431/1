package in.ac.kletech.practice;

class MyName
{ private String privateName;
  public String publicName;
  String defaultName;
  //constructors
  MyName(String name)
  {privateName=publicName=defaultName=name;
      
  }
  MyName(String privateName,String publicName,String defaultName)
  {this.privateName=privateName;
   this.publicName=publicName;
   this.defaultName=defaultName;
      
  }
   
  public String getName()
  {return privateName;
      
  }
  
  public static void main(String ar[])
  {MyName m1=new MyName("nokia"), m2=new MyName("samu", "samsungMobile", "samsung");
   
   System.out.println("first object details");
    System.out.println("private name="+m1.getName());
    System.out.println("public name="+m1.publicName);
    System.out.println("default name="+m1.defaultName);
  System.out.println("first object details");
    System.out.println("private name="+m2.getName());
    System.out.println("public name="+m2.publicName);
    System.out.println("default name="+m2.defaultName);
  
   
      
  }
 
    
}

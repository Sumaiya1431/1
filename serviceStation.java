package in.ac.kletech.practice;

class owner
{ String name;
  int mob;

    owner(String name, int mob) {
        this.name = name;
        this.mob = mob;
    }
  
}

class bike
{ owner o;
  String subtype;
  int engineCC;
  boolean sparePartChkup=false,washing=false,oling=false;

    bike(owner o) {
        this.o = o;
    }
    
}
class DreamYuga extends bike
{ final int mialage=55;

    DreamYuga(owner o) {
        super(o);
        subtype="DreamYuga";
        engineCC=110;
    }
  
}
class Shine extends bike
{ String domain="commuter";

    Shine(owner o) {
        super(o);
        subtype="Shine";
        engineCC=125;
    }
     
}
class Unicorn extends bike
{ String fav="royal";

    Unicorn(owner o) {
        super(o);
    }
  
    
}
 class serviceStation
 { static void fitSpareParts(bike b)
   { b.sparePartChkup=true;
   }
   static void washBike(bike b)
   { b.washing=true;
   }
   static void oilBike(bike b)
   { b.oling=true;
   }
   static void call(bike b)
   {System.out.println("calling mob"+b.o.toString());
       
   }
   public static void main(String[] arg)
   {bike[] b=new bike[10];
    //bikes at service station
     b[0]=new DreamYuga(new owner("owner1", 9901));
     b[1]=new Shine(new owner("owner2", 9902));
     b[2]=new bike(new owner("owner3", 9903));
     b[3]=new DreamYuga(new owner("owner4", 9904));
     b[4]=new Shine(new owner("owner5", 9905));
     b[5]=new Shine(new owner("owner6", 9906));
     b[6]=new DreamYuga(new owner("owner7", 9907));
     b[7]=new Unicorn(new owner("owner8", 9908));
     b[8]=new DreamYuga(new owner("owner9", 9909));
     b[9]=new DreamYuga(new owner("owner10", 9910));
     
     for(int i=0;i<b.length;i++)
     { serviceStation.fitSpareParts(b[i]);
       serviceStation.washBike(b[i]);
       serviceStation.oilBike(b[i]);
         
     }
     for(int i=0;i<b.length;i++)
     { if(b[i].sparePartChkup && b[i].oling && b[i].washing)
         serviceStation.call(b[i]);
     
     }
   }  
 }


package in.ac.kletech.practice;

class Car
{String color;
 String name;
 int noOfSeats;
 int maxSpeed;
 double speed=0;
 
 Car(String color, String name, int noOfSeats, int maxSpeed)
 {
        this.color = color;
        this.name = name;
        this.noOfSeats = noOfSeats;
        this.maxSpeed = maxSpeed;
 }
    void accelerate()
    {//do nothing
        
    }
    void powerBreak()
    {//do nothing
        
    }
}

class  BMW extends Car
{
    BMW(String color, String name, int noOfSeats, int maxSpeed)
    {
        super(color, name, noOfSeats, maxSpeed);
    }
    void accelerate()
    {speed=speed+2;
     if(speed>=maxSpeed)
     speed=maxSpeed;
        
    }
    void powerBreak()
    {speed=speed-45;
     if(speed<0)
     speed=0;   
    }
	
}
class  Ferrari extends Car
{
    Ferrari(String color, String name, int noOfSeats, int maxSpeed)
    {
        super(color, name, noOfSeats, maxSpeed);
    }
    void accelerate()
    {speed=speed+3;
     if(speed>=maxSpeed)
     speed=maxSpeed;
        
    }
    void powerBreak()
    {speed=speed-50;
     if(speed<0)
     speed=0;   
    }
}
class carDemo
{public static void main(String[] args) 
	{Ferrari f=new Ferrari("red", "rocket", 2, 350);
         BMW b=new BMW("white", "king", 2, 300);
         for(int i=0;i<=150;i++)
         {f.accelerate();b.accelerate();
           System.out.println(i+"th seconds speed");
           System.out.println("Ferrari="+f.speed+" BMW="+b.speed);
                     
         }
        System.out.println("applying break");
        for(int i=0;i<=7;i++)
         {f.powerBreak();b.powerBreak();
           System.out.println(i+"th seconds speed after break apply");
           System.out.println("Ferrari="+f.speed+" BMW="+b.speed);
                     
         }
	}
    
}


package in.ac.kletech.practice;

class Worker
{String name;
 int salary;
 int incrementAmt=1000;

    Worker(String name, int salary) 
    {this.name=name;
     this.salary=salary;
    }
    static void increment(Worker w)
    {w.salary=w.salary+w.incrementAmt;
        
    }
    static void increment(Worker[] w,int increAmt)
    {for(int i=0;i<w.length;i++)
       w[i].salary=w[i].salary+increAmt;
      
    }
    static void increment(Worker w,int increAmt)
    {w.salary=w.salary+increAmt;
        
    }
    static void increment(Worker[] w,int[] increAmt)
    {for(int i=0;i<w.length;i++)
       w[i].salary=w[i].salary+increAmt[i];
        
    }
    
    public static void main(String ar[])
    {Worker[] w=new Worker[5];
     for(int i=0;i<w.length;i++)
     {w[i]=new Worker("worker"+i,14000+ i*10); 
     }
     //increaments
     for(int i=0;i<w.length;i++)
     {Worker.increment(w, 100);
     }
      // print all workers details
     //-------
     int[] incrAmt={50,100,150,50,100};
     for(int i=0;i<w.length;i++)
     {Worker.increment(w, incrAmt);
     }
     // print all workers details
     //-------
     Worker.increment(w[3]);
     Worker.increment(w[4], 100);
     // print w[3],w[4]
     //-------
     
    }
}

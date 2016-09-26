package in.ac.kletech.practice;

class Bindu
{ int x,y;
  
  Bindu(int x, int y) {
        this.x = x;
        this.y = y;
    }
  String getData()
  { return "x="+x+",y="+y;
      
  }
  final static void printArr(Bindu[] b)
  {if(b!= null)
    {for(int i=0;i<b.length;i++)
          { System.out.println(b[i].getData());
                  
          }
      
    }
      
  }
    
}
class Bindu3d extends Bindu
{ int z;

    Bindu3d(int z, int x, int y) {
        super(x, y);
        this.z = z;
    }
    String getData()
    {return super.getData()+",z="+z;
        
    }
    
  
    
}
class BinduDemo
{public static void main(String[] args) 
	{Bindu3d[] b=new Bindu3d[5];
          int x=10,y=21,z=31;
          for(int i=0;i<b.length;i++)
          {b[i]=new Bindu3d(z, x, y);
              x+=10;y+=10;z+=10;
          }
          Bindu3d.printArr(b);
            
        }
    
}
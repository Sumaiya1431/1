package in.ac.kletech.practice;

class Search
{
 void sort()
 {
     
 }
 boolean search(Object key)
 {
    return false; 
 }
 void dispaly()
 {
     
 }
    
}
class BinarySearch extends Search
{ int[] a=new int[10];

    public BinarySearch(int[] a) 
    {this.a=a;
    }
   void sort()
   {for(int i=0;i<a.length;i++)
       for(int j=i+1;j<a.length-i;j++)
        if(a[j-1] > a[j])
        {int temp=a[j];
         a[j]=a[j-1];
         a[j-1]=temp;
        }
    }
   boolean search(Object key)
   {int k=(Integer)key;
    return binarySearch(0,a.length-1,k);
   }
   void dispaly()
   { for(int i=0;i<a.length;i++)
       System.out.println(a[i]);
   }
   boolean binarySearch(int l,int h,int key)
   { boolean res=false;
    if(l<h) 
    { int mid=(l+h)/2;
      if(a[mid] == key)
          return true;
      else if(a[mid] > key)
          return binarySearch(l, mid-1, key);
      else 
          return binarySearch(mid+1, h, key);
    }
    else 
    return res;
       
   }
    
}
class SequentialSearch extends Search 
{ String[] a=new String[10];

    public SequentialSearch(String[] a) 
    {this.a=a;
    }
   void sort()
   {for(int i=0;i<a.length;i++)
       for(int j=i+1;j<a.length-i;j++)
        if(a[j-1].compareToIgnoreCase(a[j]) < 0)
        {String temp=a[j];
         a[j]=a[j-1];
         a[j-1]=temp;
        }
    }
   boolean search(Object key)
   {String k=(String)key;
    return sequenceSearch(k);
   }
   void dispaly()
   { for(int i=0;i<a.length;i++)
       System.out.println(a[i]);
   }
   boolean sequenceSearch(String key )
   { boolean res=false;
     for(int i=0;i<a.length;i++)
      if(a[i].equalsIgnoreCase(key))
      {res=true;
       break;
      }   
     return res;
       
   }
    
}

class searchDemo
{public static void main(String[] args) 
	{ int[] a={1,4,5,3,6,7};
            BinarySearch b=new BinarySearch(a);
          String[] s={"bvb","kle","cse","abc","xyz"};
           SequentialSearch seq=new SequentialSearch(s);
           
           Search srch;
           srch=b;
            srch.sort();
            System.out.println("binary search result for key=3 is "+srch.search(3));
            srch.dispaly();
            
           srch=seq;
            srch.sort();
            System.out.println("sequential search result for key=cse is "+srch.search("cse"));
            srch.dispaly(); 
        }

}

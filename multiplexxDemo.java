package in.ac.kletech.practice;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author msp
 */
class Movie
{ String title,production,certificate,laguage;
  Movie(String title, String production, String certificate, String laguage) {
        this.title = title;
        this.production = production;
        this.certificate = certificate;
        this.laguage = laguage;
    }
  
    
}

class Screen
{ int screenNum,capacity;
  Movie[] m=new Movie[2];
  Screen(int screenNum, int capacity) {
        this.screenNum = screenNum;
        this.capacity = capacity;
    }
    
}

class MultiPlex
{ String name,city;
  Screen[] s=new Screen[2];
  MultiPlex(String name, String city) {
        this.name = name;
        this.city = city;
    }
  
    
}
class multiPlexDemo {
  public static void main(String[] arg)
  { MultiPlex m=new MultiPlex("sujata", "hubli");
    m.s[0]=new Screen(1, 350);
    m.s[1]=new Screen(2,350);
            
    m.s[0].m[0]=new Movie("simpalagiOndLoveStory", "yyy", "U", "kannada");
    m.s[0].m[1]=new Movie("topiwala", "upendra", "U", "kannada");
    m.s[1].m[0]=new Movie("ABCD", "zzz", "U", "hindi");
    m.s[1].m[1]=new Movie("avengers", "marvel", "U", "english");
    
    System.out.println("multiplex ="+m.name);
    
    System.out.println("on screen "+m.s[0].screenNum);
    System.out.println("at 11am and 2pm="+m.s[0].m[0].title);
    System.out.println("at 11am and 2pm="+m.s[0].m[1].title);
    
    System.out.println("on screen "+m.s[1].screenNum);
    System.out.println("at 11am and 2pm="+m.s[1].m[0].title);
    System.out.println("at 11am and 2pm="+m.s[1].m[1].title);
      
  }
}


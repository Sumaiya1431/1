package in.ac.kletech.practice;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author msp
 */
class sim{
    String num,ntwProvider;

    public sim(String num, String ntwProvider) {
        this.num = num;
        this.ntwProvider = ntwProvider;
    }

   sim copy(){
       String num=new String(this.num);
       String ntwProvider=new String(this.ntwProvider);
       return new sim(num, ntwProvider);
   }
   void print(){
       System.out.println("----sim no="+num+" network="+ntwProvider);
   }
    
}
class cellPhone{
    String comapany;
    sim[] sAry;

    public cellPhone(String comapany, sim[] sAry) {
        this.comapany = comapany;
        this.sAry = sAry;
    }
    
    cellPhone copy(){
        String company=new String(this.comapany);
        sim[] s=new sim[sAry.length];
        for(int i=0; i<s.length; i++){
            s[i]=sAry[i].copy();
        }
        
        return new cellPhone(company, s);
    }
    void print(){
       System.out.println("--cellphone company="+comapany+" no of sims="+sAry.length);
       for(int i=0; i<sAry.length; i++)
            sAry[i].print();
        
   }
    
}
class person{
    String name;
    cellPhone[] cAry;

    public person(String name, cellPhone[] cAry) {
        this.name = name;
        this.cAry = cAry;
    }
    
    person copy(){
        String name=new String(this.name);
        cellPhone[] c=new cellPhone[cAry.length];
        for(int i=0;i<c.length;i++){
            c[i]=cAry[i].copy();
        }
        
        return new person(name, c);
    }
    void print(){
       System.out.println("peerson name="+name+" no of cellPhones="+cAry.length);
       for(int i=0; i<cAry.length; i++)
            cAry[i].print();
        
   }
}
public class qp3c_demo {
    public static void main(String[] arg){
          sim[] s1=new sim[2], s2=new sim[1];
           s1[0]=new sim("999991", "airtel");
           s1[1]=new sim("999992", "vodafone");
           
           s2[0]=new sim("99993", "tataDocomo");
           
          cellPhone[] cr=new cellPhone[2];
           cr[0]=new cellPhone("samsung", s1);
           cr[1]=new cellPhone("nokia", s2);
           
          person p=new person("abcd", cr);
          System.out.println("original object *************************************");
          p.print();
          person p1=p.copy();
          System.out.println("a copy of object *************************************");
          p1.print();
          
          //modify original object
          p.cAry[1].sAry[0]=new sim("999997", "idea");
          p.cAry[1].comapany="sony";
          System.out.println("\noriginal object: after modification *************************************");
          p.print();
          System.out.println("a copy of object is not affected(can be used as backup/restore)********************");
          p1.print();
    
    }   
    
}


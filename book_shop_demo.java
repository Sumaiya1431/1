package in.ac.kletech.practice;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author msp
 */
interface bookInf{
    int FICTION=0,POLITICS=1,TECHNICAL=2;
    int getType();
    int getCountSold();
    double getCost();
    boolean getSoldStatus();
    void setSoldStatus(boolean s);
    
}
abstract class bookAbs implements bookInf{
    static int idGen=1;
    boolean soldStatus=false;
    String author,title,id;
    int type; double cost;

    public bookAbs(String author, String title, double cost) {
        this.author = author;
        this.title = title;
        this.cost = cost;
    }
   //Override
    public double getCost() {
        return cost;
    }
    //Override
    public boolean getSoldStatus() {
        return soldStatus;
    }
    //Override
    public int getType() {
       return type;
    }
    //Override
    public void setSoldStatus(boolean s) {
        this.soldStatus=s;
    }
    
}
class fictionBok extends bookAbs{
    static int fictionSoldCount=0;
    public fictionBok(String author, String title, double cost,int bookType) {
        super(author, title, cost);
        id="FICTION_"+(idGen++); type=bookType;
    }
   
    //Override
    public int getCountSold() {
        return fictionSoldCount;
    }
 
}
class politicsBok extends bookAbs{
    static int politicsSoldCount=0;
    public politicsBok(String author, String title, double cost,int bookType) {
        super(author, title, cost);
        id="POLITICS_"+(idGen++); type=bookType;
    }
   
    //Override
    public int getCountSold() {
        return politicsSoldCount;
    }
}
class technicalBok extends bookAbs{
    static int technicalSoldCount=0;
    public technicalBok(String author, String title, double cost,int bookType) {
        super(author, title, cost);
        id="TECHNICAL_"+(idGen++); type=bookType;
    }
   
    //Override
    public int getCountSold() {
        return technicalSoldCount;
    }
}

class customer {
    String name,emailId,mobNo;
    bookInf cBoksAry[]=new bookInf[20];
    int cBoksIndx=0;
    boolean isRegularCustmr=false;

    public customer(String name, String emailId, String mobNo,boolean custType) {
        this.name = name;
        this.emailId = emailId;
        this.mobNo = mobNo;
        isRegularCustmr=custType;
    }
    
}


class shop {
    String shopowner;
    bookInf sBoksAry[]=new bookInf[100];
    customer custAry[]=new customer[10];
    int bokIdx=0, custIdx=0;

    public shop(String shopowner) {
        this.shopowner = shopowner;
    }
    void addBok(bookInf b){
        sBoksAry[bokIdx++]=b;
    }
    void addCustmr(customer c){
        custAry[custIdx++]=c;
    }
    
    void sellBoksTo(customer custmr, int ficDemndCopis,int polDemndCps,int techDmdCps){
        int suppliedBoks=0; double bill=0;
        System.out.println("selling books to "+custmr.name+"**********************");
        //custmr demands certain number of fiction books. if available it will sold to him
        for(int d=0;d<ficDemndCopis;d++)
          for(int i=0; i<bokIdx;i++)
          {  if(!sBoksAry[i].getSoldStatus() && sBoksAry[i].getType()==bookInf.FICTION )
             { custmr.cBoksAry[custmr.cBoksIndx++]=sBoksAry[i];//book sold assumption
               sBoksAry[i].setSoldStatus(true);
               suppliedBoks++; bill+= ( (fictionBok)sBoksAry[i] ).cost;
               System.out.println("book with id="+ ( (fictionBok)sBoksAry[i] ).id+" sold to "+custmr.name);
               break;
             }
                 
           }
        // repeat for other two types of book
        for(int d=0;d<polDemndCps;d++)
          for(int i=0; i<bokIdx;i++)
          {  if(!sBoksAry[i].getSoldStatus() && sBoksAry[i].getType()==bookInf.POLITICS )
             { custmr.cBoksAry[custmr.cBoksIndx++]=sBoksAry[i];//book sold assumption
               sBoksAry[i].setSoldStatus(true);
               suppliedBoks++; bill+= ( (politicsBok)sBoksAry[i] ).cost;
               System.out.println("book with id="+ ( (politicsBok)sBoksAry[i] ).id+" sold to "+custmr.name);
               break;
             }
                 
           }
        
        for(int d=0;d<techDmdCps;d++)
          for(int i=0; i<bokIdx;i++)
          {  if(!sBoksAry[i].getSoldStatus() && sBoksAry[i].getType()==bookInf.TECHNICAL )
             { custmr.cBoksAry[custmr.cBoksIndx++]=sBoksAry[i];//book sold assumption
               sBoksAry[i].setSoldStatus(true);
               suppliedBoks++; bill+= ( (technicalBok)sBoksAry[i] ).cost;
               System.out.println("book with id="+ ( (technicalBok)sBoksAry[i] ).id+" sold to "+custmr.name);
               break;
             }
                 
           }
        //generate bill with discount
        double dbill;
        if(suppliedBoks>3){
             if(custmr.isRegularCustmr)
                 dbill = bill-(bill*0.13);
             else
                 dbill = bill-(bill*0.09);
          System.out.println("customer :"+custmr.name+", no books:"+suppliedBoks+" actuval bill="+bill+" after Discount="+dbill);
        }
        else
          System.out.println("customer :"+custmr.name+", no books:"+suppliedBoks+"  bill="+bill);
        
        
    }// end of sellBoksTo()
        
    void printSale(){
        int totBokSold=0,ficBoksold=0,polBokSold=0,techBokSold=0;
        double totSaleAmt=0;
        for(int i=0; i<bokIdx; i++){
            if(sBoksAry[i].getSoldStatus())
            {totBokSold++;
             totSaleAmt+=sBoksAry[i].getCost();
             if(sBoksAry[i].getType()== bookInf.FICTION)
                 ficBoksold++;
             if(sBoksAry[i].getType()== bookInf.POLITICS)
                 polBokSold++;
             if(sBoksAry[i].getType()== bookInf.TECHNICAL)
                 techBokSold++;
            }
       
      }//end of for loop
      System.out.println("sale report --------------");
            System.out.println("total books sold : "+totBokSold);
            System.out.println("total sale amount : "+totSaleAmt);
            System.out.println("total fiction books sold : "+ficBoksold);
            System.out.println("total political books sold : "+polBokSold);
            System.out.println("total technical books sold : "+techBokSold);
    }
}

public class book_shop_demo {
  public static void main(String[] arg){
      shop shp=new shop("sapna");
      //populate books
      for(int i=0; i<10;i++){
        shp.addBok(new fictionBok("abc", "mahabharat", 1000, bookInf.FICTION) );
        shp.addBok(new politicsBok("cdf", "indian_politicians", 529, bookInf.POLITICS) );
        shp.addBok(new technicalBok("xyz", "computerScience", 325, bookInf.TECHNICAL) );
      }
      
      for(int i=0; i<10;i++){
          shp.addCustmr(new customer("cust_"+i, "mail_"+i+"@bvb.edu", "999999999"+i, i%2==0?true:false));
      }
      //selling books to customers
      shp.sellBoksTo(shp.custAry[0], 3, 1, 2);
      shp.sellBoksTo(shp.custAry[1], 0, 1, 1);
      shp.sellBoksTo(shp.custAry[2], 0, 1, 0);
      shp.sellBoksTo(shp.custAry[0], 0, 0, 1);
      
      shp.printSale();
  }   
  
      
}

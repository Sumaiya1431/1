package in.ac.kletech.practice;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author msp
 */
interface account_inf
{//deposit_amount, display_balance, withdraw_amount, c
    void deposit_amount(double amt);
    void display_balance();
    void withdraw_amount(double amt);
    double compute_interest(int years);
    
}
abstract class account_abs
{ String name,accNo;
  boolean typeOfAcc;
  static final double interest=4;
  static int accNoGenarator=0;
  
  account_abs(String name,boolean typeOfAcc){
    this.name=name; this.typeOfAcc=typeOfAcc;  
  }
    
}
class Sav_Account extends account_abs implements account_inf
{ double balance;

    public Sav_Account(String name,boolean typeOfAcc,double balance) {
        super(name, typeOfAcc);
        this.balance=balance;
        this.accNo="SAV_ACC_000"+(accNoGenarator*2+1);
        accNoGenarator++;
    }

    //Override
    public double compute_interest(int years) {
        double si=0;
        if(years>0 && years<=10)
        si=balance+(balance*interest/100*years);
        
        return si;
    }

    ///Override
    public void deposit_amount(double amt) {
        if(amt>0 && amt<100000)
        {  balance+=amt; System.out.println("amount successfully deposited="+amt+"for accNo:"+accNo);}
        else if(amt>=100000)
        {   balance=balance+amt-100;//rs 100 extra service charge
            System.out.println("amount successfully deposited="+amt+"for accNo:"+accNo);
        }
        else 
         System.out.println("amount could't be deposited for accNo:"+accNo);    
        
    }

    //Override
    public void display_balance() {
        System.out.println("your current balance for acc no "+accNo+" ="+balance);   
    }

    //Override
    public void withdraw_amount(double amt) {
         if(amt<balance && amt>0 && amt<100000)
        {  balance-=amt; System.out.println("amount successfully withdrawn="+amt+"from accNo:"+accNo);}
        else if(amt<balance && amt>=100000)
        {  
            System.out.println("could'nt withdraw amt should be less than one lac per transaction: accNo:"+accNo);
        }
        else 
         System.out.println("amount greater than balance or negative value- can not be withdrawn for accNo:"+accNo);    
    }
    
}

class Curr_Account extends account_abs implements account_inf
{ double balance;
  double serviceCharge;
  static double minBal=1000;

    public Curr_Account(String name,boolean typeOfAcc,double balance) {
        super(name, typeOfAcc);
        this.name=name; this.typeOfAcc=typeOfAcc;
        this.balance=balance;
        this.accNo="CURR_ACC_000"+(accNoGenarator*2);
        accNoGenarator++;
    }

    //Override
    public double compute_interest(int years) {
        double si=0;
        System.out.println("not applicable for current account");
        return si;
    }

    //Override
    public void deposit_amount(double amt) {
        if(amt>0 )
        {  balance+=amt; System.out.println("amount successfully deposited="+amt+"for accNo:"+accNo);
           if(amt>=100000){ serviceCharge+=100; 
                           System.out.println("service charge applied="+100+"for accNo:"+accNo);
                         }
        }
        
        else 
         System.out.println("amount could'nt be deposited for accNo:"+accNo);    
        
    }

    //Override
    public void display_balance() {
        System.out.println("your current balance for acc no "+accNo+" ="+balance);    
    }

    //Override
    public void withdraw_amount(double amt) {
         if(amt<balance && amt>0 )
        {  balance-=amt; System.out.println("amount successfully withdrawn="+amt+" from accNo:"+accNo);
           if(balance<minBal){ serviceCharge+=30; 
                           System.out.println("minmum balance service charge applied="+30+"for accNo:"+accNo);
                         }
        
        }
        
        else 
         System.out.println("amount greater than balance can not be withdrawn for accNo:"+accNo);    
    }
    
}
public class bankAccountDemo {
    public static void main(String[] arg)
    { Sav_Account s=new Sav_Account("asdf", true, 30000);
      Curr_Account c=new Curr_Account("qwer", false, 0);
      s.display_balance();
      c.display_balance();
      s.withdraw_amount(2000); s.display_balance();
      c.withdraw_amount(2000);
      
      account_inf[] accs=new account_inf[5];
        accs[0]=new Sav_Account("qaz", true, 40000);//true->sav account,false->curr acc
        accs[1]=new Sav_Account("efv", true, 50000);
        accs[2]=new Sav_Account("wer", true, 160000);
        accs[3]=new Curr_Account("yjm", false, 3452);
        accs[4]=new Curr_Account("oli", false, 123452);
     
    System.out.println("credit bonus to all");     
    for(int i=0; i< accs.length;i++)
    {accs[i].deposit_amount(3000);
     accs[i].display_balance();
        
    }
    System.out.println("\n special transactions");
    accs[2].withdraw_amount(100000);
    accs[2].withdraw_amount(-100);
    accs[4].withdraw_amount(100000); 
    accs[4].deposit_amount(100000); 
    accs[3].withdraw_amount(6000);
    
    System.out.println("\n closing balance for all acc");
     for(int i=0; i< accs.length;i++)
    {
     accs[i].display_balance();
        
    }
    
        
    }
}


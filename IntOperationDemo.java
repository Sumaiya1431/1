package in.ac.kletech.practice;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author msp
 */
interface IntOperations
{ boolean isPositive();
  boolean isNegative();
  boolean isEven();
  boolean isOdd();
  int getSumOfDigits();
  
}
class myNum implements IntOperations{
    private int data;

    public myNum(int data) {
        this.data = data;
    }

    //Override
    public boolean isPositive() {
        return data>=0?true:false;
    }

    //Override
    public boolean isNegative() {
        return data<0?true:false;
    }

    //Override
    public boolean isEven() {
        return data%2==0?true:false;
    }

    //Override
    public boolean isOdd() {
        return data%2==0?false:true;
    }

    //Override
    public int getSumOfDigits() {
        int s=0,t=data;
        while(t!=0){
            s=s+t%10;
            t=t/10;
        }
        return s;
    }
    
}
public class IntOperationDemo {
    public static void main(String[] arg){
        IntOperations n=new myNum(902);
        if(n.isEven()) System.out.println("no is even");
        if(n.isOdd()) System.out.println("no is odd");
        if(n.isPositive()) System.out.println("no is positive");
        if(n.isNegative()) System.out.println("no is negative");
        System.out.println("sum of digits="+n.getSumOfDigits());
        
    }
    
}


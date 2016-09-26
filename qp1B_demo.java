package in.ac.kletech.practice;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author msp
 */
abstract class empAbs{
  String name;
  double salary;

    public empAbs(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
  abstract void hike(double percentage);
  static void hike(empAbs e[],double percent){
      for(int i=0;i<e.length;i++)
          e[i].hike(percent);
  }
}

class normal_emp extends empAbs{

    public normal_emp(String name, double salary) {
        super(name, salary);
    }

    //Override
    void hike(double percentage) {
        salary+=(salary*percentage/100);
    }
    
}
class manager extends empAbs{
    int noOfStocks;

    public manager(int noOfStocks, String name, double salary) {
        super(name, salary);
        this.noOfStocks = noOfStocks;
    }

    //Override
    void hike(double percentage) {
        salary=salary+(salary*percentage/100)+(noOfStocks*10);
    }
    
}
public class qp1B_demo {
    public static void main(String[] arg){
        empAbs[] eAry=new empAbs[10];
        for(int i=0; i<eAry.length; i++){
            if(i%9==8)
             eAry[i]=new manager(1000, "manger_"+i, 80000);
            else
             eAry[i]=new normal_emp("emp_"+i, 2000*(i+1));
        }
        System.out.println(eAry[0].name+" salary before hike="+eAry[0].salary);
        eAry[0].hike(25);
        System.out.println(eAry[0].name+" salary after hike*******="+eAry[0].salary);
        System.out.println(eAry[8].name+" salary before hike="+eAry[8].salary);
        eAry[8].hike(25);
        System.out.println(eAry[8].name+" salary after hike*******="+eAry[8].salary);
        
        System.out.println("hike for all");
        empAbs.hike(eAry, 35);
        for(int i=0; i<eAry.length; i++){
          System.out.println(eAry[i].name+" salary after hike*******="+eAry[i].salary);  
             
        }
        
        
        
    }
}


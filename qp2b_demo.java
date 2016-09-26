package in.ac.kletech.practice;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author msp
 */
class player{
    String name;
    final int id;
    static int idGen=1;
    double score,salary;

    public player(String name, double score, double salary) {
        this.name = name;
        this.score = score;
        this.salary = salary;
        id=idGen++;
    }
    static player[] selection(player[] p, double cutOff){
        //count players
        int selCount=0;
        for(int i=0;i<p.length;i++)
            if(p[i].score>=cutOff)
                selCount++;
        player[] selected=new player[selCount];
        int itr=0;
        for(int i=0;i<p.length;i++)
            if(p[i].score>=cutOff)
                selected[itr++]=p[i];
        return selected;
        
    }
    static void display(player[] p){
        for(int i=0;i<p.length;i++)
             System.out.println(p[i].name+" id="+p[i].id+" score="+p[i].score);
    }
    
}
public class qp2b_demo {
     public static void main(String[] arg){
        player[] p=new player[6];
         p[0]=new player("player1", 95, 100000);
         p[1]=new player("player2", 89, 100000);
         p[2]=new player("player3", 79, 100000);
         p[3]=new player("player4", 81, 100000);
         p[4]=new player("player5", 85, 100000);
         p[5]=new player("player6", 84, 100000);
       System.out.println("all players details");
        player.display(p);
       System.out.println("selected players with cu off 85 ****************");
       player.display( player.selection(p, 85) );
     }
    
}


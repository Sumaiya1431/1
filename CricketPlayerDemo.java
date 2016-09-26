package in.ac.kletech.CricketPlayer;

public class CricketPlayerDemo 
{

	public static void main(String[] args)
	{	
		CricketPlayer[] c=new CricketPlayer[5];
	    CricketPlayer m= new CricketPlayer();
		c=m.createPlayers();
		System.out.println(" before sorting \n");
		
		m.printPlayer();
		
		System.out.println("after sorting \n");
		
		m.printPlayer(c);
		
	}
	
}


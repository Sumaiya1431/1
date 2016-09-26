package in.ac.kletech.CricketPlayer;

public class CricketPlayer

{		CricketPlayer[] c=new CricketPlayer[5];
		int i;
		String Name;
		int Noofinnings;
		int totalNoofRuns;
	    float batAvg;
		public CricketPlayer(String name, int noofinnings, int totalNoofRuns,
				float batAvg) {
			super();
			Name = name;
			Noofinnings = noofinnings;
			this.totalNoofRuns = totalNoofRuns;
			this.batAvg = batAvg;
		}
		
	
		 public CricketPlayer() {
			super();
		}


		CricketPlayer[] createPlayers() 
				{
			 
					c[0] =new CricketPlayer("shru", 5,111, 10.0f);
					c[1]=new   CricketPlayer("shruthi", 13, 900, 800.0f);
					c[2]=new CricketPlayer("triveni", 10, 300, 180.0f);
					c[3]=new CricketPlayer("sheshu", 18, 880, 90.0f);
					c[4]=new CricketPlayer("sachin", 20, 500, 190.0f);
				
					return c;
				}
		
				void printPlayer()
				{
					
					for(i=0;i<c.length;i++)
					{
						System.out.println(" name :"+ c[i].Name);
						System.out.println(" noofinnings :"+ c[i].Noofinnings);
						System.out.println(" totalRuns :"+ c[i].totalNoofRuns);
						System.out.println(" batAvg :"+ c[i].batAvg);
						
					}
					
					
				}
		
		
		 		static CricketPlayer[] sortPlayers(CricketPlayer[] c)
		 		{
		 			CricketPlayer temp= new CricketPlayer();
		 			temp=null;
		 			int i;
		 			int j=0;
		 			for(i=1;i<c.length;i++)
		 			{
		 					for(j=0;j<c.length-i;j++)
		 					{
		 						if(c[j].totalNoofRuns>c[j+1].totalNoofRuns)
		 						{
		 							temp=c[j];
		 							c[j]=c[j+1];
		 							c[j+1]=temp;
		 						}
		 						
		 					}
		 				
		 			}
		 			return c;
		 			
		 		}
		
		 		void printPlayer(CricketPlayer[] c)
				{
					
					for(i=0;i<c.length;i++)
					{
						System.out.println(" name :"+ c[i].Name);
						System.out.println(" noofinnings :"+ c[i].Noofinnings);
						System.out.println(" totalRuns :"+ c[i].totalNoofRuns);
						System.out.println(" batAvg :"+ c[i].batAvg);
						
					}
					
					
				}
		 		
		 		
		 		

		
	
}

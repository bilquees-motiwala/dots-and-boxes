public class AI {

	int setting;
	int[][][] allBoxes;
	private int[][][] tmpAffectedBoxes;
	private Turnbase tb;
	private GameBoard gb;
	
	public AI(int setting, int[][][] allBoxes, Turnbase tb, GameBoard gb)
	{
		this.setting 	= setting;
		this.allBoxes 	= allBoxes;
		this.tb			= tb;
		this.gb 		= gb;
	}
	
	//checks if move makes score available
	public boolean moveMakesU(int[][][] affectedBoxes)
	{
		
		for(int i = 0; i < affectedBoxes.length; i++)
		{
			int count = 0;
			
			for(int x = 0; x < affectedBoxes[i].length; x++)
			{
				
				if(affectedBoxes[i][x][0] > 0)
				{
					count++;
				}
			}
			
			if(count == 3)
			{
				return true;
			}
		}
		
		return false;
	}
	
	public boolean checkIsScore(int[][] box)
	{
		for(int i = 0; i < box.length; i++)
		{
			if(box[i][0] == 0)
			{
				return false;
			}
		}
		return true;
		
	}
	
	public int makeMove()
	{
		
		
		
		for(int i = 0; i < this.allBoxes.length; i++)
		{
			for(int x = 0; x < this.allBoxes[i].length; x++)
			{
				
				//line is available. check it.
				if(this.allBoxes[i][x][0] == 0)
				{
					boolean willScore = false;
					
					//0 box
					if((i==0) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[0]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[0]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==0) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[0]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[0]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==0) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[0], this.allBoxes[1]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[0]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[1]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==0) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[0], this.allBoxes[4]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[0]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[4]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//1 box
					if((i==1) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[1]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[1]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==1) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[1], this.allBoxes[0]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[1]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[0]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==1) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[1], this.allBoxes[2]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[1]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[2]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==1) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[1], this.allBoxes[5]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[1]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[5]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//2 box
					if((i==2) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[2]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[2]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==2) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[2], this.allBoxes[1]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[2]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[1]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==2) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[2], this.allBoxes[3]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[2]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[3]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==2) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[2], this.allBoxes[6]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[2]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[6]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//3 box
					if((i==3) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[3]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[3]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==3) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[3], this.allBoxes[2]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[3]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[2]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==3) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[3]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[3]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==3) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[3], this.allBoxes[7]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[3]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[7]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//4 box
					if((i==4) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[4], this.allBoxes[0]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[4]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[0]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==4) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[4]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[4]);
						this.allBoxes[i][x][0] = 0;
						
					}
					if((i==4) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[4], this.allBoxes[5]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[4]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[5]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==4) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[4], this.allBoxes[8]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[4]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[8]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//5 box
					if((i==5) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[1], this.allBoxes[5]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[5]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[1]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==5) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[4], this.allBoxes[5]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[5]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[4]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==5) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[6], this.allBoxes[5]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[5]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[6]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==5) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[5], this.allBoxes[9]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[5]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[9]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//6 box
					if((i==6) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[2], this.allBoxes[6]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[6]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[2]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==6) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[6], this.allBoxes[5]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[6]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[5]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==6) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[6], this.allBoxes[7]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[6]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[7]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==6) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[6], this.allBoxes[10]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[6]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[10]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//7 box
					if((i==7) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[3], this.allBoxes[7]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[7]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[3]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==7) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[7], this.allBoxes[6]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[7]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[6]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==7) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[7]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[7]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==7) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[7], this.allBoxes[11]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[7]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[11]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					
					
					///////////////////////
					
					
					//8 box
					if((i==8) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[8], this.allBoxes[4]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[8]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[5]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==8) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[8]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[8]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==8) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[8], this.allBoxes[9]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[8]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[9]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==8) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[8], this.allBoxes[12]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[8]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[12]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//9 box
					if((i==9) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[9], this.allBoxes[5]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[9]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[6]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==9) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[9], this.allBoxes[8]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[9]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[8]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==9) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[9], this.allBoxes[10]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[9]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[10]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==9) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[9], this.allBoxes[13]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[9]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[13]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//10 box
					if((i==10) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[10], this.allBoxes[6]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[10]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[7]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==10) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[10], this.allBoxes[9]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[10]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[9]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==10) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[10], this.allBoxes[11]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[10]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[11]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==10) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[10], this.allBoxes[14]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[10]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[14]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//11 box
					if((i==11) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[11], this.allBoxes[7]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[11]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[7]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==11) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[11], this.allBoxes[10]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[11]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[10]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==11) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[11]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[11]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==11) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[11], this.allBoxes[15]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[11]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[15]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//12 box
					if((i==12) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[12], this.allBoxes[8]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[12]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[8]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==12) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[12]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[12]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==12) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[12], this.allBoxes[13]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[12]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[13]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==12) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[12]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[12]);
						this.allBoxes[i][x][0] = 0;
					}
					
					//13 box
					if((i==13) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[13], this.allBoxes[9]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[13]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[9]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==13) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[13], this.allBoxes[12]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[13]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[12]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==13) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[13], this.allBoxes[14]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[13]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[14]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==13) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[13]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[13]);
						this.allBoxes[i][x][0] = 0;
					}
					
					//14 box
					if((i==14) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[14], this.allBoxes[10]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[14]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[10]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==14) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[14], this.allBoxes[13]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[14]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[13]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==14) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[14], this.allBoxes[15]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[14]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[15]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==14) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[14]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[14]);
						this.allBoxes[i][x][0] = 0;
					}
					
					//15 box
					if((i==15) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[15], this.allBoxes[11]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[15]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[11]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==15) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[15], this.allBoxes[14]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[15]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[14]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==15) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[15]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[15]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==15) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[15]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[15]);
						this.allBoxes[i][x][0] = 0;
					}
					
					this.allBoxes[i][x][0] = 2;
					boolean mmu = moveMakesU(this.tmpAffectedBoxes);
					this.allBoxes[i][x][0] = 0;
					
					if((willScore)&&!(mmu))
					{
						//make this move
						this.allBoxes[i][x][0] = 2;
					
						for(int n = 0; n < this.tmpAffectedBoxes.length; n++)
						{
							if(this.tb.checkIsScore(this.tmpAffectedBoxes[n]))
							{
								this.gb.awardRightfulPoints();
							}
						}
						
						return 1;
					}
					
				}
				
			}
		}
		
		
		for(int i = 0; i < this.allBoxes.length; i++)
		{
			for(int x = 0; x < this.allBoxes[i].length; x++)
			{
				
				//line is available. check it.
				if(this.allBoxes[i][x][0] == 0)
				{
					boolean willScore = false;
					
					//0 box
					if((i==0) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[0]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[0]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==0) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[0]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[0]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==0) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[0], this.allBoxes[1]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[0]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[1]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==0) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[0], this.allBoxes[4]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[0]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[4]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//1 box
					if((i==1) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[1]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[1]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==1) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[1], this.allBoxes[0]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[1]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[0]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==1) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[1], this.allBoxes[2]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[1]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[2]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==1) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[1], this.allBoxes[5]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[1]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[5]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//2 box
					if((i==2) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[2]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[2]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==2) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[2], this.allBoxes[1]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[2]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[1]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==2) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[2], this.allBoxes[3]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[2]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[3]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==2) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[2], this.allBoxes[6]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[2]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[6]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//3 box
					if((i==3) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[3]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[3]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==3) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[3], this.allBoxes[2]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[3]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[2]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==3) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[3]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[3]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==3) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[3], this.allBoxes[7]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[3]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[7]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//4 box
					if((i==4) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[4], this.allBoxes[0]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[4]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[0]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==4) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[4]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[4]);
						this.allBoxes[i][x][0] = 0;
						
					}
					if((i==4) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[4], this.allBoxes[5]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[4]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[5]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==4) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[4], this.allBoxes[8]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[4]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[8]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//5 box
					if((i==5) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[1], this.allBoxes[5]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[5]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[1]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==5) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[4], this.allBoxes[5]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[5]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[4]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==5) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[6], this.allBoxes[5]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[5]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[6]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==5) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[5], this.allBoxes[9]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[5]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[9]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//6 box
					if((i==6) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[2], this.allBoxes[6]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[6]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[2]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==6) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[6], this.allBoxes[5]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[6]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[5]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==6) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[6], this.allBoxes[7]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[6]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[7]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==6) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[6], this.allBoxes[10]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[6]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[10]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//7 box
					if((i==7) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[3], this.allBoxes[7]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[7]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[3]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==7) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[7], this.allBoxes[6]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[7]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[6]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==7) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[7]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[7]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==7) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[7], this.allBoxes[11]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[7]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[11]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					
					
					///////////////////////
					
					
					//8 box
					if((i==8) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[8], this.allBoxes[4]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[8]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[5]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==8) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[8]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[8]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==8) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[8], this.allBoxes[9]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[8]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[9]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==8) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[8], this.allBoxes[12]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[8]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[12]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//9 box
					if((i==9) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[9], this.allBoxes[5]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[9]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[6]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==9) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[9], this.allBoxes[8]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[9]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[8]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==9) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[9], this.allBoxes[10]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[9]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[10]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==9) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[9], this.allBoxes[13]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[9]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[13]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//10 box
					if((i==10) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[10], this.allBoxes[6]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[10]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[7]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==10) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[10], this.allBoxes[9]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[10]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[9]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==10) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[10], this.allBoxes[11]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[10]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[11]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==10) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[10], this.allBoxes[14]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[10]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[14]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//11 box
					if((i==11) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[11], this.allBoxes[7]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[11]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[7]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==11) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[11], this.allBoxes[10]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[11]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[10]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==11) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[11]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[11]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==11) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[11], this.allBoxes[15]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[11]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[15]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//12 box
					if((i==12) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[12], this.allBoxes[8]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[12]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[8]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==12) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[12]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[12]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==12) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[12], this.allBoxes[13]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[12]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[13]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==12) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[12]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[12]);
						this.allBoxes[i][x][0] = 0;
					}
					
					//13 box
					if((i==13) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[13], this.allBoxes[9]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[13]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[9]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==13) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[13], this.allBoxes[12]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[13]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[12]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==13) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[13], this.allBoxes[14]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[13]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[14]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==13) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[13]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[13]);
						this.allBoxes[i][x][0] = 0;
					}
					
					//14 box
					if((i==14) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[14], this.allBoxes[10]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[14]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[10]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==14) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[14], this.allBoxes[13]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[14]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[13]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==14) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[14], this.allBoxes[15]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[14]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[15]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==14) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[14]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[14]);
						this.allBoxes[i][x][0] = 0;
					}
					
					//15 box
					if((i==15) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[15], this.allBoxes[11]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[15]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[11]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==15) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[15], this.allBoxes[14]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[15]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[14]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==15) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[15]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[15]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==15) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[15]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[15]);
						this.allBoxes[i][x][0] = 0;
					}
					
					
					
					if((willScore))
					{
						//make this move
						this.allBoxes[i][x][0] = 2;
						
						for(int n = 0; n < this.tmpAffectedBoxes.length; n++)
						{
							if(this.tb.checkIsScore(this.tmpAffectedBoxes[n]))
							{
								this.gb.awardRightfulPoints();
							}
						}
						
						
						return 1;
					}
					
				}
				
			}
		}
		
		///////////////////////////////////////////////////////
		// n o  s c o r e  m o v e s  f o u n d              //
		// t r y i n g  f o r  s a f e  m o v e              //
		///////////////////////////////////////////////////////
		for(int i = 0; i < this.allBoxes.length; i++)
		{
			for(int x = 0; x < this.allBoxes[i].length; x++)
			{
				
				//line is available. check it.
				if(this.allBoxes[i][x][0] == 0)
				{
					boolean willScore = false;
					
					//0 box
					if((i==0) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[0]};
						willScore = checkIsScore(this.allBoxes[0]);
					}
					if((i==0) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[0]};
						willScore = checkIsScore(this.allBoxes[0]);
					}
					if((i==0) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[0], this.allBoxes[1]};
						willScore = checkIsScore(this.allBoxes[0]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[1]);
						}
					}
					if((i==0) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[0], this.allBoxes[4]};
						willScore = checkIsScore(this.allBoxes[0]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[4]);
						}
					}
					
					//1 box
					if((i==1) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[1]};
						willScore = checkIsScore(this.allBoxes[1]);
					}
					if((i==1) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[1], this.allBoxes[0]};
						willScore = checkIsScore(this.allBoxes[1]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[0]);
						}
					}
					if((i==1) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[1], this.allBoxes[2]};
						willScore = checkIsScore(this.allBoxes[1]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[2]);
						}
					}
					if((i==1) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[1], this.allBoxes[5]};
						willScore = checkIsScore(this.allBoxes[1]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[5]);
						}
					}
					
					//2 box
					if((i==2) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[2]};
						willScore = checkIsScore(this.allBoxes[2]);
					}
					if((i==2) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[2], this.allBoxes[1]};
						willScore = checkIsScore(this.allBoxes[2]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[1]);
						}
					}
					if((i==2) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[2], this.allBoxes[3]};
						willScore = checkIsScore(this.allBoxes[2]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[3]);
						}
					}
					if((i==2) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[2], this.allBoxes[6]};
						willScore = checkIsScore(this.allBoxes[2]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[6]);
						}
					}
					
					//3 box
					if((i==3) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[3]};
						willScore = checkIsScore(this.allBoxes[3]);
					}
					if((i==3) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[3], this.allBoxes[2]};
						willScore = checkIsScore(this.allBoxes[3]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[2]);
						}
					}
					if((i==3) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[3]};
						willScore = checkIsScore(this.allBoxes[3]);
					}
					if((i==3) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[3], this.allBoxes[7]};
						willScore = checkIsScore(this.allBoxes[3]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[7]);
						}
					}
					
					//4 box
					if((i==4) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[4], this.allBoxes[0]};
						willScore = checkIsScore(this.allBoxes[4]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[0]);
						}
					}
					if((i==4) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[4]};
						willScore = checkIsScore(this.allBoxes[4]);
						
					}
					if((i==4) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[4], this.allBoxes[5]};
						willScore = checkIsScore(this.allBoxes[4]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[5]);
						}
					}
					if((i==4) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[4], this.allBoxes[8]};
						willScore = checkIsScore(this.allBoxes[4]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[8]);
						}
					}
					
					//5 box
					if((i==5) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[1], this.allBoxes[5]};
						willScore = checkIsScore(this.allBoxes[5]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[1]);
						}
					}
					if((i==5) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[4], this.allBoxes[5]};
						willScore = checkIsScore(this.allBoxes[5]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[4]);
						}
					}
					if((i==5) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[6], this.allBoxes[5]};
						willScore = checkIsScore(this.allBoxes[5]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[6]);
						}
					}
					if((i==5) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[5], this.allBoxes[9]};
						willScore = checkIsScore(this.allBoxes[5]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[9]);
						}
					}
					
					//6 box
					if((i==6) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[2], this.allBoxes[6]};
						willScore = checkIsScore(this.allBoxes[6]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[2]);
						}
					}
					if((i==6) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[6], this.allBoxes[5]};
						willScore = checkIsScore(this.allBoxes[6]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[5]);
						}
					}
					if((i==6) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[6], this.allBoxes[7]};
						willScore = checkIsScore(this.allBoxes[6]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[7]);
						}
					}
					if((i==6) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[6], this.allBoxes[10]};
						willScore = checkIsScore(this.allBoxes[6]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[10]);
						}
					}
					
					//7 box
					if((i==7) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[3], this.allBoxes[7]};
						willScore = checkIsScore(this.allBoxes[7]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[3]);
						}
					}
					if((i==7) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[7], this.allBoxes[6]};
						willScore = checkIsScore(this.allBoxes[7]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[6]);
						}
					}
					if((i==7) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[7]};
						willScore = checkIsScore(this.allBoxes[7]);
					}
					if((i==7) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[7], this.allBoxes[11]};
						willScore = checkIsScore(this.allBoxes[7]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[11]);
						}
					}
					
					
					
					///////////////////////
					
					
					//8 box
					if((i==8) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[8], this.allBoxes[4]};
						willScore = checkIsScore(this.allBoxes[8]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[5]);
						}
					}
					if((i==8) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[8]};
						willScore = checkIsScore(this.allBoxes[8]);
					}
					if((i==8) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[8], this.allBoxes[9]};
						willScore = checkIsScore(this.allBoxes[8]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[9]);
						}
					}
					if((i==8) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[8], this.allBoxes[12]};
						willScore = checkIsScore(this.allBoxes[8]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[12]);
						}
					}
					
					//9 box
					if((i==9) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[9], this.allBoxes[5]};
						willScore = checkIsScore(this.allBoxes[9]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[6]);
						}
					}
					if((i==9) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[9], this.allBoxes[8]};
						willScore = checkIsScore(this.allBoxes[9]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[8]);
						}
					}
					if((i==9) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[9], this.allBoxes[10]};
						willScore = checkIsScore(this.allBoxes[9]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[10]);
						}
					}
					if((i==9) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[9], this.allBoxes[13]};
						willScore = checkIsScore(this.allBoxes[9]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[13]);
						}
					}
					
					//10 box
					if((i==10) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[10], this.allBoxes[6]};
						willScore = checkIsScore(this.allBoxes[10]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[7]);
						}
					}
					if((i==10) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[10], this.allBoxes[9]};
						willScore = checkIsScore(this.allBoxes[10]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[9]);
						}
					}
					if((i==10) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[10], this.allBoxes[11]};
						willScore = checkIsScore(this.allBoxes[10]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[11]);
						}
					}
					if((i==10) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[10], this.allBoxes[14]};
						willScore = checkIsScore(this.allBoxes[10]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[14]);
						}
					}
					
					//11 box
					if((i==11) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[11], this.allBoxes[7]};
						willScore = checkIsScore(this.allBoxes[11]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[7]);
						}
					}
					if((i==11) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[11], this.allBoxes[10]};
						willScore = checkIsScore(this.allBoxes[11]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[10]);
						}
					}
					if((i==11) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[11]};
						willScore = checkIsScore(this.allBoxes[11]);
					}
					if((i==11) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[11], this.allBoxes[15]};
						willScore = checkIsScore(this.allBoxes[11]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[15]);
						}
					}
					
					//12 box
					if((i==12) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[12], this.allBoxes[8]};
						willScore = checkIsScore(this.allBoxes[12]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[8]);
						}
					}
					if((i==12) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[12]};
						willScore = checkIsScore(this.allBoxes[12]);
					}
					if((i==12) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[12], this.allBoxes[13]};
						willScore = checkIsScore(this.allBoxes[12]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[13]);
						}
					}
					if((i==12) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[12]};
						willScore = checkIsScore(this.allBoxes[12]);
					}
					
					//13 box
					if((i==13) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[13], this.allBoxes[9]};
						willScore = checkIsScore(this.allBoxes[13]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[9]);
						}
					}
					if((i==13) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[13], this.allBoxes[12]};
						willScore = checkIsScore(this.allBoxes[13]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[12]);
						}
					}
					if((i==13) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[13], this.allBoxes[14]};
						willScore = checkIsScore(this.allBoxes[13]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[14]);
						}
					}
					if((i==13) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[13]};
						willScore = checkIsScore(this.allBoxes[13]);
					}
					
					//14 box
					if((i==14) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[14], this.allBoxes[10]};
						willScore = checkIsScore(this.allBoxes[14]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[10]);
						}
					}
					if((i==14) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[14], this.allBoxes[13]};
						willScore = checkIsScore(this.allBoxes[14]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[13]);
						}
					}
					if((i==14) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[14], this.allBoxes[15]};
						willScore = checkIsScore(this.allBoxes[14]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[15]);
						}
					}
					if((i==14) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[14]};
						willScore = checkIsScore(this.allBoxes[14]);
					}
					
					//15 box
					if((i==15) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[15], this.allBoxes[11]};
						willScore = checkIsScore(this.allBoxes[15]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[11]);
						}
					}
					if((i==15) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[15], this.allBoxes[14]};
						willScore = checkIsScore(this.allBoxes[15]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[14]);
						}
					}
					if((i==15) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[15]};
						willScore = checkIsScore(this.allBoxes[15]);
					}
					if((i==15) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[15]};
						willScore = checkIsScore(this.allBoxes[15]);
					}
					
					this.allBoxes[i][x][0] = 2;
					boolean mmu = moveMakesU(this.tmpAffectedBoxes);
					this.allBoxes[i][x][0] = 0;
					
					if(!(mmu))
					{
						//make this move
						this.allBoxes[i][x][0] = 2;
						return 0;
					}
					
				}
				
			}
			
			
		}
		
		////////////////////////////////////////////
		// j u s t  d o  w h a t s  o p e n       //
		////////////////////////////////////////////
		for(int i = 0; i < this.allBoxes.length; i++)
		{
			for(int x = 0; x < this.allBoxes[i].length; x++)
			{
				
				//line is available. check it.
				if(this.allBoxes[i][x][0] == 0)
				{
					//make this move
					this.allBoxes[i][x][0] = 2;
					return 0;
				}
				
			}
		}
		return 0;
	}
	public int makeDumbMove()
	{
		
		
		
		for(int i = 0; i < this.allBoxes.length; i++)
		{
			for(int x = 0; x < this.allBoxes[i].length; x++)
			{
				
				//line is available. check it.
				if(this.allBoxes[i][x][0] == 0)
				{
					boolean willScore = false;
					
					//0 box
					if((i==0) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[0]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[0]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==0) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[0]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[0]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==0) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[0], this.allBoxes[1]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[0]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[1]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==0) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[0], this.allBoxes[4]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[0]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[4]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//1 box
					if((i==1) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[1]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[1]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==1) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[1], this.allBoxes[0]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[1]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[0]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==1) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[1], this.allBoxes[2]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[1]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[2]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==1) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[1], this.allBoxes[5]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[1]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[5]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//2 box
					if((i==2) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[2]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[2]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==2) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[2], this.allBoxes[1]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[2]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[1]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==2) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[2], this.allBoxes[3]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[2]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[3]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==2) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[2], this.allBoxes[6]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[2]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[6]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//3 box
					if((i==3) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[3]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[3]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==3) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[3], this.allBoxes[2]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[3]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[2]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==3) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[3]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[3]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==3) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[3], this.allBoxes[7]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[3]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[7]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//4 box
					if((i==4) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[4], this.allBoxes[0]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[4]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[0]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==4) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[4]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[4]);
						this.allBoxes[i][x][0] = 0;
						
					}
					if((i==4) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[4], this.allBoxes[5]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[4]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[5]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==4) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[4], this.allBoxes[8]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[4]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[8]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//5 box
					if((i==5) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[1], this.allBoxes[5]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[5]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[1]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==5) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[4], this.allBoxes[5]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[5]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[4]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==5) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[6], this.allBoxes[5]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[5]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[6]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==5) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[5], this.allBoxes[9]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[5]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[9]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//6 box
					if((i==6) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[2], this.allBoxes[6]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[6]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[2]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==6) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[6], this.allBoxes[5]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[6]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[5]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==6) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[6], this.allBoxes[7]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[6]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[7]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==6) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[6], this.allBoxes[10]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[6]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[10]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//7 box
					if((i==7) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[3], this.allBoxes[7]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[7]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[3]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==7) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[7], this.allBoxes[6]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[7]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[6]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==7) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[7]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[7]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==7) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[7], this.allBoxes[11]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[7]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[11]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					
					
					///////////////////////
					
					
					//8 box
					if((i==8) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[8], this.allBoxes[4]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[8]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[5]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==8) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[8]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[8]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==8) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[8], this.allBoxes[9]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[8]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[9]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==8) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[8], this.allBoxes[12]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[8]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[12]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//9 box
					if((i==9) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[9], this.allBoxes[5]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[9]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[6]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==9) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[9], this.allBoxes[8]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[9]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[8]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==9) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[9], this.allBoxes[10]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[9]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[10]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==9) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[9], this.allBoxes[13]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[9]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[13]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//10 box
					if((i==10) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[10], this.allBoxes[6]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[10]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[7]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==10) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[10], this.allBoxes[9]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[10]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[9]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==10) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[10], this.allBoxes[11]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[10]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[11]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==10) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[10], this.allBoxes[14]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[10]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[14]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//11 box
					if((i==11) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[11], this.allBoxes[7]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[11]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[7]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==11) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[11], this.allBoxes[10]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[11]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[10]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==11) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[11]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[11]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==11) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[11], this.allBoxes[15]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[11]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[15]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					
					//12 box
					if((i==12) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[12], this.allBoxes[8]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[12]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[8]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==12) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[12]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[12]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==12) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[12], this.allBoxes[13]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[12]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[13]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==12) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[12]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[12]);
						this.allBoxes[i][x][0] = 0;
					}
					
					//13 box
					if((i==13) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[13], this.allBoxes[9]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[13]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[9]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==13) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[13], this.allBoxes[12]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[13]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[12]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==13) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[13], this.allBoxes[14]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[13]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[14]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==13) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[13]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[13]);
						this.allBoxes[i][x][0] = 0;
					}
					
					//14 box
					if((i==14) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[14], this.allBoxes[10]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[14]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[10]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==14) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[14], this.allBoxes[13]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[14]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[13]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==14) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[14], this.allBoxes[15]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[14]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[15]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==14) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[14]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[14]);
						this.allBoxes[i][x][0] = 0;
					}
					
					//15 box
					if((i==15) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[15], this.allBoxes[11]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[15]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[11]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==15) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[15], this.allBoxes[14]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[15]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[14]);
						}
						this.allBoxes[i][x][0] = 0;
					}
					if((i==15) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[15]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[15]);
						this.allBoxes[i][x][0] = 0;
					}
					if((i==15) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[15]};
						this.allBoxes[i][x][0] = 2;
						willScore = checkIsScore(this.allBoxes[15]);
						this.allBoxes[i][x][0] = 0;
					}
					
					
					
					if((willScore))
					{
						//make this move
						this.allBoxes[i][x][0] = 2;
						
						for(int n = 0; n < this.tmpAffectedBoxes.length; n++)
						{
							if(this.tb.checkIsScore(this.tmpAffectedBoxes[n]))
							{
								this.gb.awardRightfulPoints();
							}
						}
						
						
						return 1;
					}
					
				}
				
			}
		}
		
		///////////////////////////////////////////////////////
		// n o  s c o r e  m o v e s  f o u n d              //
		// t r y i n g  f o r  s a f e  m o v e              //
		///////////////////////////////////////////////////////
		for(int i = 0; i < this.allBoxes.length; i++)
		{
			for(int x = 0; x < this.allBoxes[i].length; x++)
			{
				
				//line is available. check it.
				if(this.allBoxes[i][x][0] == 0)
				{
					boolean willScore = false;
					
					//0 box
					if((i==0) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[0]};
						willScore = checkIsScore(this.allBoxes[0]);
					}
					if((i==0) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[0]};
						willScore = checkIsScore(this.allBoxes[0]);
					}
					if((i==0) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[0], this.allBoxes[1]};
						willScore = checkIsScore(this.allBoxes[0]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[1]);
						}
					}
					if((i==0) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[0], this.allBoxes[4]};
						willScore = checkIsScore(this.allBoxes[0]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[4]);
						}
					}
					
					//1 box
					if((i==1) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[1]};
						willScore = checkIsScore(this.allBoxes[1]);
					}
					if((i==1) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[1], this.allBoxes[0]};
						willScore = checkIsScore(this.allBoxes[1]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[0]);
						}
					}
					if((i==1) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[1], this.allBoxes[2]};
						willScore = checkIsScore(this.allBoxes[1]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[2]);
						}
					}
					if((i==1) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[1], this.allBoxes[5]};
						willScore = checkIsScore(this.allBoxes[1]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[5]);
						}
					}
					
					//2 box
					if((i==2) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[2]};
						willScore = checkIsScore(this.allBoxes[2]);
					}
					if((i==2) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[2], this.allBoxes[1]};
						willScore = checkIsScore(this.allBoxes[2]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[1]);
						}
					}
					if((i==2) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[2], this.allBoxes[3]};
						willScore = checkIsScore(this.allBoxes[2]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[3]);
						}
					}
					if((i==2) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[2], this.allBoxes[6]};
						willScore = checkIsScore(this.allBoxes[2]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[6]);
						}
					}
					
					//3 box
					if((i==3) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[3]};
						willScore = checkIsScore(this.allBoxes[3]);
					}
					if((i==3) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[3], this.allBoxes[2]};
						willScore = checkIsScore(this.allBoxes[3]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[2]);
						}
					}
					if((i==3) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[3]};
						willScore = checkIsScore(this.allBoxes[3]);
					}
					if((i==3) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[3], this.allBoxes[7]};
						willScore = checkIsScore(this.allBoxes[3]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[7]);
						}
					}
					
					//4 box
					if((i==4) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[4], this.allBoxes[0]};
						willScore = checkIsScore(this.allBoxes[4]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[0]);
						}
					}
					if((i==4) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[4]};
						willScore = checkIsScore(this.allBoxes[4]);
						
					}
					if((i==4) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[4], this.allBoxes[5]};
						willScore = checkIsScore(this.allBoxes[4]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[5]);
						}
					}
					if((i==4) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[4], this.allBoxes[8]};
						willScore = checkIsScore(this.allBoxes[4]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[8]);
						}
					}
					
					//5 box
					if((i==5) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[1], this.allBoxes[5]};
						willScore = checkIsScore(this.allBoxes[5]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[1]);
						}
					}
					if((i==5) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[4], this.allBoxes[5]};
						willScore = checkIsScore(this.allBoxes[5]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[4]);
						}
					}
					if((i==5) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[6], this.allBoxes[5]};
						willScore = checkIsScore(this.allBoxes[5]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[6]);
						}
					}
					if((i==5) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[5], this.allBoxes[9]};
						willScore = checkIsScore(this.allBoxes[5]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[9]);
						}
					}
					
					//6 box
					if((i==6) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[2], this.allBoxes[6]};
						willScore = checkIsScore(this.allBoxes[6]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[2]);
						}
					}
					if((i==6) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[6], this.allBoxes[5]};
						willScore = checkIsScore(this.allBoxes[6]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[5]);
						}
					}
					if((i==6) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[6], this.allBoxes[7]};
						willScore = checkIsScore(this.allBoxes[6]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[7]);
						}
					}
					if((i==6) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[6], this.allBoxes[10]};
						willScore = checkIsScore(this.allBoxes[6]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[10]);
						}
					}
					
					//7 box
					if((i==7) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[3], this.allBoxes[7]};
						willScore = checkIsScore(this.allBoxes[7]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[3]);
						}
					}
					if((i==7) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[7], this.allBoxes[6]};
						willScore = checkIsScore(this.allBoxes[7]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[6]);
						}
					}
					if((i==7) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[7]};
						willScore = checkIsScore(this.allBoxes[7]);
					}
					if((i==7) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[7], this.allBoxes[11]};
						willScore = checkIsScore(this.allBoxes[7]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[11]);
						}
					}
					
					
					
					///////////////////////
					
					
					//8 box
					if((i==8) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[8], this.allBoxes[4]};
						willScore = checkIsScore(this.allBoxes[8]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[5]);
						}
					}
					if((i==8) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[8]};
						willScore = checkIsScore(this.allBoxes[8]);
					}
					if((i==8) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[8], this.allBoxes[9]};
						willScore = checkIsScore(this.allBoxes[8]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[9]);
						}
					}
					if((i==8) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[8], this.allBoxes[12]};
						willScore = checkIsScore(this.allBoxes[8]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[12]);
						}
					}
					
					//9 box
					if((i==9) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[9], this.allBoxes[5]};
						willScore = checkIsScore(this.allBoxes[9]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[6]);
						}
					}
					if((i==9) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[9], this.allBoxes[8]};
						willScore = checkIsScore(this.allBoxes[9]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[8]);
						}
					}
					if((i==9) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[9], this.allBoxes[10]};
						willScore = checkIsScore(this.allBoxes[9]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[10]);
						}
					}
					if((i==9) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[9], this.allBoxes[13]};
						willScore = checkIsScore(this.allBoxes[9]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[13]);
						}
					}
					
					//10 box
					if((i==10) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[10], this.allBoxes[6]};
						willScore = checkIsScore(this.allBoxes[10]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[7]);
						}
					}
					if((i==10) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[10], this.allBoxes[9]};
						willScore = checkIsScore(this.allBoxes[10]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[9]);
						}
					}
					if((i==10) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[10], this.allBoxes[11]};
						willScore = checkIsScore(this.allBoxes[10]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[11]);
						}
					}
					if((i==10) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[10], this.allBoxes[14]};
						willScore = checkIsScore(this.allBoxes[10]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[14]);
						}
					}
					
					//11 box
					if((i==11) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[11], this.allBoxes[7]};
						willScore = checkIsScore(this.allBoxes[11]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[7]);
						}
					}
					if((i==11) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[11], this.allBoxes[10]};
						willScore = checkIsScore(this.allBoxes[11]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[10]);
						}
					}
					if((i==11) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[11]};
						willScore = checkIsScore(this.allBoxes[11]);
					}
					if((i==11) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[11], this.allBoxes[15]};
						willScore = checkIsScore(this.allBoxes[11]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[15]);
						}
					}
					
					//12 box
					if((i==12) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[12], this.allBoxes[8]};
						willScore = checkIsScore(this.allBoxes[12]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[8]);
						}
					}
					if((i==12) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[12]};
						willScore = checkIsScore(this.allBoxes[12]);
					}
					if((i==12) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[12], this.allBoxes[13]};
						willScore = checkIsScore(this.allBoxes[12]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[13]);
						}
					}
					if((i==12) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[12]};
						willScore = checkIsScore(this.allBoxes[12]);
					}
					
					//13 box
					if((i==13) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[13], this.allBoxes[9]};
						willScore = checkIsScore(this.allBoxes[13]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[9]);
						}
					}
					if((i==13) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[13], this.allBoxes[12]};
						willScore = checkIsScore(this.allBoxes[13]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[12]);
						}
					}
					if((i==13) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[13], this.allBoxes[14]};
						willScore = checkIsScore(this.allBoxes[13]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[14]);
						}
					}
					if((i==13) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[13]};
						willScore = checkIsScore(this.allBoxes[13]);
					}
					
					//14 box
					if((i==14) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[14], this.allBoxes[10]};
						willScore = checkIsScore(this.allBoxes[14]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[10]);
						}
					}
					if((i==14) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[14], this.allBoxes[13]};
						willScore = checkIsScore(this.allBoxes[14]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[13]);
						}
					}
					if((i==14) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[14], this.allBoxes[15]};
						willScore = checkIsScore(this.allBoxes[14]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[15]);
						}
					}
					if((i==14) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[14]};
						willScore = checkIsScore(this.allBoxes[14]);
					}
					
					//15 box
					if((i==15) && (x==0))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[15], this.allBoxes[11]};
						willScore = checkIsScore(this.allBoxes[15]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[11]);
						}
					}
					if((i==15) && (x==1))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[15], this.allBoxes[14]};
						willScore = checkIsScore(this.allBoxes[15]);
						if(!willScore)
						{
							willScore = checkIsScore(this.allBoxes[14]);
						}
					}
					if((i==15) && (x==2))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[15]};
						willScore = checkIsScore(this.allBoxes[15]);
					}
					if((i==15) && (x==3))
					{
						this.tmpAffectedBoxes = new int[][][]{this.allBoxes[15]};
						willScore = checkIsScore(this.allBoxes[15]);
					}
					
					
					
					if(!(moveMakesU(this.tmpAffectedBoxes)))
					{
						//make this move
						this.allBoxes[i][x][0] = 2;
						return 0;
					}
					
				}
				
			}
			
			
		}
		
		////////////////////////////////////////////
		// j u s t  d o  w h a t s  o p e n       //
		////////////////////////////////////////////
		for(int i = 0; i < this.allBoxes.length; i++)
		{
			for(int x = 0; x < this.allBoxes[i].length; x++)
			{
				
				//line is available. check it.
				if(this.allBoxes[i][x][0] == 0)
				{
					//make this move
					this.allBoxes[i][x][0] = 2;
					return 0;
				}
				
			}
		}
		return 0;
	}
}

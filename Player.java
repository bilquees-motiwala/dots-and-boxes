public class Player {

	int playerType;
	int points;
	boolean hasTurn;
	
	public Player(int p)
	{
		this.playerType = p;
		this.points = 0;
		this.hasTurn = false;
	}
	public void setType(int i)
	{
		this.playerType = i;
	}
	
	public void switchTurn()
	{
		if(this.hasTurn)
		{
			this.hasTurn = false;
		}
		else
		{
			this.hasTurn = true;
		}
		
		//System.out.println("Player " + this.playerType + "  is now " + this.hasTurn);
	}
	
	public void setTurn(Boolean turn)
	{
		this.hasTurn = turn;
	}
	
	public boolean getHasTurn()
	{
		return this.hasTurn;
	}
	
	public void scorePoints()
	{
		this.points += 1;
	}
	
	public int getScore()
	{
		return this.points;
	}
}


package unite;

public interface Bank {
	//mauvais car on impl�m�nte pas une interface
	public default int addSolde(int solde,int terme) 
	{
		return solde + terme;
	}
	
	public default int subSolde(int solde,int terme) 
	{
		return solde - terme;	
	}
	
	//Cr�ation de m�thode abtraite
	

}

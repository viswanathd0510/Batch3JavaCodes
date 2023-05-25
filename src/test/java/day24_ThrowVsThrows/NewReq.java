package day24_ThrowVsThrows;

import java.util.Scanner;

public class NewReq {
	
	// Req is ur bal is 1000 rs 
	// If u r debiting more than ur bal it should throw insufficent bala
	
	int bal = 1000 ;
	
	public int debit()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Amount to the withdraw");
		int with = s.nextInt();
		
		try
		{
			if(with>bal)
			{
				throw new InsufficException(with-bal);
			}
				
		}
		catch(InsufficException e)
		{
			System.out.println(e);
		}
		return bal ;
		
	}

	

}

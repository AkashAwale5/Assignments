package tdd;

public class Ass8 
{
	
		public static boolean check_even()
		{
		  int a[]= {12,13,14,15,16,17,21};
		
		  for (int i = 0; i < a.length; i++) 
		  {
			if(a[i]%2==0)
			{
				return true;	
				
			}
		  }
		return false;
		}
	
}

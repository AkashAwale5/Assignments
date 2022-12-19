package tdd;

public class Singleton_Q11
{
	private static Singleton_Q11 st=new Singleton_Q11();
	private Singleton_Q11() 
	{
		
	}
   static Singleton_Q11 geSingleton_Q11() 
   {
	   return st;
   }
}
   class SingletonCheck
   {
	  public static boolean check(Singleton_Q11 st1,Singleton_Q11 st2) 
	  {
		if (st1.hashCode()==st2.hashCode()) {
			return true;
			
		}else
			return false;
	  }
}

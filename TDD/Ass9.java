package tdd;

public class Ass9
{
	public static String remove_space()
	{
		String s="This @ Red $car-.";// This red car.
		String s1="";
		int j=0;
		for (int i = 0; i < s.length(); i++)
		{
			if(i==0 && s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				s1=s1+s.charAt(i);
			}
			if(s.charAt(i)==' ' && s.charAt(i+1)>='A' && s.charAt(i+1)<='Z')
			{
				j=i+1;
				char ch=s.charAt(i+1);
				ch= (char) (ch+32);
				//System.out.println(ch);
				s1=s1+ch;	
				
			}
			else if(i!=j && s.charAt(i)>='a' && s.charAt(i)<='z'||i!=j && s.charAt(i)>='A' && s.charAt(i)<='Z' ||s.charAt(i)==' ')
			{
				s1=s1+s.charAt(i);
			}
			
		}
		//System.out.println(s1);
		return s1;
	}
	public static void main(String[] args)
	{
		Ass9 obj= new Ass9();		
		System.out.println(obj.remove_space());
	}
}

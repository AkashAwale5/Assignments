package tdd;

public class Ass6
{
	public static int check_vowels()
	{
		String s="Aeroplane";
		int cnt=0;
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'|| s.charAt(i)=='i' ||s.charAt(i)=='o' |s.charAt(i)=='u')
			{
				cnt++;
			}
			else if(s.charAt(i)=='A'||s.charAt(i)=='E'|| s.charAt(i)=='I' ||s.charAt(i)=='O' |s.charAt(i)=='U')
			{
				cnt++;
			}
		}
		return cnt;
	}
}

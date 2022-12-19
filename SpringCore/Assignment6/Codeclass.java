package ass6;
//. WAP to inject multiple names to a beans and break the names in to array of string and find
//out the string which is having no vowel in it.
public class Codeclass 
{
	String myarray[]= new String[10];

	public Codeclass(String[] myarray)
	{
		super();
		this.myarray = myarray;
	}
	
	public void method_vowel()
	{
		
		String s="";
		for (int i = 0; i < myarray.length; i++) 
		{

			char ch[]=myarray[i].toCharArray();	
			int cnt=0;
			for (int j = 0; j < ch.length; j++)
			{
				char c=ch[j];
				
				if(c !='a' && c !='e' && c!='i'&& c !='o' && c !='u' &&c !='A' && c !='E' && c!='I'&&c !='O' && c !='U')
				{
					cnt++;
				}					
			}
			if(cnt==ch.length)
			{
				s=new String(ch);
				System.out.print(s+" ");
			}
		}
		
	}
}

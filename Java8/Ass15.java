package assignments;
//From a given set of numbers in array, you need to find out how many number satisfy the 
//Pythagoras template

public class Ass15 
{

	public static void main(String[] args) 
	{
		int a[]= {6,8,10,4,5,3,4,13,12,5};
		
//		for(int i=0;i<a.length-2;i++)
//		{
//			if(a[i]*a[i]==(a[i+1]*a[i+1] + a[i+2]*a[i+2]))
//			{
//				System.out.println(a[i]+" "+a[i+1]+" "+a[i+2]);
//			}
//		}
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					if(a[i]*a[i]==(a[j]*a[j] + a[k]*a[k]) || a[j]*a[j]==(a[i]*a[i] + a[k]*a[k]) || a[k]*a[k]==(a[j]*a[j] + a[i]*a[i]))
						{
							System.out.println(a[i]+" "+a[j]+" "+a[k]);
							count++;
						}
				}
			}
		}
		System.out.println("No of tripletes verify Pythagors "+count);
	}

}
//5 = 3 + 4
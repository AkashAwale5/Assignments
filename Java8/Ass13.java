package assignments;

public class Ass13
{
//1-3,6-8,10-14,17-20

	public static void main(String[] args)
	{
		int a[]= {1,2,3,6,7,8,10,11,12,13,14,17,18,19,20};//14 13
		int start=0;//1
		int end=0;
		int temp;
		for(int i=0;i<a.length-1;i++)
		{
			if(i==0)	
			{
				start=a[0];
				for(int k=i;k<a.length-1;k++)
				{
					if(a[k+1]-1 != a[k])
					{
						end=a[k];
						break;
					}
				}
			 System.out.println(start+"-"+end);
			}
			else if(a[i+1]-a[i]>=2)	
			 {				
				start=a[i+1];
				for(int k=i+1;k<a.length-1;k++)
				{
					if(a[k+1]-1 != a[k])
					{
						end=a[k];
						break;
					}
					if(k==(a.length-2))
					{
						end=a[a.length-1];
					}
				}				
				System.out.println(start+"-"+end);
			 }
				
		}

	}
}

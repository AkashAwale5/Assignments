package tdd;

public class Ass12 implements Cloneable
{
	 int id;
	 String name;
	public Ass12(int id, String name)
	{
		super();
		this.id = id;
		this.name = name;
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	 
	public static boolean checkClone(Ass12 s1, Ass12 s2)
	{
		if(s1.id==s2.id && s1.name==s2.name)
			return true;
		else
			return false;
	}
}

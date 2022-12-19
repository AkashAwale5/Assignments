package ass1;
//WAP in spring core to demonstrate role based object creation using factory method.


public class item 
{
	
	 private item()
	 {
		 System.out.println("constructor of item is called");
	 }
	 public static item getObjA()
	 {	 
		 return new item();
	 }
	 public void show()
	 {
		 System.out.println("hello from show method");	 		
	 }
}

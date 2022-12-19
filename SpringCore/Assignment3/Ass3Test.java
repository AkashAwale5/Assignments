package ass3;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ass3Test {

	public static void main(String[] args)
	{
		ApplicationContext obj= new ClassPathXmlApplicationContext("applicationContext.xml");
		EMI objemi= (EMI) obj.getBean("emibean");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Loan Amount");
		objemi.setLoanamount(sc.nextInt());
		System.out.println("Enter no of years");
		objemi.setYears(sc.nextInt());
		
		objemi.emiCalculator();
		
	}

}

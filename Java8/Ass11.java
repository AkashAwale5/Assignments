package assignments;

import java.util.stream.IntStream;

public class Ass11 {

	public static void main(String[] args)
	{
		System.out.println("Normal output,,,,,,,,,,,,");
		IntStream test=IntStream.rangeClosed(1, 10);
		test.forEach(System.out::println);
		
		System.out.println("parellel output,,,,,");
		IntStream test2=IntStream.rangeClosed(1, 10);
		test2.parallel().forEach(System.out::println);
	}

}

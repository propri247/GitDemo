package qaclickacademy;

import org.testng.annotations.Test;

public class Day2Test {

	@Test
	public void Notepad()
	{
		System.out.println("Notepad");
	}
	
	@Test
	public void Wordpad()
	{
		System.out.println("Wordpad");
		System.out.println("Notepad");
	}
	
	@Test
	public void Excel()
	{
		System.out.println("Excel");
	}
}

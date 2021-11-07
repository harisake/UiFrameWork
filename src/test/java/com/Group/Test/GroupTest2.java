package com.Group.Test;

import org.testng.annotations.Test;

public class GroupTest2 {
	
	
	
	@Test(groups= {"smoke"})
	public void Test5()
	{
		System.out.println("test5");
	}
	@Test(groups= {"sanity","regression","functional"})
	public void Test6()
	{
		System.out.println("test6");
	}
	@Test
	public void Test7()
	{
		System.out.println("test7");
	}
//	@Test
//	public void Test8()
//	{
//		System.out.println("test8");
//	}
//	@Test
//	public void Test9()
//	{
//		System.out.println("test9");
//	}

}

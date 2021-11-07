package com.Group.Test;

import org.testng.annotations.Test;

public class GroupTest1 {
	
	
	@Test(groups={"smoke","functional","sanity"})
	public void Test1()
	{
		System.out.println("test1");
	}

	@Test(groups= {"sanity","smoke"})
	public void Test2()
	{
		System.out.println("test2");
	}
	@Test(groups= {"functional","regression","smoke"})
	public void Test3()
	{
		System.out.println("test3");
	}
	@Test(groups= {"functional"})
	public void Test4()
	{
		System.out.println("test4");
	}

}

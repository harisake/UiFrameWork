package com.Hari.Test;

import org.testng.annotations.Test;

public class FlightBookingTest {


@Test(priority =1)
	public void Signup()
	{
		System.out.println("signup");
	}
@Test(priority=2)
	public void Login()
	{
		System.out.println("Login");
	}
@Test(priority=3)
	public void SearchForTheFlight()
	{
		System.out.println("search for the flight");
	}
@Test(priority=4)
	public void BookTheFlight()
	{
		System.out.println("book the flight");
	}
@Test(priority=5)
	public void SaveTheTicket()
	{
		System.out.println("save the ticket");
	}
@Test(priority=6)
	public void Logout()
	{

		System.out.println("logout");
	}





}

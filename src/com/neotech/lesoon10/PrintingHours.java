package com.neotech.lesoon10;

public class PrintingHours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//print hours and minutes in digital clock
		//00:00
		//00:01
		//.....
		
		for (int hour = 0; hour <24; hour++)
		{
			for(int minute = 0; minute < 60; minute++)
			{
				if (hour < 10 && minute < 10)
				{
					System.out.println("0" + hour + ":" + "0" + minute);
				}
				else if (hour >= 10 && minute < 10)
				{
					System.out.println(hour + ":" + "0" + minute);
				}
				else if (hour < 10 && minute >= 10)
				{
					System.out.println("0" + hour + ":" + minute);
				}
				else
				{
					System.out.println(hour + ":" + minute);
				}
			}
		}
	}

}

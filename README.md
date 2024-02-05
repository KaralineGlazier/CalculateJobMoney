# CalculateJobMoney

## Synopsis
This program is used to calculate how much money is made per hour in a job that doesn't pay by the hour or that includes a payment not by the hour. Payment information is entered in by the week and the information and calculations for each week is displayed. The program can also show the average amount of made made per hour in a month when averaging the weeks.

## Motivation
This program was created for a class project. It is a project that I have found useful in my own job for quick calculations, and I wanted to create a useful program. 

## How To Use
The files needed in order for this program to run are the Job.java file, and the TestJob.java file. The file to run is the TestJob.java file. Once the program is running, use the keyboard as input and follow the instructions on the console.  
![Screenshot (9)](https://github.com/KaralineGlazier/CalculateJobMoney/assets/148881979/4df4fae4-f28b-44c6-9779-1f3bbd9d203d)


## Code Example
This code snippet displays the information for the money made in a week. It uses the methods in the Job class to make the calculations for the week. 
```
public static void weeklyStats(Job week) {
		System.out.println("Hours worked: " + week.getHours());
		System.out.printf("Money Per Hour: $%4.2f", week.getPerHour());
		System.out.println();
		System.out.printf("Tips: $%4.2f", week.getTips());
		System.out.println();
		System.out.printf("Delivery Fee: $%4.2f", week.getDeliveryFee());
		System.out.println();
		System.out.printf("Total money made this week is $%4.2f", week.totalMoney());
		System.out.println();
		System.out.printf("Money made per hour this week is $%4.2f per hour", week.totalPerHour());
		System.out.println();
		System.out.printf("The total money that is not for gas is $%4.2f", week.moneyNotForGas());
		System.out.println();
		System.out.printf("Total deducted money is $%4.2f", week.deductedMoney(10));
		System.out.println();
	}
```

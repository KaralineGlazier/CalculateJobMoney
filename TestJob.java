package jobmoney_final;
import java.util.Scanner;
/**
 * <h1> Test Job </h1>
 * <p> This class displays how much money one has made in an hour when combining different types of payments from a job. The calculations for this class are used
 * by creating a Job object from the Job class. </p>
 * 
 * <p>Created: 02/02/2024</p>
 * 
 * @author Karaline Glazier
 *
 */
public class TestJob {
	/**
	 * This is the made method in the TestJob class. This is the method used to create Job objects, 
	 * display information to the console, and allow the user to input information.
	 * 
	 * @param args (String[]; unused)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Job week1 = new Job(8, 8.50, 27.00, 32.00);
		Job week2 = new Job(5, 8.50 , 15.00, 12.00);
		Job week3 = new Job(20, 8.50, 50, 38);
		Job week4 = new Job(18, 8.50, 60, 28.50);
		while (true) {
			System.out.println("Enter the week you would like to edit (to view the stats of each week enter 0)");
			int result = input.nextInt();
			if (result == 1) {
				System.out.println("What were your total number of hours for week 1? ");
				enterInfo(week1);
				}
			
			else if (result == 2) {
				System.out.println("What were your total number of hours for week 2? ");
				enterInfo(week2);				
			}
			
			else if (result == 3) {
				System.out.println("What were your total number of hours for week 3? ");
				enterInfo(week3);
			}
			
			else if (result == 4) {
				System.out.println("What were your total number of hours for week 4? ");
				enterInfo(week4);
			}
			
			else if (result == 0) {
				int answer = 0;
				while(answer != 5) {
					System.out.println("Which week would you like to view? Enter 1, 2, 3, 4, or 5 to go back to editing.");
					System.out.println("Or enter 0 to see the monthly average of money made per hour");
					answer = input.nextInt();
					if (answer == 1) {
						System.out.println("Week 1: ");
						weeklyStats(week1);
					}
				
					else if (answer == 2) {
						System.out.println("Week 2: ");
						weeklyStats(week2);
					}
				
					else if (answer == 3) {
						System.out.println("Week 3: ");
						weeklyStats(week3);
					}
					else if (answer == 4) {
						System.out.println("Week 4: ");
						weeklyStats(week4);
									}
					else if (answer == 0) {
						calculateMonth(week1, week2, week3, week4); 
					}
					else if (answer == 5) {
						continue;
					}
					else {
						System.out.println("Invalid input. Enter a number 1 through 4");
						continue;
					}
				}
			}
			else {
				System.out.println("Invalid number. Enter a valid number option.");
				continue;
			}
		}
	}
	/**
	 * This method is used to calculate the average of money made per hour in a month. 
	 * 
	 * 
	 * 
	 * @param week1 (Job; represents the first Job object in the calculation)
	 * @param week2 (Job; represents the second Job object in the calculation)
	 * @param week3 (Job; represents the third Job object in the calculation)
	 * @param week4 (Job; represents the fourth Job object in the calculation)
	 */
	public static void calculateMonth(Job week1, Job week2, Job week3, Job week4) {
		double weekOne = (week1.getTips() / week1.getHours()) + (week1.getDeliveryFee() / week1.getHours()) + (week1.getPerHour());
		double weekTwo = (week2.getTips() / week2.getHours()) + (week2.getDeliveryFee() / week2.getHours()) + (week2.getPerHour());
		double weekThree = (week3.getTips() / week3.getHours()) + (week3.getDeliveryFee() / week3.getHours()) + (week3.getPerHour());
		double weekFour = (week4.getTips() / week4.getHours()) + (week4.getDeliveryFee() / week4.getHours()) + (week4.getPerHour());
		System.out.print("The monthly average for money made per hour is $");
		System.out.printf("%4.2f", (weekOne + weekTwo + weekThree + weekFour) / 4);
		System.out.println(" per hour");
	}
	/**
	 * This method is used to display the information and calculations of each week.
	 * This method was created to avoid repeating the same code.
	 * 
	 * @param week (Job; this parameter represents the week's information (or the Job object's information) that is being displayed)
	 */
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
	/**
	 * This method is used to enter in the information money made for a week.
	 * @param week (Job, this parameter represents the week (or Job object) thats information is being entered.)
	 */
	public static void enterInfo(Job week) {
		Scanner input = new Scanner(System.in);
		double newHours = input.nextDouble();
		week.setHours(newHours);
		System.out.println("How much do you make per hour? ");
		double newPerHour = input.nextDouble();
		week.setPerHour(newPerHour);
		System.out.println("How much money did you make in tips for this week?");
		double newTips = input.nextDouble();
		week.setTips(newTips);
		System.out.println("How much money did you make from the delivery fee this week?");
		double newDeliveryFee = input.nextDouble();
		week.setDeliveryFee(newDeliveryFee);
	}
}
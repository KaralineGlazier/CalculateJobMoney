
package jobmoney_final;
/**
 * <h1> Job </h1>
 * <p> This class is used to make calculations for money made in a job. A Job object can be created from this class.</p>
 *  
 * <p>Created: 02/02/2024</p>
 * 
 * @author Karaline Glazier
 *
 */
public class Job {
	private double tips = 1;
	private double perHour = 8.50;
	private double deliveryFee = 1;
	private double hours = 1;
	/**
	 * This is the no arg constructor for the Job class. This constructor uses the default parameters to construct a job object if no information is entered. 
	 */
	Job() {
		
	}
	/**
	 * This is the constructor for the Job class. This constructor creates a Job object using the parameters entered.
	 * @param hours (double; represents the number of hours worked for this object)
	 * @param perHour (double; represents the amount of money someone is getting paid in an hour)
	 * @param tips (double; represents the extra money one is given in their work time for the object)
	 * @param deliveryFee (double; represents the gas money (or any money used for a particular item that is used for their job) that was earned for this object)
	 */
	Job(double hours,  double perHour, double tips, double deliveryFee) {
		this.tips = tips;
		this.perHour = perHour;
		this.deliveryFee = deliveryFee;
		this.hours = hours;
	}
	/**
	 * This method is used to change the amount of the variable named hours. 
	 * @param hours (double; this parameter represents the new amount of the variable hours)
	 */
	public void setHours(double hours) {
		this.hours = hours;
	}
	/**
	 * This method is used to change the amount of the variable named tips. 
	 * @param tips (double; this parameter represents the new amount of the variable tips)
	 */
	public void setTips(double tips) {
		this.tips = tips;
	}
	/**
	 * This method is used to change the amount of the variable named perHour.
	 * @param perHour (double; this parameter represents the new amount of the variable perHour)
	 */
	public void setPerHour(double perHour) {
		this.perHour = perHour;
	}
	/**
	 * This method is used to change the amount of the variable named deliveryFee. 
	 * @param deliveryFee (double; this parameter represents the new amount of the variable deliveryFee)
	 */
	public void setDeliveryFee(double deliveryFee) {
		this.deliveryFee = deliveryFee;
	}
	/**
	 * This method is used to retrieve the tips amount from an object.
	 * @return (double; this represents the money made from tips or the extra money made that is not paid by hour)
	 */
	public double getTips() {
		return tips;
	}
	/**
	 * This method is used to retrieve the hours amount from an object.
	 * @return (double; this represents the amount of hours worked)
	 */
	public double getHours() {
		return hours;
	}
	/**
	 * This method is used to retrieve the perHour amount from an object. 
	 * @return (double; this represents the money made in an hour)
	 */
	public double getPerHour() {
		return perHour;
	}
	/**
	 * This method is used to retrieve the deliveryFee amount from an object.
	 * @return (double; this represents the money made from delivery fees)
	 */
	public double getDeliveryFee() {
		return deliveryFee;
	}
	/**
	 * This method is used to calculate the total amount of money made for a Job object. 
	 * @return (double; this represents the equation used to add up all forms of payment (listed in the parameter when creating a Job object) to get a total amount)
	 */
	public double totalMoney () {
		return (hours * perHour) + tips + deliveryFee;
	}
	/**
	 * This method is used to calculate the money made per hour when factoring in the tips and delivery money made.  
	 * @return (double; this represents the equation that results in the total amount of money made in an hour)
	 */
	public double totalPerHour () {
		return (perHour) + (tips / hours) + (deliveryFee / hours);
	}
	/**
	 * This method is used to calculate the total amount of money in an object without including the money that was paid for from
	 * the delivery fee which is only used for gas
	 * @return (double; this represents the equation for the total amount of money made without including the delivery fee parameter)
	 */
	public double moneyNotForGas () {
		return (perHour * hours) + tips;
	}
	/**
	 * This method is used to calculate a percentage of money that can be put away, or the money being spent.
	 * 
	 * @param deductionPercent (double; this parameter represents the percentage of money that is being calculated)
	 * 
	 * @return (double; this represents the calculation used to find a percentage of money from the total amount of money)
	 */
	public double deductedMoney (double deductionPercent) {
		return ((hours * perHour) + tips) * (deductionPercent * 0.01);
	}
}
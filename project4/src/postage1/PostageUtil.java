package postage1;
import java.util.Scanner;

public class PostageUtil
{
	
	
	public static void main(String[] args)
	{
		double value;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the weights of your package: ");
		
		value = in.nextDouble();
		
		System.out.println(computePostage(value));
	}
	/**
	 * Returns the cost of postage for a letter of the given weight.
	 * @param weight
	 *   given weight in ounces
	 * @return
	 *   cost of postage for the weight
	 */
	public static double computePostage(double weight)
	{
		double cost = 0;
		if (weight <= 1)
		{
			cost = 0.47;
		}
		else
		{
			if (weight <= 3.5)
			{
				cost = 0.47 + Math.ceil(weight - 1) * 0.21;
			}
			else
			{
				cost = 0.94 + Math.ceil(weight - 1) * 0.21;
			}
		}
		return cost;
	}
}
package sumint;


/**
 * Class to compute sum of two integers
 * @author YETISH
 *
 */
public class Sum 
{
	/**
	 * Method which computes sum of two integers
	 * @param num1
	 * @param num2
	 */
	public int sum(int num1, int num2)
	{
		return(num1 + num2);
	}
	
	public static void main(String[] args) 
	{
		int input1 = 10;
		int input2 = 20;
		
		System.out.println(new Sum().sum(input1, input2));
	}
}

package lab03.exercises;

public class GCD
{    
    public static int GCD(int a, int b)
    {
    	while (b != 0)
    	{
    		return GCD(b, a % b);
    	}
    	return a;
    }
    
}
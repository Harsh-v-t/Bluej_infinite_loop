import java.util.*;

public class InfiniteLoop
{
    public static void main(String[] args)
    {
        int x = 1;
        System.out.println("Running...");
        while (x > 0)
        {
            if (x == -1) {
                System.out.println("x is -1");
                break;
            } 
            else {
                System.out.println("x is not -1");
            }
            x++;
        }
        System.out.println("Terminating...");
    }
	
	public static void inputThis()
   	{
            int x;
            Scanner kbd = new Scanner(System.in);
            x = kbd.nextInt();
	}
    
}
package Aug3;

public class MathMain {
  public static void mathcheck( int a, IEvenChecker check )
    {
        if(check.checkEven(a))
        {
            System.out.println("No is Even");
        }
        else
        {
            System.out.println("No is odd");
        }
    }
}

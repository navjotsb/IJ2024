package Aug3;

public class EvenCheckerMain {

    public static void main(String[] args) {
        IEvenChecker check = a -> a%2==0;

        boolean isEven = check.checkEven(57);
        System.out.println(isEven);
        MathMain.mathcheck(34, a -> a%2==0);
    }
}

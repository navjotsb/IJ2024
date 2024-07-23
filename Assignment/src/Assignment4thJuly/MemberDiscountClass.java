package Assignment4thJuly;

public class MemberDiscountClass implements Discount{

    @Override
    public double applyDiscount(double price)
    {
        return(price*0.90);
    }

}

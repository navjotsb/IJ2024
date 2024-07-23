package Assignment4thJuly;

public class MemberDiscountClass implements Discount{

    default double applyDiscount(double price)
    {
        return(price*0.90);
    }

}

package Example1;

public class Runner {
    public static void main(String[] args) {
        ICoupon coupon = CouponFactory.getCoupon("Jumbo");
        printCouponDetails(coupon);

        ICoupon couponP = CouponFactory.getCoupon("Party");
        printCouponDetails(couponP);
    }
    private static void printCouponDetails(ICoupon coupon){
        System.out.println(coupon.getCode()+"\n"+coupon.getCouponMsg()+"\n"+coupon.getCouponDiscount());
    }
}

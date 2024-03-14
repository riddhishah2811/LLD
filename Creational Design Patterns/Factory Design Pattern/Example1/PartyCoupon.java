package Example1;

public class PartyCoupon implements ICoupon{

    private String code;
    private String couponMsg;
    private Double couponVal;

    public PartyCoupon(){
        code = "PARTY";
        couponMsg ="Yay, you unlocked Party Coupon!!";
        couponVal = 50.0;
    }
    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getCouponMsg() {
        return couponMsg;
    }

    @Override
    public Double getCouponDiscount() {
        return couponVal;
    }
    
}

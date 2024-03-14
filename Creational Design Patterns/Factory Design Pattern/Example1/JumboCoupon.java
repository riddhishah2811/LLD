package Example1;

public class JumboCoupon implements ICoupon{

    private String code;
    private String couponMsg;
    private Double couponVal;

    public JumboCoupon(){
        code = "JUMBO";
        couponMsg ="Yay, you unlocked Jumbo Coupon!!";
        couponVal = 100.0;
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

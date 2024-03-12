public class BillPugh {

    private BillPugh(){}

    private static class SingletonHelper{
        private static final BillPugh b= new BillPugh();
    }

    public static BillPugh getInstance(){
        return SingletonHelper.b;
    }

}

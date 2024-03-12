public class DoubleCheckedLocking {
    private static DoubleCheckedLocking doubleCheckedLocking;

    private DoubleCheckedLocking(){}

    public static DoubleCheckedLocking getInstance(){
        if(doubleCheckedLocking == null){
            synchronized(DoubleCheckedLocking.class){
                if(doubleCheckedLocking == null){
                    doubleCheckedLocking = new DoubleCheckedLocking();
                }
            }
        }
        return doubleCheckedLocking;
    }

    public int hashCode1() {
        return this.hashCode();
    }  
}

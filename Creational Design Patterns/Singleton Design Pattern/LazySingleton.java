// If one thread already called the getInstance before the other,second time getInstance called , the same istance will be returned.
public class LazySingleton {
    public static LazySingleton lazySingleton;

    private LazySingleton(){}
    
    public static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton =  new LazySingleton();
        }
        return lazySingleton;
    }

    public int hashCode1() {
        return this.hashCode();
    }  
}
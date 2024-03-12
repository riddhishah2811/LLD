public class StaticSingleton {
    private static StaticSingleton staticSingleton;

    private StaticSingleton(){}

    static{
        staticSingleton = new StaticSingleton();
    }

    public static StaticSingleton getInstance(){
        return staticSingleton;
    }

    public int hashCode1() {
        return staticSingleton.hashCode();
    }  
}

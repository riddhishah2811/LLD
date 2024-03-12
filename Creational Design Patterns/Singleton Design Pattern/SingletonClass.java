

class SingletonClass{
    public static void main(String args[]){
        Container c = Container.getInstance();
        // Simple Singleton Example
        System.out.println("Simple Singleton -->");
        System.out.println(c.hashCode1());
        System.out.println(c.hashCode1());
        System.out.println(c.hashCode1());
        System.out.println(c.hashCode1());

        // Static Singleton Example
        System.out.println("Static Singleton -->");
        StaticSingleton staticSingleton = StaticSingleton.getInstance();
        System.out.println(staticSingleton.hashCode1());
        System.out.println(staticSingleton.hashCode1());
        System.out.println(staticSingleton.hashCode1());

        
    }
}
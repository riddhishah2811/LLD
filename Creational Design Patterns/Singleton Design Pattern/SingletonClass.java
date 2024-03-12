

class SingletonClass{
    public static void main(String args[]){
        Container c = Container.getInstance();
        // Simple Singleton Example
        System.out.println(c.hashCode1());
        System.out.println(c.hashCode1());
        System.out.println(c.hashCode1());
        System.out.println(c.hashCode1());

        
    }
}
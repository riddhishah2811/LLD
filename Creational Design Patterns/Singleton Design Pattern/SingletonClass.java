

class SingletonClass{
    public static void main(String args[]){
        Container c = Container.getInstance();
        // Simple Singleton Example / Eager Instatiation
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

        // Lazy Instatiation

        System.out.println("Lazy Singleton without thread-->");
        LazySingleton l = LazySingleton.getInstance();
        System.out.println(l.hashCode1());
        System.out.println(l.hashCode1());
        System.out.println(l.hashCode1());

        System.out.println("Lazy Singleton with thread-->");
        // With  Thread we are getting different hashcode, so resolve this we have to use synchronization
        for(int i=0;i<3;i++){
            MyThread thread = new MyThread();
            Thread t = new Thread(thread,"Thread - "+i);
            t.start();
        }

    }

    
}
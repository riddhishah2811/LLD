

class SingletonClass{
    public static void main(String args[]) throws InterruptedException{
        Container c = Container.getInstance();
        // Simple Singleton Example / Eager Instatiation
        System.out.println("\nSimple Singleton -->");
        System.out.println(c.hashCode1());
        System.out.println(c.hashCode1());
        System.out.println(c.hashCode1());
        System.out.println(c.hashCode1());

        // Static Singleton Example
        System.out.println("\nStatic Singleton -->");
        StaticSingleton staticSingleton = StaticSingleton.getInstance();
        System.out.println(staticSingleton.hashCode1());
        System.out.println(staticSingleton.hashCode1());
        System.out.println(staticSingleton.hashCode1());

        // Lazy Instatiation - ex . Loading application one time, We can make only one connection between application and database, FileWriter
        // Program - set of instructions, process- a program that exected in memory,thread - a smallest unit of execution in the process.
        System.out.println("\nLazy Singleton without thread-->");
        LazySingleton l = LazySingleton.getInstance();
        System.out.println(l.hashCode1());
        System.out.println(l.hashCode1());
        System.out.println(l.hashCode1());

        System.out.println("\nLazy Singleton with thread-->");
        
        for(int i=0;i<3;i++){
            MyThread thread = new MyThread();
            Thread t = new Thread(thread,"Thread - "+i);
            t.start();
        }
        Thread.sleep(10);
        // Lazy with Synchronized method
        System.out.println("\nLazy Synchronized Singleton with thread-->");
        for(int i=0;i<3;i++){
            SyThread th = new SyThread();
            Thread t = new Thread(th,"SyThread - "+i);
            t.start();
        }
        Thread.sleep(10);

        // Double checked locking
        System.out.println("\nOptimized Thread Safe Singleton (Double Checked Locking)-->");
        DoubleCheckedLocking doubleCheckedLocking = DoubleCheckedLocking.getInstance();
        System.out.println(doubleCheckedLocking.hashCode1());
        System.out.println(doubleCheckedLocking.hashCode1());
        System.out.println(doubleCheckedLocking.hashCode1());

        // BillPugh
        System.out.println("\nBill Pugh Singleton Pattern-->");
        BillPugh billPugh = BillPugh.getInstance();
        System.out.println(billPugh.hashCode());
        System.out.println(billPugh.hashCode());
        System.out.println(billPugh.hashCode());

        // Enum Singleton
        System.out.println("\nEnum Singleton Pattern-->");
        Singleton s = Singleton.SINGLETON;
        System.out.println(s.hashCode());
        System.out.println(s.hashCode());
        System.out.println(s.hashCode());
        
    }

}
//  In this enum Singleton() works as a private static method.
enum Singleton{
    SINGLETON;
    Singleton(){}
}
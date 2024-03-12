
public class MyThread implements Runnable{

    @Override
    public void run() {
        
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println("Thread name: " + Thread.currentThread().getName() + ", HashCode: " + lazySingleton.hashCode1());
    }

}
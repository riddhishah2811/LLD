
public class SyThread implements Runnable{

    @Override
    public void run() {
        
        SynchronizedSingleton singleton = SynchronizedSingleton.getInstance();
        System.out.println("Thread name: " + Thread.currentThread().getName() + ", HashCode: " + singleton.hashCode1());
    }

}

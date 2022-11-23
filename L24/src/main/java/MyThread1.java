public class MyThread1 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "started");
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
            System.out.println("Thread interrupted");
        }
        System.out.println(Thread.currentThread().getName() + "finished");
    }
}

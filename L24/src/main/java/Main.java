public class Main {

    public static void main(String[] args) {

//        Thread currentThread = Thread.currentThread();
//        System.out.println(currentThread);
//
//
//        new MyThread("первый поток. ").start();
//        new MyThread("второй поток. ").start();
//        new MyThread("третий поток. ").start();
//        new MyThread("четвертый поток. ").start();
//
//        for (int i = 0; i < 100; i++) {
//            if (i % 10 == 0){
//                System.err.println(i);
//            }
//            System.out.println(i);
//        }


        System.out.println("Main thread started...");
        Thread myThread1 = new Thread(new MyThread1(), "MyThread1");
        myThread1.start();
        System.out.println("Main finished");

    }
}

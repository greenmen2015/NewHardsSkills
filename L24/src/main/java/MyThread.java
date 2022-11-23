public class MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() + " Цикл № " + i);

            try {
                sleep((int)(Math.random() *1000));
            }catch (InterruptedException e) {
                System.out.println();
            }
        }
    }

    public MyThread(String name) {
        super(name);
    }
}

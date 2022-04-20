class MyThread3 implements Runnable {
    String name;
    Thread t;

    MyThread3(String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println("Creadted New Thread " + t);
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Thread: " + t.getName() + " " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(t + " is exiting");
    }
}


public class ThreadNCl {
    public static void main(String[] args) {
        MyThread3 thread1 = new MyThread3("thread 1");
        MyThread3 thread2 = new MyThread3("thread 2");
        MyThread3 thread3 = new MyThread3("thread 3");

        thread1.t.start();
        thread2.t.start();
        thread3.t.start();

 //       thread1.t.start();
       // thread2.t.start();
       // thread3.t.start();
    }
}

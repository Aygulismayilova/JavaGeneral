class MyThread implements Runnable {

    Thread t;

    //Thread(Runnable r, String threadName)
    MyThread() {
        t = new Thread(this, "My cool thread");
        System.out.println("Child thread created" + t);
    }

    @Override
    public void run () {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}

class MyThread2 extends Thread {
MyThread2(){
    super("My cool thread");
    System.out.println("Child thread created "+this);

    
}

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}

public class Threads {
    public static void main(String[] args) {
     /*  MyThread bear = new MyThread();
        bear.t.start();*/
        MyThread2 bear2 = new MyThread2();
        bear2.start();
       /* MyThread2 bear3 = new MyThread2();
        bear3.start();*/
    }
}

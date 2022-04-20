//suspend/resume thread

class CoolThread implements Runnable {
    Thread t;
    boolean suspenThread;

    CoolThread(String name) {
        t = new Thread(this, name);
        System.out.println("New thread has been created" + t);
        suspenThread = false;

    }


    @Override
    public void run() {
        for (int i = 20; i > 0; i--) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
                synchronized (this) {
                    while (suspenThread) {
                        System.out.println("Pausing Thread");
                        wait();
                    }
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }


    }

    synchronized void suspenThread() {
        suspenThread = true;
    }

    synchronized void resumeThread() {
        suspenThread = false;
        notify();
        System.out.println("Resuming Thread");
    }

}


public class SuspendingThreads {
    public static void main(String[] args) {
        CoolThread thread1 = new CoolThread("Thread 1");
        thread1.t.start();
      try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        thread1.suspenThread();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        thread1.resumeThread();
    }
}


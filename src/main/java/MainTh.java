class Q {
    int n;

    boolean wait = false;

//notify lets other wait method to begin and vice versa
    synchronized int get() {
        while (!wait) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Value of n: " + n);
        notify();
        wait = false;
        return n;
    }

    synchronized void put(int n) {
        while (wait) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }

        }
        this.n = n;
        System.out.println("Setting the value of n: "+n);
    notify();
    wait=true;
    }
}

class Producer implements Runnable {
    Q q;
    Thread t;

    Producer(Q q) {
        this.q = q;
        t = new Thread(this, "Producer Thread");

    }


    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Q q;
    Thread t;

    Consumer(Q q) {
        this.q = q;
        t = new Thread(this, "Consumer Thread");


    }


    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }
}


public class MainTh {
    public static void main(String[] args) {
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        p.t.start();
        c.t.start();
    }
}

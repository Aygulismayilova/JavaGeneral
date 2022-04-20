class Bear implements Runnable {
    String name;
    Thread t;

    Bear(String name) {
        this.name = name;
        t = new Thread(this, name);

    }


    @Override
    public void run() {
        System.out.println("Potato");
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Frog");
    }
}


public class MainFTh {
    public static void main(String[] args) {

        Bear thread1 = new Bear("Thread one");
        Bear thread2 = new Bear("Thread two");
        Bear thread3 = new Bear("Thread three");

        thread1.t.start();
        try {
            thread1.t.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        thread2.t.start();
        thread3.t.start();



       /* System.out.println(thread1.t.isAlive());
        System.out.println(thread2.t.isAlive());
*/
    }
}

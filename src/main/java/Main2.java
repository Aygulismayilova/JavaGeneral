class Message {
    //synchronized
    void send(String message) {
        System.out.println("Sending Message: " + message);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Confirm, Message send: " + message + "])");

    }

}

class MessageThreder implements Runnable {
    String message;
    Thread t;
    Message target;

    MessageThreder(Message target, String message) {
        this.message = message;
        this.target = target;
        t = new Thread(this);
    }

    @Override
    public void run() {
        synchronized (target) {
            target.send(message);
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        Message message = new Message();
        MessageThreder message1 = new MessageThreder(message, "Climate change is real.");
        MessageThreder message2 = new MessageThreder(message, "Yes it is");
        message1.t.start();
        message2.t.start();
    }
}

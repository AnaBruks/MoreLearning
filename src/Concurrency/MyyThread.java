package Concurrency;

public class MyyThread implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        Runnable r = new MyyThread(new StringBuilder());
        r.run();
    }
    StringBuilder sb;
    public MyyThread(StringBuilder sb) {
        this.sb = sb;
    }
    @Override
    public void run() {
        synchronized (this) {
            for (int x = 0; x < 10; x++) {
                System.out.println(sb.append("a"));
                try {
                    Thread.sleep(100);
                    Thread.interrupted();
                } catch (InterruptedException ex) {
                    Thread.interrupted();
                }

            }
        }
    }
}




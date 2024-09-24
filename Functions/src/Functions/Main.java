package Functions;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            Thread t2 = new Thread(new PrintTwo(i));
            Thread t3 = new Thread(new PrintThree(i));
            Thread t4 = new Thread(new PrintFour(i));
            Thread t5 = new Thread(new PrintFive(i));
            Thread tn = new Thread(new PrintNumber(i));

            t2.start();
            t3.start();
            t4.start();
            t5.start();
            tn.start();

            try {
                t2.join();
                t3.join();
                t4.join();
                t5.join();
                tn.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
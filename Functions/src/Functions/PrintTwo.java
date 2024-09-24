package Functions;

public class PrintTwo implements Runnable {
    private int num;

    public PrintTwo(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        if (num % 2 == 0) {
            System.out.println(num + " is divisible by 2");
        }
    }
}

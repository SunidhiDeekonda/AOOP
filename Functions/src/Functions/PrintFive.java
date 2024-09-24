package Functions;

class PrintFive implements Runnable {
    private int num;

    public PrintFive(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        if (num % 5 == 0) {
            System.out.println(num + " is divisible by 5");
        }
    }
}
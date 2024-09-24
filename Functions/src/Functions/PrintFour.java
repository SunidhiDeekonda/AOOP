package Functions;

class PrintFour implements Runnable {
    private int num;

    public PrintFour(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        if (num % 4 == 0) {
            System.out.println(num + " is divisible by 4");
        }
    }
}

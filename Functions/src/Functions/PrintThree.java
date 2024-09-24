package Functions;

class PrintThree implements Runnable {
    private int num;

    public PrintThree(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        if (num % 3 == 0) {
            System.out.println(num + " is divisible by 3");
        }
    }
}
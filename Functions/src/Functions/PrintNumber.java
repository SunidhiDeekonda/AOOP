package Functions;

class PrintNumber implements Runnable {
    private int num;

    public PrintNumber(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        if (num % 2 != 0 && num % 3 != 0 && num % 4 != 0 && num % 5 != 0) {
            System.out.println(num);
        }
    }
}

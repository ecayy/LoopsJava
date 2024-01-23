public class loop2 {
    public static void main(String[] args) {

        for (int counter = 1;
             counter <= 5;
             counter++) {
            System.out.println(counter);
        }
        for (double rate = 1; rate <= 5; rate++)    {
            double amount = calculate(10000, rate);
            System.out.println("10000 at " + rate + " % interest = " + amount);
        }

        for (double i = 7.5; i <= 10; i += 0.25) {
            double amount = calculate(100, i);
            if(amount > 8.5) {
                break;
            }
            System.out.println(("$100 at " + i + "% interest = $ " + amount));

        }
    }
    public static double calculate(double amount, double rate) {

        return (amount * (rate / 100));
    }
}

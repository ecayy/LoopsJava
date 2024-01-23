public class mainfor1 {
    public static void main(String[] args) {

        for (int counter = 1;
             counter <= 5;
             counter++) {
            System.out.println(counter);
        }
        for (double rate = 2.0; rate <= 5.0; rate++)    {
            double amount = calculate(10000.0, rate);
            System.out.println("10,000 at " + rate + " % interest = " + amount);
        }
    }
    public static double calculate(double amount, double rate) {

        return (amount * (rate / 100));
    }
}

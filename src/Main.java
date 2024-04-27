public class Main {

    public static void main(String[] args) {

        for (int counter = 1; counter <= 5; counter++) {
            System.out.println ( counter );
        }
        System.out.println ( "\n  Interest rate calculations:" );
        System.out.println ( "-------------------------------" );

        for (double rate = 2.0; rate <= 5.0; rate++) {
            double interestAmount = calculateInterest ( 10000.0, rate );
            System.out.println ( "10,000 at " + rate + "% interest = : $" + interestAmount );
        }


        System.out.println ( "\n  Interest rate calculations $100:" );
        System.out.println ( "-----------------------------------" );

        // the interest rates between 7.5 and 10, but increment by a quarter of a percent each time, meaning 0.25 percent.
        for (double rate = 7.5; rate <= 10; rate += 0.25) {
            double interest = calculateInterest ( 100.0, rate );
            System.out.println ( "Interest at " + rate + "% : $" + interest );
        }
    }

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));
    }
}

package paka;

public class Main {
    public static void main (String[] args) {

        Cashback cashback = new Cashback();

        int actual = cashback.cashBackCalculation(100, true);
        int expected = 100;
        System.out.println("cashBack registered for 1000 purchase sum is expected = " + expected + "actual= " + actual);
    }
}

import jdk.jfr.Registered;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import paka.Cashback;

public class TestParameterizedCashback {
    @ParameterizedTest
    @CsvSource(value = {"1000,true,100","1000,false,50","20000,false,1000"})
    public void shouldCheckALLConditions (int purchaseSum, boolean ifRegistered, int expected) {
        Cashback cashback = new Cashback();
        int actual =cashback.cashBackCalculation(purchaseSum, ifRegistered);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "TestData.csv")
    public void shouldCheckALLConditionsFileSourse (int purchaseSum, boolean ifRegistered, int expected) {
        Cashback cashback = new Cashback();
        int actual =cashback.cashBackCalculation(purchaseSum, ifRegistered);
        Assertions.assertEquals(expected, actual);
    }
}

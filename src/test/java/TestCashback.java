import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import paka.Cashback;

public class TestCashback {

    @Test
    public void shouldCheckSubscribedUnderLimit () {
        Cashback cashback = new Cashback();
        int actual =cashback.cashBackCalculation(1000, true);
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCheckUnsubscribedUnderLimit () {
        Cashback cashback = new Cashback();
        int actual =cashback.cashBackCalculation(1000, false);
        int expected = 50;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckUnsubscribedBoundaryTest () {
        Cashback cashback = new Cashback();
        int actual =cashback.cashBackCalculation(20000, false);
        int expected = 1000;

        Assertions.assertEquals(expected, actual);
    }
    //тесты, подписанные выше лимита, неподписанные выше лимита
    //тесты, подписанные граничные условия - бонус =499, 500, 501
    //тесты, неподписанные граничные условия - бонус = 499, 500, 501
    //итого тестов: 10
}

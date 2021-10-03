package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PaymentCalculatorTest {

    @Test
    void TestcalculateMonthsUntilPaidOff() {
        PaymentCalculator test = new PaymentCalculator();
        test.setBalance(5000.0);
        test.setDailyRate(12.0);
        test.setPayments(100.0);

        Assertions.assertEquals(70.0,test.calculateMonthsUntilPaidOff());
    }
}
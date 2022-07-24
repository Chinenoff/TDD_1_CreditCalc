import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestMonthlyPaymentCalculation {
    @Test
    @DisplayName("Тест Рассчета месячного платежа")
    public void testMonthlyPaymentCalculation() {
        CreditCalculator testCreditCalculator = new CreditCalculator(120000, 12, 12);
        double resultMonthlyPaymentCalculation =
                testCreditCalculator.monthlyPaymentCalculation();
        Assertions.assertEquals(resultMonthlyPaymentCalculation, (double) 11200);
    }
}

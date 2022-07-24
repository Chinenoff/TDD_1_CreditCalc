import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestMonthlyPaymentCalculation {
    @Test
    @DisplayName("Тест Рассчета месячного платежа")
    public void testMonthlyPaymentCalculation() {
        //IncomeTaxType incomeTaxTypeObj = new IncomeTaxType();
        double resultMonthlyPaymentCalculation =
                CreditCalculator.monthlyPaymentCalculation (100000, 12, 20);
        Assertions.assertEquals(resultMonthlyPaymentCalculation, (double) 12000);
    }
}

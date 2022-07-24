import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestCalculationOfOverpayment {

    @Test
    @DisplayName("Тест Рассчета переплаты за весь период")
    public void testTotalAmountCalculation() {
        CreditCalculator testCreditCalculator = new CreditCalculator(120000, 12, 12);
        double resultTotalAmountCalculation =
                testCreditCalculator.calculationOfOverpayment();
        Assertions.assertEquals(resultTotalAmountCalculation, (double) 14400);
    }
}

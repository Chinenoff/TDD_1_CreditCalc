import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestCalculationOfOverpayment {

    @Test
    @DisplayName("Тест Рассчета переплаты за весь период")
    public void testTotalAmountCalculation() {
        double resultTotalAmountCalculation =
                CreditCalculator.calculationOfOverpayment(100000, 12, 20);
        Assertions.assertEquals(resultTotalAmountCalculation, (double) 20000);
    }
}

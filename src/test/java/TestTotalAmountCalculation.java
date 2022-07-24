import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestTotalAmountCalculation {
    @Test
    @DisplayName("Тест Рассчета общей суммы к возврату в банк")
    public void testTotalAmountCalculation() {
        CreditCalculator testCreditCalculator = new CreditCalculator(120000, 12, 12);
        double resultTotalAmountCalculation =
                testCreditCalculator.totalAmountCalculation();
        Assertions.assertEquals(resultTotalAmountCalculation, (double) 134400);
    }
}

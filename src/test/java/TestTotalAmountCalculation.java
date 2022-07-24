import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestTotalAmountCalculation {
    @Test
    @DisplayName("Тест Рассчета общей суммы к возврату в банк")
    public void testTotalAmountCalculation() {
        double resultTotalAmountCalculation =
                CreditCalculator.totalAmountCalculation (100000, 12, 20);
        Assertions.assertEquals(resultTotalAmountCalculation, (double) 120000);
    }
}

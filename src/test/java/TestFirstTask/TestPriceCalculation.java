package TestFirstTask;

import primitive.PriceCalculation;
import org.junit.Test;

public class TestPriceCalculation {

    @Test
    public void testCalculation() {
        PriceCalculation priceCalculation = new PriceCalculation();
        double d = 25.2d;
        int i = 5;
        try {
            double priced = priceCalculation.priceCalculation(d, 2);
            if (priced != (25.2d *2)) {
                throw new RuntimeException("Ожидалось получить:" + (d * i) + "; \n" +
                        "Получили: " + priced);
            }
        } catch (RuntimeException e) {
            e.getStackTrace();
        }

    }
}

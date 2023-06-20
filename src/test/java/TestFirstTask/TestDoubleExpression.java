package TestFirstTask;

import primitive.DoubleExpression;
import org.junit.Test;

public class TestDoubleExpression {

    @Test
    public void testExpression() {
        DoubleExpression doubleExpression = new DoubleExpression();
        double a = 3.3d, b = 4.7d, c = 8.0d;
        boolean expression = doubleExpression.doubleExpression(a,b,c);
        if (!expression) {
            throw new RuntimeException();
        }
    }
}

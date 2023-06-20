package TestFirstTask;

import primitive.DiffAge;
import org.junit.Test;

public class TestDiffAge {

    @Test
    public void testDiff() {
        DiffAge diffAge = new DiffAge();
        int i = 198;
        int b = 112;
        byte diff = diffAge.getAgeDiff(i,b);
        if (diff != (i-b)) {
            throw new RuntimeException("Ожидалось получить: "+ (i-b) + ";\n" +
                    "Получили : "+diff);
        }
    }
}

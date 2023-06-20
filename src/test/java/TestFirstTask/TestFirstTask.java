package TestFirstTask;

import primitive.FirstTask;
import org.junit.Test;

public class TestFirstTask {


    @Test
    public void testFirstTask() {
        FirstTask firstTask = new FirstTask();
        try {
           int i = firstTask.sumInt(54,67);
           if (i != (64+67)) {
                throw new RuntimeException();
            }

        } catch (RuntimeException e) {
            e.getStackTrace();
        }

    }
}

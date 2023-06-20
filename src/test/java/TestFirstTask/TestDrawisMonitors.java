package TestFirstTask;

import primitive.DrawisMonitor;
import org.junit.Test;

public class TestDrawisMonitors {

    @Test
    public void testDrawis() {
        DrawisMonitor drawisMonitor = new DrawisMonitor();
        int mon = 24;
        int programmes = 14;
        int i = drawisMonitor.drawisMonitorsCounter(mon, programmes);
        if (i != (mon/programmes)) {
            throw new RuntimeException("Ожидалось получить: " +(mon/programmes)+";\n"
            + "Получили: " +i);
        }
    }
}

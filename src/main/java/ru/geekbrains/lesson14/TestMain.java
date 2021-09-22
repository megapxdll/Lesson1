package ru.geekbrains.lesson14;

import org.junit.Test;
import org.junit.function.ThrowingRunnable;

import java.lang.management.RuntimeMXBean;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestMain {
    @Test
    public void Task1Test1() {
        MainApp app = new MainApp();
        assertEquals(Arrays.asList(5, 6), app.ArrayFilter(Arrays.asList(1, 2, 3, 4, 5, 6)));
    }

    @Test
    public void Task1Test2() {
        MainApp app = new MainApp();
        assertEquals(Arrays.asList(0, 0), app.ArrayFilter(Arrays.asList(0, 0, 0, 0, 0, 4, 0, 0)));
    }

    @Test
    public void Task1Test3() {
        MainApp app = new MainApp();
        assertThrows(RuntimeException.class, () -> app.ArrayFilter(Arrays.asList(1, 2, 3, 2, 3, 2, 2, 1)));
    }

    @Test
    public void Task1Test4() {
        MainApp app = new MainApp();
        assertEquals(Arrays.asList(-10, -20), app.ArrayFilter(Arrays.asList(2, 222, 45, 51, 23, 4, -10, -20)));
    }
}

package se.reky.hakan;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Scanner;

public class IOHandlerTest {

    private IOHandler createIOHandler(String dataForScanner) {
        Scanner scanner = new Scanner(dataForScanner);
        return new IOHandler(scanner);
    }

    @Test
    public void testHasNextIntWithIntInput() {
        IOHandler ioHandler = createIOHandler("123");
        Assertions.assertTrue(ioHandler.hasNextInt(), "hasNextInt should return true because input is an integer.");
    }

    @Test
    public void testHasNextIntWithNonIntInput() {
        IOHandler ioHandler = createIOHandler("hello");
        Assertions.assertFalse(ioHandler.hasNextInt(), "hasNextInt should return false because input is NOT an integer.");
    }
}

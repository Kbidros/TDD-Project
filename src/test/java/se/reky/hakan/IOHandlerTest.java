package se.reky.hakan;

import java.util.Scanner;

public class IOHandlerTest {

    private IOHandler createIOHandler(String dataForScanner) {
        Scanner scanner = new Scanner(dataForScanner);

        return new IOHandler(scanner);
    }
}

package se.reky.hakan.util;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class ScannerTest {

    @Test
    public void testScannerNextLine() {
        String inputData = "Hej Kristian";

        System.setIn(new ByteArrayInputStream(inputData.getBytes()));

        Scanner scanner = new Scanner(System.in);

        String actualInput = scanner.nextLine();

        Assertions.assertEquals(inputData, actualInput);

    }
}

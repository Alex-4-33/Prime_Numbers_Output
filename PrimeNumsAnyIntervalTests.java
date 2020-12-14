import org.junit.*;

import java.io.*;
import java.util.Scanner;

public class PrimeNumsAnyIntervalTests {

    private int temp() {
        return 0;
    }

    @Test
    public void test1() {
        Assert.assertTrue(true);

    }

    @Test
    public void testPrimes() {
        String expected = "2 3 5 7 \r\n";
        PrintStream stdout = System.out;
        ByteArrayOutputStream result = new ByteArrayOutputStream();

        try {
            System.setOut(new PrintStream(result));
            PrimeNumsAnyInterval.PrimeNumsOutput(1, 10);
            Assert.assertEquals(expected, result.toString());

            //Scanner scanner = new Scanner(System.in);
            //System.out.println(scanner.nextLine());
        } finally {
            System.setOut(stdout);
        }
    }
}

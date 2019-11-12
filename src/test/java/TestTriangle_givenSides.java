import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class TestTriangle_givenSides  {

    TriangleInit triangle = new TriangleInit();
    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();
    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @Before
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }
    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }
    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }
    @Test
    public void testCaseLengthSuccess() throws IOException {
        String menuStr = "1\n+10\t+11\t+12\t";
        provideInput(menuStr);
        TriangleInit.main(new String[]{});
        String expectedOutput= "Pick a method to create a triangle or press 9 to quit\n" +
                "1:by length\n" +
                "2:by point\n" +
                "9:quit\r\n" +
                "Please enter three number as lengths of a triangle.\r\n"+
                "The area of the above is: 51.52\r\n";
       assertEquals(expectedOutput, getOutput());
    }

    @Test
    public void testCaseLengthNegative_Fail() throws IOException {
        String menuStr = "1\n" +"-10\n+11\n+12\n";
        provideInput(menuStr);
        TriangleInit.main(new String[]{});
        String expectedOutput= "Pick a method to create a triangle or press 9 to quit\n" +
                "1:by length\n" +
                "2:by point\n" +
                "9:quit\r\n" +
                "Please enter three number as lengths of a triangle.\r\n"+
                ">>>Not a valid entry for a triangle. Please try again.\r\n";
        assertEquals(expectedOutput, getOutput());
    }

    @Test
    public void testCaseLengthOneTooBig_Fail() throws IOException {
        String menuStr = "1\n" +"10\n+11\n+50\n";
        provideInput(menuStr);
        TriangleInit.main(new String[]{});
        String expectedOutput="Pick a method to create a triangle or press 9 to quit\n" +
                "1:by length\n" +
                "2:by point\n" +
                "9:quit\r\n" +
                "Please enter three number as lengths of a triangle.\r\n"+
                ">>>Not a valid entry for a triangle. Please try again.\r\n";
        assertEquals(expectedOutput, getOutput());
    }
}


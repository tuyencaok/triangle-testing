import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class TestTriangle_givenPoints  {

    TriangleInit triangle = new TriangleInit();

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
    public void testCasePointSuccess() throws IOException {
        String menuStr = "2\n" + "3,4 2,0 -4,4\n";
        provideInput(menuStr);
        TriangleInit.main(new String[]{});
        String expectedOutput= "Pick a method to create a triangle or press 9 to quit\n" +
                "1:by length\n" +
                "2:by point\n" +
                "9:quit\r\n"+
                "Please enter three pair of number to form a triangle.Eg. 3,4 2,0 4,4\r\n"+
                "The area of the above is: 14.00\r" +"\n";
        assertEquals(expectedOutput, getOutput());
    }
    @Test
    public void testCasePointStraightLine_Fail() throws IOException {
        // TriangleInit mainObj = new TriangleInit();
        String menuStr = "2\n" + "0,4 0,5 0,-1\n";
        provideInput(menuStr);
        TriangleInit.main(new String[]{});
        String expectedOutput= "Pick a method to create a triangle or press 9 to quit\n" +
                "1:by length\n" +
                "2:by point\n" +
                "9:quit\r\n"+
                "Please enter three pair of number to form a triangle.Eg. 3,4 2,0 4,4\r\n"+
                ">>>Not a valid entry for a triangle. Please try again.\r" +"\n";
        assertEquals(expectedOutput, getOutput());
    }
}


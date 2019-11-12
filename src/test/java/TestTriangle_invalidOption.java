import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertSame;

public class TestTriangle_invalidOption { /*
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
    public void testCaseExit() throws IOException {
        String menuStr = "5";
        provideInput(menuStr);
        TriangleInit.main(new String[]{});
        String expectedOutput = "Pick a method to create a triangle or press 9 to quit\n" +
                "1:by length\n" +
                "2:by point\n" +
                "9:quit\r\n" +
                "Input invalid\r";
        String actualOutput = getOutput();
        assertSame(expectedOutput, actualOutput);
    } */
}





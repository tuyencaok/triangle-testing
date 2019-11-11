import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTriangle_quit {
    TriangleInit triangle = new TriangleInit();

    protected static class ExitException extends SecurityException
    {
        public final int status;
        public ExitException(int status)
        {
            super("There is no escape!");
            this.status = status;
        }
    }
    public void testExit() throws Exception

    {
        try {
            System.exit(0);
        } catch (ExitException e) {
        assertEquals("Exit status", 0, e.status);

    }


    }
}


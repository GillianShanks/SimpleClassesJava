import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    public Printer printer;

    @Before
    public void before(){
        printer = new Printer();
    }

    @Test
    public void hasNumberOfSheets(){
        assertEquals(10, printer.getSheets());
    }
}

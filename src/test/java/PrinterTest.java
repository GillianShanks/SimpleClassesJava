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

    @Test
    public void printRemovesPaperIfEnoughPaper(){
        printer.print(2, 3);
        assertEquals(4, printer.getSheets());
    }

    @Test
    public void printDoesNotRemoveIfNotEnoughPaper(){
        printer.print(2, 6);
        assertEquals(10, printer.getSheets());
    }

    @Test
    public void hasToner(){
        assertEquals(7, printer.getTonerVolume());
    }
}

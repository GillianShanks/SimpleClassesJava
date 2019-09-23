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
    public void printRemovesPaperIfEnoughPaperAndToner(){
        printer.print(2, 3);
        assertEquals(4, printer.getSheets());
        assertEquals(1, printer.getTonerVolume());
    }

    @Test
    public void printDoesNotRemoveIfNotEnoughPaperOrToner(){
        printer.print(2, 6);
        assertEquals(10, printer.getSheets());
        assertEquals(7, printer.getTonerVolume());
    }

    @Test
    public void hasToner(){
        assertEquals(7, printer.getTonerVolume());
    }

    @Test
    public void printDoesNotRemovePaperIfEnoughPaperButNotEnoughToner(){
        printer.print(4,2);
        assertEquals(10, printer.getSheets());
        assertEquals(7, printer.getTonerVolume());
    }
}

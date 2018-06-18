import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {
    @Test
    public void printerHasSheets() {
        Printer printer = new Printer(110, 0, 0, 100);
        assertEquals(110, printer.getSheets());
    }

    @Test
    public void printerPrintsPagesbyCopies(){
        Printer printer = new Printer (150, 2, 4, 100);
        printer.print();
        assertEquals(142, printer.getSheets());
    }

    @Test
    public void printerHasEnoughPaper(){
        Printer printer = new Printer (9, 10, 20, 100);
        assertEquals(false, printer.enoughPaper());
    }

    @Test
    public void printerDoesntHaveEnoughPaper(){
        Printer printer = new Printer (30, 10, 4, 100);
        printer.print();
        assertEquals(30, printer.getSheets());
}

    @Test
    public void printerRefills(){
        Printer printer = new Printer (100, 10 , 10, 100);
        assertEquals(150, printer.refill());
    }

    @Test
    public void printerTonerSubtracts(){
        Printer printer = new Printer (150, 5,2 , 100);
        printer.print();
        assertEquals(90, printer.getToner());
    }


}

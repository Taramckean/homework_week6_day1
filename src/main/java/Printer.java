public class Printer {
    private int sheets;
    private int pages;
    private int copies;
    private int toner;

    public Printer(int sheets, int pages, int copies, int toner){
    this.sheets = sheets;
    this.pages = pages;
    this.copies = copies;
    this.toner = toner;}

public int getSheets() {
        return sheets;
    }

    public int getToner() {
        return toner;
    }

public void print(){
        if (sheets >= pages * copies){
        sheets -= pages * copies;
        toner -= pages * copies;
    }
    }


public boolean enoughPaper() {
    if (this.sheets >= pages * copies){
        return true;
} return false;
}

public int refill(){
       return sheets = 150;
}






}
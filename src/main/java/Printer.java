public class Printer {

    private int sheets;

    public Printer(){
        this.sheets = 10;
    }

    public int getSheets() {
        return sheets;
    }

    public void setSheets(int sheets) {
        this.sheets = sheets;
    }

    public void print(int numOfPages, int numOfCopies) {
        int pagesToPrint = numOfPages * numOfCopies;

        if (getSheets() > pagesToPrint) {
            this.sheets -= pagesToPrint;
        }

    }
}

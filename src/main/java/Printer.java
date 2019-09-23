public class Printer {

    private int sheets;
    private int tonerVolume;

    public Printer(){
        this.sheets = 10;
        this.tonerVolume = 7;
    }

    public int getSheets() {
        return sheets;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }

    public void print(int numOfPages, int numOfCopies) {
        int pagesToPrint = numOfPages * numOfCopies;

        if (getSheets() > pagesToPrint) {
            if (getTonerVolume() > pagesToPrint) {
                this.sheets -= pagesToPrint;
                this.tonerVolume -= pagesToPrint;
            }
        }

    }
}

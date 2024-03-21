
public class Telephone {

    private int ddi;
    private int ddd;
    private long number;

    
    public void register(int ddi, int ddd, long number) {
        this.ddi = ddi;
        this.ddd = ddd;
        this.number = number;
    }

    public void print() {
        System.out.printf("+%d (%d) %d\n", this.ddi, this.ddd, this.number);
    }
}


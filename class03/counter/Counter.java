
public class Counter {

    private int count;

    public Counter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCounter(int count) {
        this.count = count;
    }

    public void resetCount() {
        count = 0;
    }

    public void incrementCount(int value) {
        count += value;
    }

    public void decrementCount(int value) {
        if (count - value > 0)
            count -= value;
    }

    public void printCount() {
        System.out.println("Counter value = " + count);
    }

}

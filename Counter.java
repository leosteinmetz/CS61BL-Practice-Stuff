public class Counter {
    protected int myCount;
    public Counter() {
        myCount = 0;
    }
    public void increment() {
        myCount ++;
    }
    public void reset() {
        myCount = 0;
    }
    public int value() {
        return myCount;
    }
    public String toString() {
        return "" + value();
    }
}
public class ModNCounter extends Counter {
    private int myN;
    public ModNCounter(int n) {
        myN = n;
    }
    public int value() {
        return myCount % myN;
    }
}
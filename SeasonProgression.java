public class SeasonProgression extends ModNCounter {

    public SeasonProgression() {
        super(4);
    }

    public String toString() {
        int n = value(); //super.value() works too.
        if (n == 0) {
            return "spring";
        } else if (n == 1) {
            return "summer";
        } else if (n == 2) {
            return "autumn";
        } else {
            return "winter";
        }
    }

    /**
     * Optional: You could have also used an array to simplify toString.
     * Uncomment the method below before you run it.
     */
    // public String toString() {
    //     String[] seasons = {"spring", "summer", "autumn", "winter"};
    //     return seasonNames[value()];
    // }
}
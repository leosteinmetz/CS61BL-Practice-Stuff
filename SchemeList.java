public class SchemeList {

    private ConsNode myHead; //pointer to the first node in a nonempty list
    private ConsNode myTail; //pointer to the last node in a nonempty list

    private class ConsNode {
        public Object myCar;
        public ConsNode myCdr;
    }

    public void rotate(int k) {
        if (k > 0) {
            //Find node before the new head.
            ConsNode newTail = myHead;
            for (int k2 = 1; k2 < k; k2 ++) {
                p = p.myCdr;
            }
            ConsNode temp = myHead;
            myHead = p.myCdr;
            myTail.myCdr = temp;
            myTail = p;
            p.myCdr = null;
        }
    }

    //Alternate Recursive Solution. The beauty of recursion. :D
    public void rotate(int k) {
        if (k > 0) {
            myTail.myCdr = myHead;
            myTail = myHead;
            myHead = myHead.myCdr;
            myTail.myCdr = null;
            rotate(k - 1);
        }
    }
}
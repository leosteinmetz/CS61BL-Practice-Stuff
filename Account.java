public class Account {
    private Account myParent;
    private int myBalance;
    public Account(int balance, Account parent) {
        this.myBalance = balance;
        this.myParent = parent;
    }
    public void removePoorParents() {
        if (this.myParent != null) {
            if (this.myParent.myBalance < 1000) {
                this.myParent = this.myParent.myParent;
                if (this.myParent == null) {
                    return;
                }
            }
            this.myParent.removePoorParents();
        }
    }
    public static void main(String[] args) {
        //One Example
        Account a1 = new Account(10, null);
        Account a2 = new Account(10, a1);
        Account a3 = new Account(10, a2);
        a3.removePoorParents();
    }
}
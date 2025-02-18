class VendingMachine {
    private VendingMachineState state;
    private int inventory = 5;
    private int balance = 0;
    private final int itemPrice = 10;

    public VendingMachine() {
        this.state = new IdleState();
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void selectItem() {
        state.selectItem(this);
    }

    public void insertCoin(int amount) {
        state.insertCoin(this, amount);
    }

    public void dispenseItem() {
        state.dispenseItem(this);
    }

    public void setOutOfOrder() {
        state.setOutOfOrder(this);
    }

    public int getBalance() {
        return balance;
    }

    public void addBalance(int amount) {
        this.balance += amount;
    }

    public void setBalance(int amount) {
        this.balance = amount;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void reduceInventory() {
        if (inventory > 0) {
            inventory--;
        } else {
            System.out.println("No items left in inventory. Machine going out of order.");
            setOutOfOrder();
        }
    }
}

class ItemSelectedState implements VendingMachineState {
    public void selectItem(VendingMachine machine) {
        System.out.println("Item already selected. Insert coins.");
    }
    public void insertCoin(VendingMachine machine, int amount) {
        machine.addBalance(amount);
        System.out.println("Coin inserted. Current balance: " + machine.getBalance());
        if (machine.getBalance() >= machine.getItemPrice()) {
            System.out.println("Sufficient balance. Dispensing item...");
            machine.setState(new DispensingState());
            machine.dispenseItem();
        }
    }
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Insufficient balance. Please insert more coins.");
    }
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}
class DispensingState implements VendingMachineState {
    public void selectItem(VendingMachine machine) {
        System.out.println("Dispensing in progress. Please wait.");
    }
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Dispensing in progress. Cannot insert coins now.");
    }
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Dispensing item...");
        machine.reduceInventory();
        machine.setBalance(0);
        System.out.println("Item dispensed. Returning to Idle state.");
        machine.setState(new IdleState());
    }
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}
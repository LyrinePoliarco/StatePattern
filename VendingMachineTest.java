public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        
        machine.selectItem(); // Selecting an item
        machine.insertCoin(5); // Inserting insufficient coin
        machine.insertCoin(10); // Inserting sufficient coin, should dispense
        
        machine.selectItem(); // Selecting another item
        machine.insertCoin(15); // Overpaying, should dispense
        
        machine.setOutOfOrder(); // Setting machine to out of order
        machine.selectItem(); // Trying to select item in out-of-order state
    }
}
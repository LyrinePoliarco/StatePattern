# Problem:
A vending machine needs to manage different states, including "Idle", "ItemSelected", "Dispensing", and "OutOfOrder". Each state has specific rules and restrictions regarding allowed operations, and the vending machine has associated attributes like item inventory and balance.
Requirements:
1.	Idle State:
○	Allow item selection.
○	Disallow dispensing items and inserting coins.

3.	ItemSelected State:
○	Allow inserting coins and dispensing items.
○	Disallow item selection.

5.	Dispensing State:
○	Allow no operations.
○	Automatically transition back to the "Idle" state after dispensing is complete.

7.	OutOfOrder State:
○	Disallow all operations.
Current System: The system currently relies on conditional statements within the VendingMachine class to check the machine state and determine valid actions. This approach becomes cumbersome and error-prone as the number of states and their associated logic grows.

Implement the State Pattern to improve code maintainability and flexibility:
1.	Define VendingMachine States:
○	Create separate classes representing different machine states: IdleState, ItemSelectedState, DispensingState, and OutOfOrderState.
2.	Implement State Interface:
○	Define an interface VendingMachineState with methods for common actions like selectItem, insertCoin, dispenseItem, and setOutOfOrder.
3.	Implement State Behaviors:
○	Each concrete state class implements the VendingMachineState interface, providing specific behavior for its respective state. For example, the IdleState class would allow item selection, while the OutOfOrderState wouldn't allow any operations.
4.	Update VendingMachine Class:
○	Include attributes for item inventory and balance.
○	Remove state-specific logic from the VendingMachine class.
○	Introduce a reference to the current VendingMachineState object.
○	Delegate actions like selectItem, insertCoin, dispenseItem, and setOutOfOrder to the current state object through its corresponding methods.






# UML DIAGRAM
![image](https://github.com/user-attachments/assets/35feafc0-4aca-402a-88d9-3ea464a9c792)


# Source Code
CCS322-18/CSL322-18 > Week 3 - 4 State Pattern > Module State Design Pattern

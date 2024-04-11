A vending machine is an automated machine. The machine provides items, including snacks, chocolates, and beverages to consumers. There are multiple racks inside the vending machine with products on each rack. A user inserts money into the machine, selects the rack number from which they want to buy a product, and presses the button. A vending machine dispenses the product to the users based on the amount of money inserted and the selection of the product.

questions

What function do the vending machines perform? Alternatively, how many different states can the vending machines have?

After inserting money into the machine, what does the system do?

Who presses the vending machine button, and what happens after pressing it?

What does the dispense function do?

If the vending machine is in a dispense state, is it possible to insert money?

If you are in NoMoneyInsertedState and try to select a product without paying money, would you be able to select a product?

Money handling

What should the system do if we pay less money than the product price?

What should the system do if we pay more money than the product price?

Can the credit card be used to input money or can only cash be used?

bottom-up design approach

Design pattern 

Requirement

R1: There are different products placed at different positions in the vending machine.

R2: The vending machine can be in one of these three states:

NoMoneyInsertedState: There is no money inserted into the machine.

MoneyInsertedState: Money is inserted into the machine.

DispenseState: The machine gives out the product.

R3: There can be two actors in the system. One is the user and the other is the admin.

R4: The admin can add a product to the machine or remove a product from the machine.

R5: The system should allow the users to select a product they want to purchase from the machine by specifying the rack number.

R6: The user can insert money into the machine in the form of cash.

R7: The system should be able to calculate the money inserted into the machine.

R8: The system should check whether the user inserted the exact amount required for the specific product into the machine.

R9: If the amount is greater than the product price, the system should change back the user and dispense the product.

R10: If the amount is less than the product price, the system should display an error message and return the money.

Use Case Diagram

System

Our system is a "Vending machine."

Actors

Customer: This actor can view, select and take products, insert money, and take out change from the machine.

Operator: This actor can do everything a "Customer" can do. It can also add or remove products and remove cash from the machine.

System: This actor can search for the selected product and dispatch it after validating money.

Customer

View products: To view all available products in the vending machine

Select products: To select a product to buy from the vending machine

Insert money: To insert money to buy products from the vending machine

Take product: To take out products from the vending machine

Take change: To take out change from the vending machine

Operator

Add product: To add new products inside the vending machine

Remove product: To remove products from the vending machine

Cash remove: To remove collected cash from the vending machine

System

Search product: To search for the selected product in the machine to dispatch it

Validate money: To validate that the money is legal

Dispense product: To dispense selected products so customers can take them

Return change: To return the change to the customer if the inserted amount is less than the purchased product price

Generalization

The customer and operator are two actors who interact with the vending machine. The consumer can only engage with the system to purchase a product. An operator can execute all the duties that a customer can, along with certain administrative responsibilities. Therefore, the “Operator” actor has a generalization relationship with the “Customer” actor.

Include

When a customer selects a product to buy, the system then searches for the product’s location and dispatches it. Therefore, the “Select products” use case has an include relationship with the “Search product” use case.

When a customer selects a product to buy, the system then validates the money that the customer inserted and then dispenses the product. Therefore, the “Validate money” use case has an include relationship with the “Dispense product” use case.

Extend

When a customer selects a product to buy, the system then validates the money that the customer inserted and then returns the change if the amount is greater than the price of the purchased product. Therefore, the “Return change” use case has an extend relationship with the “Validate money” use case.

![alt text](image.png)
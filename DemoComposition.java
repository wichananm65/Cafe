import java.sql.Date;

public class DemoComposition {
    public static void main(String[] args) {
        // Create 5 Drink objects
        Drink[] drinks = new Drink[5];
        drinks[0] = new Drink(1, "Cappuccino", 3.50);
        drinks[1] = new Drink(2, "Latte", 4.00);
        drinks[2] = new Drink(3, "Iced Tea", 2.50);
        drinks[3] = new Drink(4, "Black Coffee", 2.00);
        drinks[4] = new Drink(5, "Mango Smoothie", 5.00);

        // Create an Owner
        Owner owner = new Owner(1, "OwnerName", "ownerPassword");

        // Add drinks to the Owner's menu
        for (Drink drink : drinks) {
            owner.addDrink(drink);
        }

        // Create 5 Customer objects
        Customer[] customers = new Customer[5];
        customers[0] = new Customer(1, "Alice", "password1", "123-456-7890");
        customers[1] = new Customer(2, "Bob", "password2", "234-567-8901");
        customers[2] = new Customer(3, "Charlie", "password3", "345-678-9012");
        customers[3] = new Customer(4, "Diana", "password4", "456-789-0123");
        customers[4] = new Customer(5, "Ethan", "password5", "567-890-1234");

        Payment[] payments = new Payment[5];
        payments[0] = new Payment(1, "BankAccount1", 10.00);
        payments[1] = new Payment(2, "BankAccount2", 15.00);
        payments[2] = new Payment(3, "BankAccount3", 20.00);
        payments[3] = new Payment(4, "BankAccount4", 12.50);
        payments[4] = new Payment(5, "BankAccount5", 30.00);

        Order[] orders = new Order[5];
        for (int i = 0; i < 5; i++) {
            orders[i] = new Order(i + 1, new Date(System.currentTimeMillis()), customers[i].getName(), customers[i].getPhone());
            orders[i].addDrink(drinks[i]);
            orders[i].enterOrder();
            
            customers[i].addReceipt(orders[i].getReceipt());
            
            owner.recordSale(orders[i].getSaleHistory());
            
            System.out.println(customers[i].getName() + " has received the following receipt:\n" + customers[i].getReceipts());
            System.out.println();
        }

        System.out.println("Owner's Total Income: $" + owner.getOwnerIncome());
        System.out.println("Owner's Drinks Menu:\n" + owner.getDrinks());
        System.out.println("Owner's Sale History:\n" + owner.getSaleHistory());
    }
}

import java.util.ArrayList;

public class Owner extends Person {
    private ArrayList<Drink> drinks;
    private ArrayList<SaleHistory> saleHistories;
    private double ownerIncome;

    public Owner(int id, String name, String password) {
        super(id, name, password);
        this.drinks = new ArrayList<>();
        this.saleHistories = new ArrayList<>();
        this.ownerIncome = 0.0;
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    // Method to record a sale
    public void recordSale(SaleHistory saleHistory) {
        saleHistories.add(saleHistory);
        ownerIncome += saleHistory.getTotalPrice();
    }

    public double getOwnerIncome() {
        return ownerIncome;
    }

    public String getDrinks() {
        StringBuilder text = new StringBuilder("Available Drinks:\n");
        for (Drink drink : drinks) {
            text.append(drink.showDrink()).append("\n");
        }
        return text.toString();
    }

    public String getSaleHistory() {
        StringBuilder text = new StringBuilder("Sale History:\n");
        for (SaleHistory saleHistory : saleHistories) {
            text.append(saleHistory.getDetail()).append("\n");
        }
        return text.toString();
    }
}

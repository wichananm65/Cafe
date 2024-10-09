import java.sql.Date;

public class Order {
    private int oId;
    private Date oDate;
    private double totalPrice;
    private Rider rider;
    private String status;
    private Drink[] cartDrinks;
    private String cName;
    private String cPhone;
    private Receipt receipt;
    private SaleHistory saleHistory;
    private Payment payment; // New field for Payment

    public Order(int oId, Date oDate, String cName, String cPhone) {
        this.oId = oId;
        this.oDate = oDate;
        this.cName = cName;
        this.cPhone = cPhone;
        this.status = "Pending";
        this.cartDrinks = new Drink[5];
        this.totalPrice = 0.0;
    }

    public int getOId(){
        return oId;
    }

    public void addDrink(Drink drink) {
        for (int i = 0; i < cartDrinks.length; i++) {
            if (cartDrinks[i] == null) {
                cartDrinks[i] = drink;
                totalPrice += drink.getPrice();
                return;
            }
        }
        System.out.println("No space to add more drinks.");
    }

    public void enterOrder() {
        this.receipt = new Receipt(oId, showOrder());
        this.saleHistory = new SaleHistory(oId, "Sale of Order ID: " + oId, totalPrice);
    }

    public void makePayment(Payment payment) {
        this.payment = payment;
        this.status = "Paid"; // Update order status when payment is made
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public SaleHistory getSaleHistory() {
        return saleHistory;
    }

    public String showOrder() {
        StringBuilder drinkDetails = new StringBuilder();
        for (Drink drink : cartDrinks) {
            if (drink != null) {
                drinkDetails.append(drink.showDrink()).append("\n");
            }
        }

        return "Order ID: " + oId + "\n" +
               "Order Date: " + oDate + "\n" +
               "Customer Name: " + cName + "\n" +
               "Customer Phone: " + cPhone + "\n" +
               "Drinks:\n" + drinkDetails +
               "Total Price: $" + totalPrice + "\n" +
               "Rider: " + (rider != null ? rider.getName() : "None") + "\n" +
               "Status: " + status + "\n";
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}

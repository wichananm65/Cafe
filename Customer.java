public class Customer extends Person {
    private String phone;
    private int points;
    private Receipt[] receipts;
    private int receiptCount;

    public Customer(int id, String name, String password, String phone) {
        super(id, name, password);
        this.phone = phone;
        this.points = 0;
        this.receipts = new Receipt[5];
        this.receiptCount = 0;
    }

    public String getPhone() {
        return phone;
    }

    public int getPoints() {
        return points;
    }

    public void addReceipt(Receipt receipt) {
        if (receiptCount < receipts.length) {
            receipts[receiptCount++] = receipt;
        } else {
            System.out.println("No space to add more receipts.");
        }
    }

    public String getReceipts() {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < receiptCount; i++) {
            text.append(receipts[i].getDetail()).append("\n");
        }
        return text.toString();
    }

    public void pay(Order order, String bankAccount) {
        if (order.getTotalPrice() > 0) {
            Payment payment = new Payment(order.getOId(), bankAccount, order.getTotalPrice());
            order.makePayment(payment);
            System.out.println(getName() + " made a payment of $" + payment.getMoney() + " from account: " + payment.getBankAccount());
        } else {
            System.out.println("Order total is zero or less, cannot make payment.");
        }
    }
}

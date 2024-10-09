public class SaleHistory extends Receipt {
    private double totalPrice;

    public SaleHistory(int id, String detail, double totalPrice) {
        super(id, detail);
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}

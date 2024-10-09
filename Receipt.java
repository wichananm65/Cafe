public class Receipt {
    protected int id;
    protected String detail;

    public Receipt(int id, String detail) {
        this.id = id;
        this.detail = detail;
    }

    public int getId() {
        return id;
    }

    public String getDetail() {
        return detail;
    }
}

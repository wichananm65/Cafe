public class Drink {
    private int dId;
    private String name;
    private double price;
    private String topping;
    private String sweetness;

    public Drink(int dId, String name, double price) {
        this.dId = dId;
        this.name = name;
        this.price = price;
        this.topping = "None";
        this.sweetness = "Regular";
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public void setSweetness(String sweetness) {
        this.sweetness = sweetness;
    }

    public String showDrink() {
        return "Name: " + name + ", Price: $" + price + 
               ", Topping: " + topping + ", Sweetness: " + sweetness;
    }
}

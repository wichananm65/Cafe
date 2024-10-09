public class Rider extends Person {
    private String phone;
    private String vehicle;
    private String vehicleNumber;
    private double income;

    public Rider(int id, String name, String password, String phone, String vehicle, String vehicleNumber) {
        super(id, name, password);
        this.phone = phone;
        this.vehicle = vehicle;
        this.vehicleNumber = vehicleNumber;
        this.income = 0.0;
    }

    public String getPhone() {
        return phone;
    }

    public String getVehicle() {
        return vehicle;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public double getIncome() {
        return income;
    }
}

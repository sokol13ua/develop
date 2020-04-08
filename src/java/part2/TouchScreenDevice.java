package part2;

public class TouchScreenDevice {
// Attributes
    private String model;
    private  String operatingSystem;
    private  int battery;
    private float price;

    public void setModel(String model) {
        this.model = model;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    private String  getModel() {
        return model;
    }
    private String getOperatingSystem() {
        return operatingSystem;
    }

    private int getBattery() {
        return battery;
    }
    private float getPrice() {
        return price;
    }
    //Methods
    public void BetterModelMoreExpensive( String model){
        if (model == "cooler")
            price = price + 200;
    }
    public  void IOSOperatingSystemBatteryHoldsBetter( String operatingSystem){
        if(operatingSystem == "IOS")
            battery = battery+2000;
    }











}

package part2;

public class TouchScreenDevice {
    // Attributes
    private int battery;
    private int bigPriceBetterBattery;
    private int price;
    private String bodyiVew;
    private String manufacturer;
    private String largeReadableScreen;
    private String model;
    private String operatingSystem;
    private boolean betterManufacturerBigPrice;
    private boolean thereAreModelsForTwoSimCards;
    private boolean waterproofModelThePriceIsBigExpensive;

    public void setOperatingSystem(String operatingSystem) {
        this.model = operatingSystem;
    }

    public void setManufacturer(String manufacturer) {
        this.model = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private String getModel() {
        return model;
    }

    private String getOperatingSystem() {
        return operatingSystem;
    }

    private int getBattery() {
        return battery;
    }

    private int getPrice() {
        return price;
    }

    private String getManufacturer() {
        return manufacturer;
    }

    //Methods
    public void BetterModelMorePrice(String model) {
        if (model == "cooler")
            price = price + 200;
    }

    public void iOSOperatingSystemBatteryHoldsBetter(String operatingSystem) {
        if (operatingSystem == "IOS")
            battery = battery + 2000;
    }

    public void morePrestigiousManufacturerMorePrice(String manufacturer) {
        if (manufacturer == "elit")
            price = price * 5;
    }

    public void moreBodyiVewMorePrice(String bodyiVew) {
        if (bodyiVew == "5")
            price = price * 2;
    }

    public void moreBatteryMoreManufacturer(int battery) {
        if (battery == 100000)
            manufacturer = manufacturer = "higher grade";
    }

    private static void chooseBrand(String whichOne) {
        for (String a = whichOne; a == "Apple"; ) {
            System.out.println("LG");
            System.out.println(a);
        }
    }

    public void selectDevice(String device) {
        switch (device) {
            case "Telephone":
                chooseBrand("Acer");
                largeReadableScreen = "Screen diagonal 6";
                bigPriceBetterBattery = bigPriceBetterBattery * 3;
                betterManufacturerBigPrice = true;
                thereAreModelsForTwoSimCards = true;
                waterproofModelThePriceIsBigExpensive = true;
            case "Tablet":
                largeReadableScreen = "Screen diagonal 10";
                bigPriceBetterBattery = bigPriceBetterBattery * 4;
                betterManufacturerBigPrice = true;
                thereAreModelsForTwoSimCards = false;
                waterproofModelThePriceIsBigExpensive = true;
            case "Сlock":
                largeReadableScreen = "Screen diagonal 2";
                bigPriceBetterBattery = bigPriceBetterBattery * 2;
                betterManufacturerBigPrice = true;
                thereAreModelsForTwoSimCards = false;
                waterproofModelThePriceIsBigExpensive = false;
        }
    }

    public static void main(String[] args) {
        TouchScreenDevice telephone = new TouchScreenDevice();
        telephone.setManufacturer("USA");
        telephone.setPrice(10000);
        telephone.chooseBrand("Apple");
        telephone.setOperatingSystem("IOS");
        System.out.println(telephone.getManufacturer() + telephone.getPrice() + telephone.getOperatingSystem());
    }
}




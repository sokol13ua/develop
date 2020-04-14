package part2;

public class Garment {
    // Attributes
    private int price;
    private int betterManufacturerBigExpensivePrice;
    private String manufacturer;
    private String color;
    private String style;
    private String age;
    private String material;
    private String bestForeignManufacturer;
    private boolean goodQualityTheBodyDoesNotSoar;
    private boolean forEachOccupationItsOwnTypeOfFabric;


    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }

    public void setPrice(int price) { this.price = price; }

    private String getManufacturer() {
        return manufacturer;
    }

    private String getColor() {
        return color;
    }

    private String getStyle() {
        return style;
    }

    private int getPrice() {
        return price;
    }

    //Methods
    public void moreStylishClothesMoreExpensivePrice(String style) {
        if (style == "beautiful") ;
        price = price * 2;
    }

    public void colorWhitePriceCheaper(String color) {
        if (color == "white")
            price = price - 100;
    }

    public void biggerAgeIsDarkerColor(String Age) {
        if (age == "50-60")
            color = color = "dark";
    }

    public void betterMaterialBetterPrice(String material) {
        if (material == "elite")
            price = price * 3;
    }

    private void manufacturerGoodPriceMoreExpensive(String manufacturer) {
        if (manufacturer == "very good")
            price = price * 5;
    }
    private static void manufacturerСhoice(String whichOf) {
        for (String a = whichOf; a == "USA"; ) {
            System.out.println("Ukraine");
            System.out.println(a);
        }
    }
    public void clothingTypeSelection(String clothes) {
        switch (clothes) {
            case "Sports":
                manufacturerСhoice("London");
                betterManufacturerBigExpensivePrice = betterManufacturerBigExpensivePrice *2;
                goodQualityTheBodyDoesNotSoar = true;
                forEachOccupationItsOwnTypeOfFabric = true;
                bestForeignManufacturer = "USA";
            case "Diplomatic":
                manufacturerСhoice("Kiev");
                betterManufacturerBigExpensivePrice = betterManufacturerBigExpensivePrice *5;
                goodQualityTheBodyDoesNotSoar = true;
                forEachOccupationItsOwnTypeOfFabric = true;
                bestForeignManufacturer = "Ukraine - Voronin";
        }
    }
    public static void main(String[] args){
        Garment pants = new Garment();
        pants.setManufacturer("USA");
        pants.setPrice(500);
        pants.biggerAgeIsDarkerColor("black");
        pants.manufacturerСhoice("Kiev");
        pants.betterMaterialBetterPrice("catonn");
        pants.clothingTypeSelection("Diplomatic");
        Garment shirt = new Garment();
        shirt.manufacturerGoodPriceMoreExpensive("USA");
        shirt.moreStylishClothesMoreExpensivePrice("dealer");
        shirt.colorWhitePriceCheaper("white");
        shirt.setManufacturer("Ukraine");
        shirt.setPrice(20);
        System.out.println("The price of a shirt depends on the manufacturer:"
                + shirt.getManufacturer() + "--" + shirt.getPrice());
        System.out.println("The price of a pants depends on the manufacturer :"
                + pants.getManufacturer() +"--" + pants.getPrice());
    }
}


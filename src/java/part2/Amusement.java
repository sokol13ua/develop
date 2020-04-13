package part2;

public class Amusement {
    private int price;
    private int age;
    private int placeForGames;
    private int ageForTheGame;
    private int ageForTheFish;
    private int ageForTheSkates;
    private String shoesForTheGame;
    private String place;
    private String inventory;
    private String ridingClothes;
    private String handHeldFishingRod;
    private String clothesForFishingWarm;
    private float complexity;
    private float noisiness;
    private boolean standingGameTrack;
    private boolean rideAloneAndCompany;
    private boolean fishTackle;

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setComplexity(float complexity) {
        this.complexity = complexity;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    private int getPrice() {
        return price;
    }

    private int getAge() {
        return age;
    }

    private String getPlace() {
        return place;
    }

    private float getComplexity() {
        return complexity;
    }

    private String getInventory() {
        return inventory;
    }


    //Methods

    public void complexityDependsOnAge(int age) {
        if (age == 50)
            complexity = complexity + 10;
    }

    public void сhangePriceDependOnPlace(String place) {
        if (place == "beautiful")
            price = price * 2;
    }

    public void moreInventoryMorePrice(String inventory) {
        if (inventory == "a lot of")
            price = price * 3;
    }

    public void lessInventoryLessNoisiness(String inventory) {
        if (inventory == "little inventory")
            noisiness = noisiness - 10;
    }

    public void moreComplexityLessAge(float complexity) {
        if (complexity == 10)
            age = age + 20;
    }
    private static void сhooseAPond(String whichOne) {
        for (String a = whichOne; a == "River"; ) {
            System.out.println("Lake");
            System.out.println(a);
        }
    }
    private static void pickABall(String whichOne) {
        for (String a = whichOne; a == "Easy"; ) {
            System.out.println("Heavy");
            System.out.println(a);
        }
    }

    public void chooseEntertainment(String entertainment) {
        switch (entertainment) {
            case "Bowling":
                pickABall ("Average");
                ageForTheGame = 16;
                shoesForTheGame = "Slippers";
                placeForGames = placeForGames *2;
                standingGameTrack = true;
            case "Skates" :
                ageForTheSkates = 5;
                placeForGames = placeForGames * 3;
                ridingClothes = "Light";
                rideAloneAndCompany = true;
            case "Fishing":
                сhooseAPond ("Sea");
                ageForTheFish = 10;
                handHeldFishingRod = "Spinning";
                clothesForFishingWarm = "Thermal underwear";
                fishTackle = true;

        }
    }
    public static void main(String[] args){
        Amusement bowling = new Amusement();
        bowling.setPrice (10000);
        bowling.setPlace("Stadium");
        bowling.pickABall("Small");
        Amusement fishing = new Amusement();
        fishing.setPrice(5000);
        fishing.setInventory("Spinning");
        fishing.сhooseAPond("Sea");
        System.out.println("Bowling:"+ bowling.getPrice() + bowling.getPlace());
        System.out.println("Fishing:"+ fishing.getPrice() + fishing.getPlace());
    }
}

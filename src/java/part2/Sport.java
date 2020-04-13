package part2;

public class Sport {
    private int price;
    private int racket;
    private int thePriceOfAGameOnTheCourt;
    private int pinPongBall;
    private String view;
    private String inventory;
    private String age;
    private String load;
    private String placeOfEmployment;
    private String place;
    private String sportswear;
    private String ball;
    private boolean needTennisSneakers;
    private boolean tennisTable;



    public void setView(String view) {
        this.view = view;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    private String getView() {
        return view;
    }

    private int getPrice() {
        return price;
    }

    private String getInventory() {
        return inventory;
    }

    private String getAge() {
        return age;
    }

    private String getPlace() {
        return place;
    }

    //Methods
    public void moreInventoryMorePrice(int inventory) {
        if (inventory == 5)
            price = price * 2;
    }

    public void atAGreaterAgeHalfThePrice(String age) {
        if (age == "old")
            price = price / 2;
    }

    public void moreLoadLessAge(String load) {
        if (load == "big")
            age = age = "less";
    }

    public void lessInventoryLessPrice(int inventory) {
        if (inventory == 1)
            price = price / 2;
    }

    public void morePlaceOfEmploymentMorePeapleView(String placeOfEmployment) {
        if (placeOfEmployment == "1000")
            view = view = "100000";
    }

    private static void pickARacket(String whichOne) {
        for (String a = whichOne; a == "Professional"; ) {
            System.out.println("Amateur");
            System.out.println(a);
        }
    }
    private static void pickABall(String whatСolor) {
        for (String a = whatСolor; a == "Yellow"; ) {
            System.out.println("White");
            System.out.println(a);
        }
    }

    public void chooseTheTypeOfTennis(String tennis) {
        switch (tennis) {
            case "Desktop":
                pickABall("Red");
                needTennisSneakers = true;
                racket = racket - 25;
                pinPongBall = 5;
                tennisTable =true;
            case "Large":
                pickARacket("Heavy");
                needTennisSneakers = true;
                sportswear = "Summer and winter";
                racket = racket + 50;
                ball = "For asphalt and soil";
                thePriceOfAGameOnTheCourt = thePriceOfAGameOnTheCourt *2;
        }
    }
    public static void main(String[] args){
            Sport bigTennis = new Sport();
            bigTennis.setInventory("Racket");
            bigTennis.setView("Court");
            bigTennis.pickARacket("Professional");

            Sport volleyball = new Sport();
            volleyball.setPrice(1000);
            volleyball.setAge("10");

            Sport football = new Sport();
            football.setPlace("Field");
            football.setInventory("Ball");

            System.out.println("Price and Age :" + " " + volleyball.getPrice() + "--" + volleyball.getAge());
            System.out.println("Place and Inventory:" + football.getPlace() + "--" + football.getInventory());
            System.out.println("Inventory and View for tennis :"
                    + bigTennis.getInventory() + "--" + bigTennis.getView());
        }
    }


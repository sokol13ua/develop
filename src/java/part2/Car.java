package part2;


public class Car {

    private int brake;
    private int price;
    private float high;
    private float pedalAngel;
    private float increaseInFuelPressure;
    private float fuelSupply;
    private float torsionalVibrations;
    private float engineSpeedDrops;
    private float mixtureFlowIncreases;
    private float theCarAccelerates;
    private float carRidesBack;
    private float theAngleOfTheLeverChanges;
    private boolean isOpenFuelInjectorFlap;
    private boolean theCarStartsToDriveFaster;
    private boolean engineSpeedIsFalling;
    private boolean taillightsOfAStopSignalLightUp;
    private boolean disconnectingTheBoxFromTheFlywheel;
    private boolean fuelInjectorFlapOpens;
    private boolean backstageTakesLevelMarkD;
    private boolean theCarIsRemovedFromTheHandBrake;
    private boolean backstageTakesLevelMarkP;
    private boolean theCarStopped;
    private boolean backstageTakesLevelMarkR;
    private boolean reversingLightsComeOn;
    private boolean parkingSensorsActivated;
    private boolean wipersStartedToWork;
    private boolean theWiperMotorIsWorking;
    private boolean theIndicatorStartsToBlink;
    private boolean headlightsTurnOn;
    private boolean rearDimensionsLightUp;
    private String fuelConsumptionIncreases;
    private String backstageChangesPosition;
    private String theCarStartsMovingForward;
    private String parkingBrakeApplied;
    private String parkingBrake;
    private String color;
    private String capacity;
    private String highlyTechnological;
    private String manufacturer;
    private String desiredSpeedIsSelected;
    private String theLampOnTheTidyFlashes;
    private String theLampOnTheTidyLightsUp;

    public void setPrice(int price) {
        this.price = price;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    private int getPrice() {
        return price;
    }

    private String getManufacturer() {
        return manufacturer;
    }


    private void makeBeep(int howManyTimes) {
        for (int i = howManyTimes; i == 1; ) {
            System.out.println("Beep!");
            System.out.println(i);
        }
    }

    private static void turnOnTheLight(String whichOne) {
        for (String a = whichOne; a == "near"; ) {
            System.out.println("Shine");
            System.out.println(a);
        }
    }

    public void pressPedal(String pedal) {
        switch (pedal) {
            case "Brake":
                pedalAngel = pedalAngel - 45;
                isOpenFuelInjectorFlap = true;
                increaseInFuelPressure = increaseInFuelPressure + 5;
                theCarStartsToDriveFaster = true;
                engineSpeedIsFalling = true;
                taillightsOfAStopSignalLightUp = true;
                break;
            case "Clutch":
                pedalAngel = pedalAngel - 25;
                torsionalVibrations = torsionalVibrations / 2;
                disconnectingTheBoxFromTheFlywheel = true;
                engineSpeedDrops = engineSpeedDrops - 30;
            case "Gas":
                fuelInjectorFlapOpens = true;
                pedalAngel = pedalAngel - 40;
                mixtureFlowIncreases = mixtureFlowIncreases + 40;
                theCarAccelerates = theCarAccelerates + 5;
                fuelConsumptionIncreases = "increases by 30%";
                break;
        }
    }

    public void shiftGear(String gear) {
        switch (gear) {
            case "Drive":
                backstageChangesPosition = "The lever has moved forward";
                backstageTakesLevelMarkD = true;
                theCarIsRemovedFromTheHandBrake = true;
                fuelSupply = fuelSupply + 30;
                theCarStartsMovingForward = "The car adds +5 km/h";
            case "Park":
                backstageTakesLevelMarkP = true;
                parkingBrakeApplied = "The car was on the parking brake";
                taillightsOfAStopSignalLightUp = true;
                theCarStopped = true;
            case "Revers":
                makeBeep(10);
                backstageTakesLevelMarkR = true;
                reversingLightsComeOn = true;
                parkingBrake = "Disconnected";
                parkingSensorsActivated = true;
                carRidesBack = carRidesBack + 5;

        }
    }
    public void turnOnTheLever(String lever) {
        switch (lever) {
            case "Wipers":
                theAngleOfTheLeverChanges = theAngleOfTheLeverChanges + 5;
                desiredSpeedIsSelected = "First speed";
                wipersStartedToWork = true;
                theWiperMotorIsWorking = true;
            case "Turn signals":
                theAngleOfTheLeverChanges = theAngleOfTheLeverChanges + 3;
                theIndicatorStartsToBlink = true;
                theLampOnTheTidyFlashes = "Flashing, depending on rotation";
            case "Shine":
                turnOnTheLight("further");
                theAngleOfTheLeverChanges = theAngleOfTheLeverChanges + 17;
                theLampOnTheTidyLightsUp = "Lights up, depending on the selected light";
                headlightsTurnOn = true;
                rearDimensionsLightUp = true;
        }
    }
    public static void main(String[]   arg){
    Car mercedes = new Car();
    mercedes.setPrice(100000);
    mercedes.setManufacturer("Germany");
    mercedes.turnOnTheLight("Shine");
    mercedes.makeBeep(1);
    System.out.println("Mercedes car. Price and diligent manufacturer:"+ mercedes.getPrice() +
            "-" + mercedes.getManufacturer() );
 }
}


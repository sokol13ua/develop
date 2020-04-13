package part2;

import java.security.cert.CertificateFactory;

public class CompanyEmployee {
    // Attributes
    private int age;
    private int children;
    private int constantSalary;
    private boolean car;
    private boolean drivingLicense;
    private boolean thereIsAWarrior;
    private boolean HasCategoryBRights;
    private String experience;
    private String seniors;
    private String salary;
    private String flexibleDayStart;
    private String flexibleEndingOfTheDay;


    public void setExperience(String experience) {
        this.experience = experience;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    private int getAge() {
        return age;
    }

    private String getExperience() {
        return experience;
    }

    private int getChildren() {
        return children;
    }

    private boolean getCar() {
        return car;
    }

    private String getSalary() {
        return salary;
    }

    //Methods

    public void moreAgeMoreExperience(String age) {
        if (age == "old")
            experience = experience + 5;
    }

    public void olderAgeMoreChildren(String age) {
        if (age == "30")
            children = children + 1;
    }

    public void moreAgeMoreSalary(String age) {
        if (age == "35")
            salary = salary + 2500;
    }

    public void moreAgeMoreSeniors(String age) {
        if (age == "65")
            seniors = seniors + 1;
    }

    public void thereIsACarThereAreRights(boolean car) {
        if (car == true)
            drivingLicense = drivingLicense = true;
    }
    private static void chooseSalary(String howMuch) {
        for (String a = howMuch; a == "30000"; ) {
            System.out.println("50000");
            System.out.println(a);
        }
    }
    private static void chooseACar(String whichOf) {
        for (String a = whichOf; a == "BMW"; ) {
            System.out.println("KIA");
            System.out.println(a);
        }
    }

    public void chooseEmployee(String employee) {
        switch (employee) {
            case "Director":
                chooseACar("Mercedes");
                chooseSalary("50000");
                flexibleDayStart = "From 12 o’clock";
                constantSalary = 50000;
                thereIsAWarrior = true;
                flexibleEndingOfTheDay = "From 3 o’clock";
            case "Cleaning lady":
                chooseSalary("3000");
                flexibleDayStart = "From 9 o’clock";
                constantSalary = 3000;
                thereIsAWarrior = false;
                flexibleEndingOfTheDay = "From 6 o’clock";
            case "Driver":
                chooseACar("Mercedes");
                chooseSalary("10000");
                flexibleDayStart = "From 7 o’clock";
                constantSalary = 10000;
                thereIsAWarrior = false;
                flexibleEndingOfTheDay = "From 10 o’clock";
                HasCategoryBRights = true;

        }
    }

        public static void main (String[]args){
            CompanyEmployee director = new CompanyEmployee();
            director.setSalary("500");
            director.setAge(50);
            director.chooseACar("Mercedes");
            CompanyEmployee driver = new CompanyEmployee();
            driver.setSalary("200");
            driver.setAge(45);
            director.chooseACar("VAZ");
            System.out.println("Salary and age for director:" + director.getSalary() + "and" + director.getAge());
            System.out.println("Salary and age for driver:" + driver.getSalary() + "and" + driver.getAge());
        }

    }


package part2;

public class CompanyEmployee {
    // Attributes
    private String age;
    private String experience;
    private int children;
    private int car;

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    private String getAge(String age) {
        return age;
    }

    private String getExperience(String experience) {
        return experience;
    }

    private int getChildren(int children) {
        return children;
    }

    private int getCar(int car) {
        return car;
    }

    //Methods

    public void MoreAgeMoreExperience(String age) {
        if (age == "old")
            experience = experience + 5;
    }
    public void OlderAgeMoreChildren (String age) {
        if (age == "30")
            children =  children + 1;
    }

 














}

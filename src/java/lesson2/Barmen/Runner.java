package lesson2.Barmen;

public class Runner {
    public static void main(String[] args) {
        Education business = new Education();
        business.setName("Анна");
        business.setUniversity("Киевский Институт Бизнеса");
        System.out.println(business.getName() + " закончила " + business.getUniversity());
        PlaceOfWork restaurant = new PlaceOfWork();
        restaurant.setJob("МАМА МАНАНА");
        restaurant.setName("Девушка");
        System.out.println(restaurant.getName() + " на данный момент работает в ресторане " + restaurant.getJob());
    }
}

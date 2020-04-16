package lesson2.House;

public class Theater {

    public void theaterName() {
        System.out.println("Оперный театр");
    }

    public class wardrobe {
        public void squareWardrobe() {
            System.out.println("Гардеробная 20 метров квадратных");
        }
    }
    public class hall {
        public void colorHall() {
            System.out.println("Холл выполнен в светлых тонах");
        }
    }
    public class cafe {
        public void capacityCafe() {
            System.out.println("Кафе имеет 30 мест для посадки");
        }
    }
    public class orchestraPit {
        public void squareOrchestraPit() {
            System.out.println("Оркестровая яма имеет 50 посадочных мест ");
        }
    }
    public class scene {
        public void technologicalScene() {
            System.out.println("Сцена выполнена по последним технологиям ");
        }
    }
    public class place{
        public void placeHous(){
            System.out.println("Театр находится на центральной площади города ");
        }
    }
    public static void main(String[] args) {

        Theater theatre = new Theater();
        Theater.place place = theatre.new place();
        Theater.wardrobe building = theatre.new wardrobe();
        Theater.hall hall = theatre.new hall();
        Theater.cafe cafe = theatre.new cafe();
        Theater.orchestraPit pit = theatre.new orchestraPit();
        Theater.scene scene = theatre.new scene();

        theatre.theaterName();
        place.placeHous();
        building.squareWardrobe();
        hall.colorHall();
        cafe.capacityCafe();
        pit.squareOrchestraPit();
        scene.technologicalScene();
    }
}





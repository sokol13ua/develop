package lesson2.part2;

public class Runner {
    public static void main(String[] args) {
        PlaceOfWork baraban = new PlaceOfWork();
        baraban.setName("Борис");
        baraban.setPosition("Музыкантом");
        Education oxford = new Education();
        oxford.setUniversity("Поплавского");
        System.out.println(baraban.getName() + " работает: " + baraban.getPosition() );
        System.out.println( "Закончил университет: " + oxford.getUniversity());
        MusicalInstrument musicTool = new MusicalInstrument();
        musicTool.setTool("гитаре");
        musicTool.setName("Парень");
        System.out.println(musicTool.getName() + " играет на " + musicTool.getTool());
    }
}


package lesson2.part2;


 public class Education extends Man {
    private String university;
    private PlaceOfWork place;
    private MusicalInstrument instrument;


     public PlaceOfWork getPlace(){ return place;}
     public String getUniversity(){return university;}
     public void setUniversity(String university) { this.university = university; }
     public MusicalInstrument getInstrument(){return instrument;}
}


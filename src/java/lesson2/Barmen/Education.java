package lesson2.Barmen;

import lesson2.part2.PlaceOfWork;

public class Education extends Man {
    private String university;
    private PlaceOfWork place;
    private BarmenTechnique level;

    public String getUniversity(){return university;}
    public void setUniversity(String university) { this.university = university; }
    public PlaceOfWork getPlace(){ return place;}
    public BarmenTechnique getLevel(){return level;}


}

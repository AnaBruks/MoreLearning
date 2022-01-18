package Coll;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private String[] members;
    private int year;

    public String getName() {
        return name;
    }
    public String[] getMembers() {
        return members;
    }
    public void setMembers(String[] members) {
        this.members = members;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public MusicBand(String name, int year, String ...members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }
    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String toString (){
        return this.getName() + " " + this.getYear();
    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand>newBandsList = new ArrayList<>();
        for (MusicBand band : bands){
            if(band.getYear()>3000)
                newBandsList.add(band);
        }
        return newBandsList;
    }
    public static MusicBand transferMembers(MusicBand band1, MusicBand band2) { //все участники групп A переходят в групп B
        band2.setMembers(band1.getMembers());
        return band2;
    }
//        for (String member : band1.getMembers()){     - if members are List
//            band2.getMembers().add(member);
//            band1.remove(member);
//        }

    public static void printMembers (MusicBand band){
        for (String m : band.getMembers()){
            System.out.println(m);
        }
    }
}

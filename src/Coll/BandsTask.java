package Coll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static Coll.MusicBand.*;

public class BandsTask {
    public static void main(String[] args) {
        List<MusicBand> bandsList = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            int y = 1900 + (int) (Math.random() * 120);
            bandsList.add (new MusicBand("Band", y));
        }
        Collections.shuffle(bandsList);
        MusicBand bandd = new MusicBand("gavno", 1888, "gitarist","bassist", "dolboeb");
        MusicBand bandd2 = new MusicBand("Boys", 2001, "gitarBoy","bassBoy", "dolboeBoy");
        bandsList.add(bandd);
        bandsList.add(bandd2);
        System.out.println(bandsList.toString());
        System.out.println(groupsAfter2000(bandsList));

        transferMembers(bandd2, bandd);
        printMembers(bandd);
        printMembers(bandd2);
    }

}

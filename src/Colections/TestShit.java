package Colections;

import java.util.TreeSet;

public class TestShit {
    public static void main(String[] args) {
        TreeSet<Personn> people = new TreeSet<>();
        people.add(new Personn("p1"));
        people.add(new Personn("p2"));
        for(Personn  p : people){
            System.out.println(p.getName());
        }
    }
}

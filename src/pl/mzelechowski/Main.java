package pl.mzelechowski;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Liquid> list = Arrays.asList(new Water(), new Juice(), new Acid());
        Random generator = new Random();
        Liquid l = list.get(generator.nextInt(list.size()));
        System.out.println(l.getClass().getSimpleName() + ". " + l.color() + " " + l.smell() + " " + l.taste());
    }
}
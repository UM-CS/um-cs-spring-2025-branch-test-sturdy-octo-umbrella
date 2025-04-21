import java.util.ArrayList;
import java.util.Random;

import places.SpaceStation;

public class Galaxy {

    static ArrayList<SpaceStation> network = new ArrayList<>();

    static String[] s = { "Apple", "orange", "banana", "Mango" }; // Added "banana" and "Mango" to String s
    static Integer[] i = { 1, 2, 5, 8 };

    public static <T> T pickRandom(T[] array) {
        Random random = new Random();
        return array[random.nextInt(array.length)];
    }

    public static void main(String[] args) {
        System.out.println(pickRandom(s));
        System.out.println(pickRandom(i));
        network.add(new SpaceStation("Deep Space IV", 20));
        network.get(0).getResidents();
    }

}

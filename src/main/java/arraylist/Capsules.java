package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    List<String> capsules = new ArrayList<>();

    void addLast(String color) {
        capsules.add(capsules.size(), color);
    }

    void addFirst(String color) {
        capsules.add(0, color);
    }

    void removeFirst() {
        capsules.remove(0);
    }

    void removeLast() {
        capsules.remove(capsules.size()-1);
    }

    List<String> getColors() {
        return capsules;
    }

    public static void main(String[] args) {
        Capsules capsules = new Capsules();
        capsules.addFirst("piros");
        System.out.println(capsules.getColors());
        capsules.addFirst("kék");
        System.out.println(capsules.getColors());
        capsules.addLast("zöld");
        System.out.println(capsules.getColors());
        capsules.addFirst("lila");
        System.out.println(capsules.getColors());
        capsules.addLast("sárga");
        System.out.println(capsules.getColors());
        capsules.removeFirst();
        System.out.println(capsules.getColors());
        capsules.removeLast();
        System.out.println(capsules.getColors());
    }
}

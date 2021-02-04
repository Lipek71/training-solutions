package _teszt;

import java.util.*;

public class Teszt {
    Map<String, String> map = new HashMap<>();
    Collection<String> collection;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teszt)) return false;
        Teszt teszt = (Teszt) o;
        return Objects.equals(map, teszt.map) && Objects.equals(collection, teszt.collection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map, collection);
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(Integer.valueOf(5));
        Object object = list;
        System.out.println(object instanceof String);
        System.out.println(object instanceof List);

        System.out.println((String) list.get(0).toString());
        String str = null;
        //str.equals("Text");
        System.out.println("Text".equals(str));

        /*List<Integer> listInteger = Arrays.asList(1,2,3,4,5,6,7,8);
        for (int i: listInteger){
            if (i % 2 == 0) {
                listInteger.remove(Integer.valueOf(i));
            }
        }*/ // UnsupportedOperationException

        /*List<Integer> listInteger = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        for (int i: listInteger){
            if (i % 2 == 0) {
                listInteger.remove(Integer.valueOf(i));
            }
        }*/  //ConcurrentModificationException

        List<Integer> listInteger = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        Iterator<Integer> i = listInteger.iterator();
        while (i.hasNext()) {
            int j = i.next();
            if (j % 2 == 0){
                i.remove();
            }
            System.out.println(j);
    }
        System.out.println(listInteger.toString());
}

}
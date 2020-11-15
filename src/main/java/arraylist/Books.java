package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<String> books = new ArrayList<>();

    void add(String title){
        books.add(books.size(), title);
    }

    List<String> findAllByPrefix(String prefix){
        List<String> equalWithPrefix = new ArrayList<>();
        int lenght = prefix.length();
        for(String item: books){
            if(item.substring(0,lenght).equals(prefix)){
                equalWithPrefix.add(equalWithPrefix.size(),item);
            }
        }
        return equalWithPrefix;
    }

    List<String> getTitles(){
        return books;
    }

    public static void main(String[] args) {
        Books books = new Books();
        books.add("A három testőr");
        books.add("A csúcs mindig fölöttünk van");
        books.add("A három testőr Afrikában");
        books.add("A három kismalac");
        books.add("A csúcsvezetők kompetenciáie");
        books.add("Az elveszett cirkáló");

        System.out.println(books.getTitles());
        System.out.println();
        System.out.println(books.findAllByPrefix("A három"));
        System.out.println();
        System.out.println(books.findAllByPrefix("A csúcs"));

    }
}

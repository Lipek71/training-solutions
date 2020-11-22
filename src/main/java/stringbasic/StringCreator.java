package stringbasic;

public class StringCreator {
    public String createStringForHeap(){
        return new String("teszt");
    }

    public String createStringForPool(){
        return "teszt";
    }

}

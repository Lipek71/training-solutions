package array;

public class ArrayHandler {

    boolean contains(int[] source, int itemToFind){
        for(int item: source){
            if(item == itemToFind){
                return true;
            }
        }
        return false;
    }

    int find(int[] source, int itemToFind){
        for(int item: source){
            if(item == itemToFind){
                return item;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler();
        int[] source = {1,2,3,4,5};

        System.out.println(arrayHandler.contains(source,3));
        System.out.println(arrayHandler.contains(source,6));

        System.out.println(arrayHandler.find(source, 3));
        System.out.println(arrayHandler.find(source, 6));
    }
}

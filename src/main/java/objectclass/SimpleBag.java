package objectclass;

import java.util.ArrayList;
import java.util.List;

public class SimpleBag {
    private List<Object> items = new ArrayList<>();
    private int cursor = -1;

    public SimpleBag() {
        beforeFirst();
    }

    public void putItem(Object item) {
        this.items.add(item);
    }

    public boolean isEmpty() {
        return this.items.size() == 0;
    }

    public int size() {
        return this.items.size();
    }

    public void beforeFirst() {
        this.cursor = -1;
    }

    public boolean hasNext() {
        return cursor < items.size() -1 ? true : false;
    }

    public Object next() {
        if (cursor < items.size()) {
            return items.get(++cursor);
        } else {
            return items.get(cursor);
        }
    }

    public boolean contains(Object item) {
        return items.toString().contains(item.toString());
    }

    public int getCursor() {
        return this.cursor;
    }
}

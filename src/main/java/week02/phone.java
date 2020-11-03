package week02;

public class phone {
    private String type;
    private int mem;

    public phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }

    public phone() {

    }

    public String getType() {
        return type;
    }

    public int getMem() {
        return mem;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public static void main(String[] args) {
        phone phone1 = new phone("Laci", 64);
        phone phone2 = new phone("Lacika", 64);
    }
}

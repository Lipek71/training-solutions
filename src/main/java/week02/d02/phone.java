package week02.d02;

import java.util.Scanner;

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
        phone phone1 = new phone("Nokia", 64);
        phone phone2 = new phone("Apple", 64);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérem az első adatokat: ");
        phone1.type = scanner.nextLine();
        phone1.mem = scanner.nextInt();

        System.out.println("Kérem az második adatokat: ");
        phone2.type = scanner.nextLine();
        phone2.mem = scanner.nextInt();

        System.out.println("Egyes" + phone1.type + ", " + phone1.mem);
        System.out.println("Kettes" + phone2.type + ", " + phone2.mem);

    }
}

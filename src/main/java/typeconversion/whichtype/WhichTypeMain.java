package typeconversion.whichtype;

public class WhichTypeMain {
    public static void main(String[] args) {
        WhichType whichType = new WhichType();
        System.out.println(whichType.whichType("23").toString());
        System.out.println(whichType.whichType("260").toString());
        System.out.println(whichType.whichType("40000").toString());
        System.out.println(whichType.whichType("4000000000").toString());
    }
}

package formatlocaleprintf;

public class PrintFormat {
    public String checkException(String formatString, Integer i, Integer j) {
        return "";
    }

    public String printFormattedText(Double number) {
        return String.format("Total is: %,.2f Ft", number).replace("\u00a0", " ");
    }

    public String printFormattedText(int count, String fruit) {
        return String.format("We counted %d %s in the basket", count, fruit);
    }

    public String printFormattedText(int number) {
        return String.format("Right edge of numbers set at 4 spaces from text:%4d", number);
    }

    public String printFormattedText(Integer i, Integer j, Integer k) {
        return String.format("Multiple objects containing text:%d\t%d\t%d", i, j, k);
    }

    public String formatMessageWithIntegerParameters(String str, Integer i, Integer j) {
        String strOut;
        try {
            strOut = String.format(str, i, j);
        } catch (Exception e) {
            throw new IllegalArgumentException("Less objects then expected in format String!");
        }
        return strOut;
    }
}

package interfacedefaultmethods.print;

public class ColoredPage {
    private String pageContent;
    private String pageColor;

    public ColoredPage(String pageContent, String pageColor) {
        this.pageContent = pageContent;
        this.pageColor = pageColor;
    }

    public String getPageContent() {
        return pageContent;
    }

    public String getPageColor() {
        return pageColor;
    }
}

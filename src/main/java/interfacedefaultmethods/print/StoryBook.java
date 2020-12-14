package interfacedefaultmethods.print;

import java.util.ArrayList;
import java.util.List;

public class StoryBook implements Printable{
    private List<ColoredPage> coloredPages = new ArrayList<>();

    public void addPage(String pageContent, String pageColor){
        coloredPages.add(new ColoredPage(pageContent,pageColor));
    }

    @Override
    public int getLength() {
        return coloredPages.size();
    }

    @Override
    public String getPage(int pageNumber) {
        return coloredPages.get(pageNumber).getPageContent();
    }

    @Override
    public String getColor(int pageNumber) {
        return coloredPages.get(pageNumber).getPageColor();
    }
}

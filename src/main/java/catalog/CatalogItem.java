package catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogItem {
    private List<Feature> features = new ArrayList<>();
    private final int price;
    private final String registrationNumber;

    public CatalogItem(String registrationNumber, int price, Feature... feature) {
        this.registrationNumber = registrationNumber;
        this.price = price;
        for (Feature featureItem : feature) {
            this.features.add(featureItem);
        }
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int fullLengthAtOneItem() {
        int lengthNumber = 0;
        for (Feature feature : features) {
            if (feature.getClass().equals(AudioFeatures.class)) {
                lengthNumber += ((AudioFeatures) feature).getLength();
            }
        }
        return lengthNumber;
    }

    public List<String> getContributors() {
        List<String> contributors = new ArrayList<>();
        for (int i = 0; i < getFeatures().size(); i++) {
            for (int j = 0; j < getFeatures().get(i).getContributors().size(); j++) {
                contributors.add(getFeatures().get(i).getContributors().get(j));
            }
        }
        return contributors;
    }

    public List<String> getTitles() {
        List<String> titles = new ArrayList<>();
        for (int i = 0; i < getFeatures().size(); i++) {
            titles.add(getFeatures().get(i).getTitle());
        }
        return titles;
    }

    public boolean hasAudioFeature() {
        for (Feature feature : features) {
            if (feature.getClass().equals(AudioFeatures.class)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasPrintedFeature() {
        for (Feature feature : features) {
            if (feature.getClass().equals(PrintedFeatures.class)) {
                return true;
            }
        }
        return false;
    }

    public int numberOfPagesAtOneItem() {
        int pageNumber = 0;
        for (Feature feature : features) {
            if (feature.getClass().equals(PrintedFeatures.class)) {
                pageNumber += ((PrintedFeatures) feature).getNumberOfPages();
            }
        }
        return pageNumber;
    }

}

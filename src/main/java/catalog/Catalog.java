package catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static catalog.SearchCriteria.createByBoth;

public class Catalog {
    List<CatalogItem> catalogItems = new ArrayList<>();

    public void addItem(CatalogItem catalogItem) {
        catalogItems.add(catalogItem);
    }

    public double averagePageNumberOver(int overNumber) {
        int averageCount = 0;
        int averageSum = 0;
        if (overNumber < 1) {
            throw new IllegalArgumentException("Page number must be positive");
        }
        for (int i = 0; i < catalogItems.size(); i++) {
            for (int j = 0; j < catalogItems.get(i).getFeatures().size(); j++) {
                if (catalogItems.get(i).getFeatures().get(j).getClass().equals(PrintedFeatures.class) &&
                        ((PrintedFeatures) catalogItems.get(i).getFeatures().get(j)).getNumberOfPages() > overNumber) {
                    averageCount++;
                    averageSum += ((PrintedFeatures) catalogItems.get(i).getFeatures().get(j)).getNumberOfPages();
                }
            }
        }
        if (averageCount < 1) {
            throw new IllegalArgumentException("No page");
        } else {
            return (double) averageSum / averageCount;
        }
    }

    public void deleteItemByRegistrationNumber(String registrationNumber) {
        for (int i = 0; i < catalogItems.size(); i++) {
            if (catalogItems.get(i).getRegistrationNumber().equals(registrationNumber)) {
                catalogItems.remove(i);
            }
        }
    }

    public List<CatalogItem> findByCriteria(SearchCriteria searchCriteria) {
        List<CatalogItem> findItems = new ArrayList<>();

        if (searchCriteria.getContributor() == null) {
            for (CatalogItem catalogItem : this.catalogItems) {
                for (int i = 0; i < catalogItem.getFeatures().size(); i++) {
                    if (catalogItem.getFeatures().get(i).getTitle().equals(searchCriteria.getTitle())) {
                        findItems.add(catalogItem);
                    }
                }
            }
        }

        if (searchCriteria.getTitle() == null) {
            for (CatalogItem catalogItem : this.catalogItems) {
                for (int i = 0; i < catalogItem.getFeatures().size(); i++) {
                    if (catalogItem.getFeatures().get(i).getContributors().contains(searchCriteria.getContributor())) {
                        findItems.add(catalogItem);
                    }
                }
            }
        }
        if (searchCriteria.getTitle() != null && searchCriteria.getContributor() != null) {
            for (CatalogItem catalogItem : this.catalogItems) {
                for (int i = 0; i < catalogItem.getFeatures().size(); i++) {
                    if (catalogItem.getFeatures().get(i).getTitle().equals(searchCriteria.getTitle()) &&
                            catalogItem.getFeatures().get(i).getContributors().contains(searchCriteria.getContributor())) {
                            findItems.add(catalogItem);
                    }
                }
            }
        }

        return findItems;
    }

    public int getAllPageNumber() {
        int allPageNumber = 0;
        for (CatalogItem catalogItem : catalogItems) {
            allPageNumber += catalogItem.numberOfPagesAtOneItem();
        }
        return allPageNumber;
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> catalogItemList = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasAudioFeature()) {
                catalogItemList.add(catalogItem);
            }
        }
        return catalogItemList;
    }

    public int getFullLength() {
        int allFullLength = 0;
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasAudioFeature()) {
                allFullLength += catalogItem.fullLengthAtOneItem();
            }
        }
        return allFullLength;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> catalogItemList = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasPrintedFeature()) {
                catalogItemList.add(catalogItem);
            }
        }
        return catalogItemList;
    }
}

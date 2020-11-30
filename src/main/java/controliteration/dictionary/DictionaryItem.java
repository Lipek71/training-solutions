package controliteration.dictionary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DictionaryItem {

    private String word;

    private List<String> translations = new ArrayList<>();

    public DictionaryItem(String word, List<String> translations) {
        this.word = word;
        addTranslations(translations);
        //this.translations = translations; Mintha, akkor már nem lehetne bővíteni.
    }

    public void addTranslations(List<String> newTranslations) {
        for (String newTranslation: newTranslations) {
            if (!translations.contains(newTranslation)) {
                translations.add(newTranslation);
            }
        }
    }

    public String getWord() {
        return word;
    }

    public List<String> getTranslations() {
        return translations;
    }

    public static void main(String[] args) {
        DictionaryItem dictionaryItem = new DictionaryItem("kutya", Arrays.asList("pooch", "dog"));
        System.out.println(dictionaryItem.getTranslations().toString());
    }
}
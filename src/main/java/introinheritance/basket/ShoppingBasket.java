package introinheritance.basket;

public class ShoppingBasket extends Basket {
    private Basket basket = new Basket();

    @Override
    public void addItem(Item item) {
        basket.addItem(item);
    }

    @Override
    public void removeItem(String barcode) {
        basket.removeItem(barcode);
    }


    public double sumNettoPrice() {
        double nettoPrice = 0;
        for (Item item : basket.getItems()) {
            nettoPrice += item.getNettoPrice();
        }
        return nettoPrice;
    }

    public double sumTaxValue() {
        double taxValue = 0;
        for (Item item : basket.getItems()) {
            taxValue += item.getTaxAmount();
        }
        return taxValue;
    }

    public double sumBruttoPrice() {
        return sumNettoPrice() + sumTaxValue();
    }

    public void checkout() {
        basket.clearBasket();
    }

    public void removeMostExpensiveItem() {
        int mostExpensiveItemIndex = 0;
        for (int i = 1; i < basket.getItems().size(); i++) {
            if (basket.getItems().get(i).getNettoPrice() > basket.getItems().get(i - 1).getNettoPrice()) {
                mostExpensiveItemIndex = i;
            }
        }
        basket.getItems().remove(mostExpensiveItemIndex);
    }

}

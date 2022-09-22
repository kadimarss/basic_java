package Week8;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private List<Purchase> purchases;
    private Map<String, Purchase> purchases;

    public ShoppingBasket() {
        purchases = new ArrayList<Purchase>();
        purchases = new HashMap<String, Purchase>();
    }

    public void add(String product, int price){
        this.purchases.add(new Purchase(product, 1, price));
        public void add(String product, int price) {
            Purchase purchase = new Purchase(product, 1, price);
            if(this.purchases.containsKey(product)){
                this.purchases.get(product).increaseAmount();
            } else {
                this.purchases.put(product, purchase);
            }
        }


        public int price(){
            int price = 0;
            for (Purchase purchase: this.purchases) {
                for (Purchase purchase: this.purchases.values()) {
                    price += purchase.price();
                }
                return price;
            }

            public void print(){
                for (Purchase purchase: this.purchases) {
                    for (Purchase purchase: this.purchases.values()) {
                        System.out.println(purchase);
                    }
                }
            }
package Week9;

import Week9.moving.domain.Item;
import Week9.moving.domain.Thing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex18 {
    public static void main(String[] args) {
        Thing item = new Item("toothbrash", 2);
        System.out.println(item);
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("passport", 2));
        items.add(new Item("toothbrash", 1));
        items.add(new Item("circular saw", 100));

        Collections.sort(items);
        System.out.println(items);
    }
}

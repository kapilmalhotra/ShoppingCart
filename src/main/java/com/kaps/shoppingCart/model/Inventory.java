package main.java.com.kaps.shoppingCart.model;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.IntStream;

public class Inventory {
    private ConcurrentMap<String, Item> listingItems = new ConcurrentHashMap<String, Item>();

    public ConcurrentMap<String, Item> getListingItems() {
        return listingItems;
    }

    public void setListingItems(ConcurrentMap<String, Item> listingItems) {
        this.listingItems = listingItems;
    }

    public Inventory(List<Item> items) {
        IntStream.range(0, items.size()).forEach(i -> {
            Item item = items.get(i);
            listingItems.put(item.getName(), item);
        });
    }

    public void removeItem(String itemName) {
        listingItems.remove(itemName);
    }
}

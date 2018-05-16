package main.java.com.kaps.shoppingCart.service;

import main.java.com.kaps.shoppingCart.model.Inventory;
import main.java.com.kaps.shoppingCart.model.Item;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Cart {
    private List<Item> items = Collections.synchronizedList(new ArrayList());
    private Set<String> hexSet = new LinkedHashSet<>();
    private String cartId;
    private Inventory inventory;

    public Cart() {
        cartId = String.valueOf(System.currentTimeMillis());
    }

    public Cart(List<Item> items) {
        this.items = items;
        cartId = String.valueOf(System.currentTimeMillis());
    }

    public void empty() {
        this.items.clear();
    }

    public void removeItem(String itemName) {
        List<Item> itemsMarkedForDeletion = new LinkedList<>();
        for (Item item : items) {
            if(item.getName().equals(itemName)) {
                itemsMarkedForDeletion.add(item);
            }
        }

        items.removeAll(itemsMarkedForDeletion);
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getCartId() {
        return cartId;
    }

    public void add(String name, Double originalPrice, Double discountPercentage, String itemGroup, boolean refurbished,
                    boolean originalOwner, String hex, String color, String condition, String storage, boolean originalBox,
                    String shipFromLocation, String headline, String description, Image[] images) {
        if(hexSet.add(hex)) {
            items.add(new Item(name, originalPrice, discountPercentage, itemGroup, refurbished, originalOwner, hex, color,
                    condition, storage, originalBox, shipFromLocation, headline, description, images));
        }
        else {
            System.out.println("Hex already exists. Cannot add Item.");
        }
    }

    public Double getCartPrice() {
        return items.stream().map(Item::getItemFinalPrice).mapToDouble(Double::doubleValue).sum();
    }
}

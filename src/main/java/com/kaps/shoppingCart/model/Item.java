package main.java.com.kaps.shoppingCart.model;

import java.awt.*;

public class Item {
    private String name;
    private Double originalPrice;
    private Double discountPercentage;
    private String itemGroup;
    private boolean refurbished;
    private boolean originalOwner;
    private String hex;
    private String color;
    private String condition;
    private String storage;
    private boolean originalBox;
    private String shipFromLocation;
    private String headline;
    private String description;
    private Image[] images;

    private static final Double shippingCost = 1.0;

    public Item(String name, Double price, Double finalPrice, String itemGroup, boolean refurbished,
                boolean originalOwner, String hex, String color, String condition, String storage, boolean originalBox,
                String shipFromLocation, String headline, String description, Image[] images) {
        this.name = name;
        this.originalPrice = price;
        this.discountPercentage = finalPrice;
        this.itemGroup = itemGroup;
        this.refurbished = refurbished;
        this.originalOwner = originalOwner;
        this.hex = hex;
        this.color = color;
        this.condition = condition;
        this.storage = storage;
        this.originalBox = originalBox;
        this.shipFromLocation = shipFromLocation;
        this.headline = headline;
        this.description = description;
        this.images = images;
    }

    public Item(Item item) {
        if(item != null) {
            this.name = item.getName();
            this.discountPercentage = item.getDiscountPercentage();
            this.originalPrice = item.getOriginalPrice();
            this.itemGroup = item.itemGroup;
        }
    }

    public Double getItemFinalPrice() {
        return (originalPrice - (originalPrice * (discountPercentage / 100))) + shippingCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public String getItemGroup() {
        return itemGroup;
    }

    public void setItemGroup(String itemGroup) {
        this.itemGroup = itemGroup;
    }

    public boolean isRefurbished() {
        return refurbished;
    }

    public void setRefurbished(boolean refurbished) {
        this.refurbished = refurbished;
    }

    public boolean isOriginalOwner() {
        return originalOwner;
    }

    public void setOriginalOwner(boolean originalOwner) {
        this.originalOwner = originalOwner;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public boolean isOriginalBox() {
        return originalBox;
    }

    public void setOriginalBox(boolean originalBox) {
        this.originalBox = originalBox;
    }

    public String getShipFromLocation() {
        return shipFromLocation;
    }

    public void setShipFromLocation(String shipFromLocation) {
        this.shipFromLocation = shipFromLocation;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Image[] getImages() {
        return images;
    }

    public void setImages(Image[] images) {
        this.images = images;
    }
}

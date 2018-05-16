package main.java.com.kaps.shoppingCart.statics;

public enum Storage {
    Eight("8"),
    Sixteen("16"),
    ThirtyTwo("32"),
    SixtyFour("64"),
    OneTwentyEight("128");

    public String storage;

    Storage(String storage) {
        this.storage = storage;
    }

    public String getStorage() {
        return storage;
    }
}

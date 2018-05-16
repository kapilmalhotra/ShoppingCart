package main.java.com.kaps.shoppingCart.statics;

public enum ItemGroup {
    IPhone5("IPhone5"),
    IPhone5S("IPhone5S"),
    IPhone5C("IPhone5C"),
    IPhone6("IPhone6"),
    IPhone6Plus("IPhone6Plus"),
    IPhone6S("IPhone6S"),
    IPhone6SPlus("IPhone6SPlus"),
    IPhone7("IPhone7");

    private String name;

    ItemGroup(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

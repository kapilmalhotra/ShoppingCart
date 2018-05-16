package main.java.com.kaps.shoppingCart.statics;

public enum Color {
    Black("Black"),
    White("White"),
    Gold("Gold"),
    Red("Red"),
    Blue("Blue"),;

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

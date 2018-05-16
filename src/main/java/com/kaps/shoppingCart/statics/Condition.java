package main.java.com.kaps.shoppingCart.statics;

public enum Condition {
    NewUnopened("New Unopened"),
    NewOpened("New Opened"),
    Mint("Mint"),
    Good("Good"),
    Fair("Fair");

    private String condition;

    Condition(String condition) {
        this.condition = condition;
    }

    public String getCondition() {
        return condition;
    }
}

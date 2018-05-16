package test;

import main.java.com.kaps.shoppingCart.statics.Color;
import main.java.com.kaps.shoppingCart.statics.Condition;
import main.java.com.kaps.shoppingCart.statics.ItemGroup;
import main.java.com.kaps.shoppingCart.service.Cart;
import main.java.com.kaps.shoppingCart.statics.Storage;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.add("IPhone6", 200.0, 0.0, ItemGroup.IPhone6.getName(), false,
                false, "0001", Color.Black.getColor(), Condition.Good.getCondition(), Storage.Sixteen.getStorage(),
                false, "GA", "", "", null);
        cart.add("IPhone6S", 300.0, 0.0, ItemGroup.IPhone6S.getName(), false,
                false, "0002", Color.White.getColor(), Condition.NewUnopened.getCondition(), Storage.ThirtyTwo.getStorage(),
                false, "GA", "", "", null);
        cart.add("IPhone7", 400.0, 0.0, ItemGroup.IPhone7.getName(), false,
                false, "0003", Color.Gold.getColor(), Condition.NewOpened.getCondition(), Storage.SixtyFour.getStorage(),
                false, "GA", "", "", null);

        Double cartValue = cart.getCartPrice();
        System.out.println(cartValue);

        cart.removeItem("IPhone6");
        cartValue = cart.getCartPrice();
        System.out.println(cartValue);
    }
}

public class ShopKeeper extends Person {
    ShopKeeper(String name) {
        super(name);
    }

    @Override
    public String chat() {
        return "Hi, I'm a Shopkeeper";
    }

    void sellGoods() {
        //implement this method
    }
}
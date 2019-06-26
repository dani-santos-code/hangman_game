public class Main {
        public static void main(String[] args) {
            ShopKeeper shopKeeper = new ShopKeeper("Larry");
            Tea teacup = new Tea();
            String treehouse = "Treehouse";
            
            // Loop through Objects
            Object[] objects = {shopKeeper, teacup, treehouse};
            
            for (Object object : objects) {
                if (object instanceof Talk) {
                    String response = ((Talk) object).chat();
                    System.out.println(response);
                }
            }
            
            // Loop through Chattables
            Talk[] chattables = {shopKeeper, teacup};
            
            for (Talk chattable : chattables) {
                String response = chattable.chat();
                System.out.println(response);
            }
}


public class Main {
    public static void main(String[] args) {
        Cloth c1=new Cloth (122, "model 1", "red", 500, 3, Cloth.sizeValue.small);
        Cloth c2=new Cloth (152, "model 2", "blue", 300, 10, Cloth.sizeValue.medium);
        Cloth c3=new Cloth (164, "model 3", "red", 100, 12, Cloth.sizeValue.xxxl);

        Cart myCart=new Cart();

        // add c2
        myCart.addToCart(c1);
        myCart.printAllInCart();
        myCart.count();
        myCart.totalPriceValue();
        // add c2
        myCart.addToCart(c2);
        myCart.printAllInCart();
        myCart.count();
        myCart.totalPriceValue();

        boolean isfound;
        isfound =myCart.removeFromCart(166);
        if(isfound)
            System.out.println( "remove is done");
        else
            System.out.println( "product not found");

        // add c3
        myCart.addToCart(c3);
        myCart.printAllInCart();
        myCart.count();
        myCart.totalPriceValue();

        isfound=myCart.removeFromCart(164);
        if(isfound)
            System.out.println( "remove is done");
        else
            System.out.println( "product not found");
        myCart.printAllInCart();
        myCart.count();
        myCart.totalPriceValue();
    }
}
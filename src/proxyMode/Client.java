package proxyMode;

public class Client {

    public static void main(String[] args) {
        IShop coderShop = new WackyCoder();
        IShop purchasing = new Purchasing(coderShop);
        purchasing.buy();
    }

}

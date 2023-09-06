package proxyMode;


// 代理类
public class Purchasing implements IShop {

    private IShop mShop;

    public Purchasing(IShop shop) {
        mShop = shop;
    }

    @Override
    public void buy() {
        mShop.buy();
    }
}

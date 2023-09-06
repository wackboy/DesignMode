package proxyMode;

import java.lang.reflect.Proxy;

public class ClientDynamic {

    public static void main(String[] args) {
        IShop wackyCoder = new WackyCoder();
        DynamicPurchasing dynamicPurchasing = new DynamicPurchasing(wackyCoder);
        ClassLoader loader = wackyCoder.getClass().getClassLoader();
        IShop purchasing = (IShop) Proxy.newProxyInstance(loader, new Class<?>[]{IShop.class}, dynamicPurchasing);
        purchasing.buy();
    }

}

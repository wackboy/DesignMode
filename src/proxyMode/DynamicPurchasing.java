package proxyMode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicPurchasing implements InvocationHandler {

    private Object obj;
    public DynamicPurchasing(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // aop
        Object result = method.invoke(obj, args);
        if (method.getName().equals("buy")) {
            System.out.println("WackyCoder 在buy");
        }
        return result;
    }
}

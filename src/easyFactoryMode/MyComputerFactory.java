package easyFactoryMode;


import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class MyComputerFactory extends ComputerFactoryV2 {

    private static final MethodHandles.Lookup lookUp = MethodHandles.lookup();

    @Override
    public <T extends Computer> T createComputer(Class<T> clz) {
        try {
            return (T) lookUp.findConstructor(clz, MethodType.methodType(void.class)).invoke();
        } catch (Throwable e) {
            e.printStackTrace();
            return null;
        }
    }
}

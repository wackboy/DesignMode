package easyFactoryMode;

public abstract class ComputerFactoryV2 {

    // T要是Computer的子类
    public abstract <T extends Computer> T createComputer(Class<T> clz);
}

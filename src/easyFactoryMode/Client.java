package easyFactoryMode;

public class Client {

    public static void main(String[] args) {
        ComputerFactoryV2 gdComputerFactor = new GDComputerFactor();
        // 无需像简单工厂模式一样，在新增一个computer类的时候去手动给给工厂添加一个条件，违背开放封闭原则
//        LenovoComputer lenovoComputer = gdComputerFactor.createComputer(LenovoComputer.class);
//        lenovoComputer.start();
//        AsusComputer asusComputer = gdComputerFactor.createComputer(AsusComputer.class);
//        asusComputer.start();

        // Java9及以上版本推荐使用的写法
        MyComputerFactory myComputerFactory = new MyComputerFactory();
        LenovoComputer lenovoComputer = myComputerFactory.createComputer(LenovoComputer.class);
        lenovoComputer.start();

    }

}

package easyFactoryMode;

public class CreateComputer {

    public static void main(String[] args) {
        ComputerFactory.createComputer("hp").start();
    }

}

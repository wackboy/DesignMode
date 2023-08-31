package easyFactoryMode;

public class ComputerFactory {

    public static Computer createComputer(String type) {
        Computer mComputer = null;
        switch (type) {
            case "Lenovo":
                mComputer = new LenovoComputer();
                break;
            case "hp":
                mComputer = new HpComputer();
                break;
            case "Asus":
                mComputer = new AsusComputer();
                break;
        }
        return mComputer;
    }

}

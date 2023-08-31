package easyFactoryMode;

public class GDComputerFactor extends ComputerFactoryV2 {


    @Override
    public <T extends Computer> T createComputer(Class<T> clz) {
//        Computer computer = null;
//        String className = clz.getName();
//        try {
//            computer = (Computer) Class.forName(className).newInstance();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return (T) computer;

        // 可以比较一下这两种写法
        try {
            return clz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}

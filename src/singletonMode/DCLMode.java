package singletonMode;

public class DCLMode {

    private static volatile DCLMode instance;

    private DCLMode() {}

    public static DCLMode getInstance() {
        if (instance == null) {
            synchronized (DCLMode.class) {
                if (instance == null) {
                    instance = new DCLMode();
                }
            }
        }
        return instance;
    }


}

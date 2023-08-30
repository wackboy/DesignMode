package singletonMode;

public class EhanMode {

    private static final EhanModeKt instance = new EhanModeKt();

    private EhanMode() {
    }

    public static EhanModeKt getInstance() {
        return instance;
    }

}

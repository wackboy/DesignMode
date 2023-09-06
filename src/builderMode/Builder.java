package builderMode;

public abstract class Builder {

    public abstract void buildCpu(String cpu);
    public abstract void buildMainBoard(String mainBoard);
    public abstract void buildRam(String ram);
    public abstract Computer create();

}

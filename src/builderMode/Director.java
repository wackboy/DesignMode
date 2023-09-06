package builderMode;

public class Director {

    Builder builder = null;
    public Director(Builder builder) {
        this.builder = builder;
    }

    public Computer CreateComputer(String cpu, String mainBoard, String ram) {
        this.builder.buildCpu(cpu);
        this.builder.buildMainBoard(mainBoard);
        this.builder.buildRam(ram);
        return this.builder.create();
    }

}

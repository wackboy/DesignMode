package builderMode;

public class CreateComputer {

    public static void main(String[] args) {
        Builder builder = new MoonComputerBuilder();
        Director director = new Director(builder);
        Computer computer = director.CreateComputer("i7-13500", "huashuo", "ss");
        System.out.println(computer.getmCpu() + "-" + computer.getmRam() + "-" + computer.getmMainBoard());
    }

}

package ASSIGNMENT;

public class Computer {
    int wordsize;
    int memorySize;
    int storage;
    int speeed;

    public Computer(int i, int i1, int i2, int i3) {
        wordsize=i;memorySize=i1;storage=i2;speeed=i3;
    }


    public Computer() {

    }

    @Override
    public String toString() {
        return "Computer{" +
                "wordsize=" + wordsize +
                ", memorySize=" + memorySize +
                ", storage=" + storage +
                ", speeed=" + speeed +
                '}';
    }
}

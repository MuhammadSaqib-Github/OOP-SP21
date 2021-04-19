package ASSIGNMENT;

public class Tape extends Publication{
    private int m;

    public Tape(String title, double v , int m) {
        super(title, v);
        this.m = m;
    }


    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }


    public String display() {
        return "Tape{" +
                "m=" + m +
                '}';
    }
}

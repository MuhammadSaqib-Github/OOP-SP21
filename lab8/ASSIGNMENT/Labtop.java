package ASSIGNMENT;

public class Labtop extends Computer {

    int length;
    int width;
    int height;
    int weight;


    Labtop()
    {
        super();
        length=1;
        weight=4;
        height=6;
        weight=8;
    }

    Labtop(int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7)
    {
       super(i,i1,i2,i3);
    }

    @Override
    public String toString() {
        return "Labtop{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height + super.toString()+
                ", weight=" + weight +
                '}';
    }
}

import java.util.*;
public class Points {
    int x1; int y1; int x2; int y2; int x3; int y3;
    Points (int x1, int y1, int x2, int y2, int x3, int y3)
    {
        this.x1=  x1;
        this.y1=  y1;
        this.x2=  x2;
        this.y2=  y2;
        this.x3=  x3;
        this.y3=  y3;
    }


    public double Side1() {
        double side1 = Math.pow(Math.pow(x1-x2,2)+Math.pow(y1-y2,2),0.5);
        return side1;
    }
    public double Side2() {
        double side2 = Math.pow(Math.pow(x3-x2,2)+Math.pow(y3-y2,2),0.5);
        return side2;
    }
    public double Side3() {
        double side3 = Math.pow(Math.pow(x1-x3,2)+Math.pow(y1-y3,2),0.5);
        return side3;
    }
}

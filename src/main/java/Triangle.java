import java.util.*;
public class Triangle {
    double a;
    double b;
    double c;
    String areaStr;
    Triangle (double a, double b, double c)
    {
        this.a=  a;
        this.b=  b;
        this.c=  c;
    }
    public boolean isValidTriangle() {

        if (a<=0 || b<=0 || c<=0 || (a>=b+c)|| (b>=a+c) || c>=(a+b))
            return false;
        else return true;

    }


    public String area () {
        if (this.isValidTriangle()) {
            double s = ( a + b + c ) / 2;
            double area = Math.pow(s * ( s - a ) * ( s - b ) * ( s - c ), 0.5);
            String areaStr = String.format("%.2f", area);
            //System.out.println("The area of input Triangle is:" + areaStr ); }
            return areaStr;
        } else return "In valid input";
    }
    @Override
    public String toString(){
        if (!this.isValidTriangle()) {
            return (">>>Not a valid entry for a triangle. Please try again.");
            }
        else
            return ("The area of the above is: " + this.area());
    }
}

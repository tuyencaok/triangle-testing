
import java.util.*;
public class TriangleInit {

    int options =0;
    //constructor
    TriangleInit(){

    }

    public void run() {
        int caseID = getInput();
        doCaseManage(caseID);


    }
    public int getInput() {
        Scanner menu = new Scanner(System.in);
        System.out.println("\nPick a method to create a triangle or press 9 to quit\n" +
                "1:by length\n" +
                "2:by point\n" +
                "9:quit\n");
        options = menu.nextInt();
        return options;
    }

    public int[] getInputSides() {
        int[] sidesArray = new int[3];
        System.out.println("Please enter three number as lengths of a triangle.");
        Scanner sc = new Scanner(System.in);
        sidesArray[0] = sc.nextInt();   //read in first value
        sidesArray[1] = sc.nextInt();
        sidesArray[2] = sc.nextInt();

        return sidesArray;
    }

    public int[] getInputPoints() {
        int[] pointsArray = new int[6];
        System.out.println("Please enter three pair of number to form a triangle.Eg. 3,4 2,0 4,4");
        Scanner sc2 = new Scanner(System.in);
        //
        sc2.useDelimiter(",|\\s+");


        pointsArray[0] = sc2.nextInt();   //read in first value
        pointsArray[1] = sc2.nextInt();                 //read in second value
        pointsArray[2] = sc2.nextInt();                 //read in third value
        pointsArray[3] = sc2.nextInt();
        pointsArray[4] = sc2.nextInt();
        pointsArray[5] = sc2.nextInt();
        return pointsArray;
    }
    public static void main(String args[]) {

        TriangleInit triangle = new TriangleInit();
        triangle.run();
    }

    public void doCaseManage(int caseID) {
        if (caseID == 9) {
            System.out.println("Thank you for using Triangle program. Good bye!");
            System.exit(0);
        } else if (caseID == 1) {

            int[] sides = getInputSides();
            Triangle triangle = new Triangle(sides[0], sides[1], sides[2]);  //instantiate new triangle object
            System.out.println(triangle);

        } else if (caseID == 2) {
            int[] xy = getInputPoints();

            Points point = new Points(xy[0], xy[1], xy[2],xy[3], xy[4], xy[5]);
            Triangle triangle = new Triangle(point.Side1(), point.Side2(), point.Side3());  //instantiate new triangle object
            System.out.println(triangle);

        } else {
            System.out.println("Input invalid");
        }
    }

}

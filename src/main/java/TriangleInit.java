

import java.io.IOException;
import java.util.*;
public class TriangleInit {

    int options =0;
    //constructor
    TriangleInit(){

    }

    public void run() throws IOException {

        Scanner scanner = new Scanner(System.in);
        int caseID = getOptions(scanner);
        doCaseManage(caseID, scanner);

    }
    private int getOptions(Scanner scanner)  throws IOException {
       // Scanner menu = new Scanner(System.in);
        //menu.useDelimiter("\\s*");

        System.out.println("Pick a method to create a triangle or press 9 to quit\n" +
                "1:by length\n" +
                "2:by point\n" +
                "9:quit");
       int nextInput = scanner.nextInt();
        return nextInput;
    }

    public int[] getInputSides(Scanner scanner) {
        int[] sidesArray = new int[3];
        System.out.println("Please enter three number as lengths of a triangle.");
        sidesArray[0] = scanner.nextInt();   //read in first value
        sidesArray[1] = scanner.nextInt();
        sidesArray[2] = scanner.nextInt();
        return sidesArray;
    }
    public int[] getInputPoints(Scanner scanner ) {
        int[] pointsArray = new int[6];
        System.out.println("Please enter three pair of number to form a triangle.Eg. 3,4 2,0 4,4");
               scanner.useDelimiter(",|\\s+");
        pointsArray[0] = scanner.nextInt();   //read in first value
        pointsArray[1] = scanner.nextInt();                 //read in second value
        pointsArray[2] = scanner.nextInt();                 //read in third value
        pointsArray[3] = scanner.nextInt();
        pointsArray[4] = scanner.nextInt();
        pointsArray[5] = scanner.nextInt();
        return pointsArray;
    }


    public void doCaseManage(int caseID, Scanner scanner) {
        if (caseID==9 || caseID ==1 || caseID ==2) {
        if (caseID==9) {
            System.out.println("Thank you for using Triangle program. Good bye!");
            System.exit(0);
        } else if (caseID==1) {
            int[] sides = getInputSides(scanner);
            Triangle triangle = new Triangle(sides[0], sides[1], sides[2]);  //instantiate new triangle object
            System.out.println(triangle);
        } else if (caseID==2) {
            int[] xy = getInputPoints(scanner);
            Points point = new Points(xy[0], xy[1], xy[2],xy[3], xy[4], xy[5]);
            Triangle triangle = new Triangle(point.Side1(), point.Side2(), point.Side3());  //instantiate new triangle object
            System.out.println(triangle);
        } }
        else {
            System.out.print("Input invalid");
        }
    }
    public static void main(String args[]) throws IOException {

        TriangleInit triangle = new TriangleInit();
        triangle.run();
    }
}

package tamrin2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CalcGradeInterface {
    public static void main(String args[]) {
        System.out.println("Enter the Coeffs and the grade in each line with separating space.");
        Scanner scanner = new Scanner(System.in);
        ArrayList<MyTuple<Integer, Float>> coeffsGrades = new ArrayList<MyTuple<Integer, Float>>();
//        HashMap<Integer, Float> coeffsGrades = new HashMap<Integer, Float>();
        while(true) {
            String inputString = scanner.nextLine();
            if(inputString.isEmpty())
                break;
            String[] splittedString = inputString.split(" ", 0);
            if(splittedString.length < 2)
                break;
            coeffsGrades.add( new MyTuple(Integer.parseInt(splittedString[0]), Float.parseFloat(splittedString[1])));
        }
        double gpa = CalcGrade.calcGPA(coeffsGrades);

        System.out.println("The GPA is : " + String.valueOf(gpa) + " -- Conditional State: " + String.valueOf(gpa < 12));
    }
}

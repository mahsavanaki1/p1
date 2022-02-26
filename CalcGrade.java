package tamrin2;

import java.util.ArrayList;
import java.util.HashMap;

public class CalcGrade {
    public static double calcGPA(ArrayList<MyTuple<Integer, Float>> coeffsGrades) {
        double sumGrades = 0;
        Integer sumCoeffs = 0;
        for(MyTuple<Integer, Float> entry : coeffsGrades) {
            sumGrades += entry.getFirst() * entry.getSecond();
            sumCoeffs += entry.getFirst();
        }
        return sumGrades / sumCoeffs;
    }
}

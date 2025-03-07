package Leetcode.Array.Easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriaingle_119 {


    public static int fact(int n) {
        if( n == 0) {
            return 1;
        }

        int fact = n*fact(n-1);
        return fact;
    }


    public static List<Integer> getRow(int rowIndex) {
        List<Integer> lst = new ArrayList<>();
        int nci = 1;
        lst.add(nci);
        for (int i = 1; i <= rowIndex; i++) {

            int ncip1 = ((rowIndex - i)/(1+i))*nci;
            
            nci = ncip1;
            lst.add(ncip1);

        }
        return lst;
    }
    public static void main(String[] args) {
        int n = 13;
        System.out.println(getRow(n));
    }
}

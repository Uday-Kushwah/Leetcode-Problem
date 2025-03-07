package Leetcode.Recursion.Medium;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EliminationGame_390 {

    /* public static void eliminate(int n,ArrayList<Integer> lst) {
        if (lst.size() == 1) {
            System.out.println(lst);
            return;
        }

        boolean left = true;
        if(left) {
            for (int i = 0; i < lst.size()-1; i += 1) {
                lst.remove(i);
            }
            left = false;
            // System.out.println(lst);
        } else{
            for(int i = lst.size()-1 ; i > 0;i -= 1) {
                lst.remove(i-1);
            }
            left =true;
            // System.out.println(lst);
        }
        System.out.println(lst);
        eliminate(n, lst);
    }
 */

    /* public static void eliminate(int n,ArrayList<Integer> lst) {
        if (lst.size() == 1) {
            System.out.println(lst);
            return;
        }
        if (lst.size() == 0) {
            return;
        }
        for (int i = 0; i < lst.size(); i++) {
            lst.remove(i);
        }        
        for (int i = lst.size()-1; i >= 0; i-=2) {
            lst.remove(i);
        }
        eliminate(n, lst);
    }

    public static void main(String[] args) {
        int n = 9;
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lst.add(i + 1);
        }
        System.out.println(lst);
        eliminate(0, lst);
    }
 */

    public static void eliminate(int n,ArrayList<Integer> lst,boolean lefttoright) {
        if (lst.size() == 1) {
            System.out.println(lst);
            return;
        }
        ArrayList<Integer> temp = new ArrayList<>();
        if (lefttoright) {
            for (int i = 1; i < lst.size(); i += 2) {
                temp.add(lst.get(i));
            }
        } else {
            for (int i = lst.size()-2; i >= 0; i-=2) {
                temp.add(0,lst.get(i));
            }
        }
        eliminate(n, temp, !lefttoright);
    }

    public static void main(String[] args) {
        int n = 10000000;
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lst.add(i + 1);
        }
        // System.out.println(lst);
        eliminate(0, lst,true);
    }
}

package Leetcode.Recursion.Medium;

import java.util.ArrayList;

public class p {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        int n = 10;
        for (int i = 0; i < n; i++) {
            lst.add(i+1);    
        }
        System.out.println(lst);
        for (int i = 0; i < lst.size(); i++) {
            lst.remove(i);
        }
        System.out.println(lst);
        System.out.println(lst.size());
        for (int i = lst.size()-1; i >= 0; i--) {
            lst.remove(i--);
        }
        System.out.println(lst);
        System.out.println(lst.size());
    }
}

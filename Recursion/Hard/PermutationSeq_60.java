package Leetcode.Recursion.Hard;

import java.util.List;
import java.util.ArrayList;

public class PermutationSeq_60 {

    public static void permute(String ques,String ans,List<String> lst) {
        if(ques.length() == 0) {
            lst.add(ans);
            return;
        }

        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String s1 = ques.substring(0, i);
            String s2 = ques.substring(i+1);
            permute(s1+s2, ans+ch, lst);
        }
    }
    public static void main(String[] args) {
        String str = "123456789";
        int n = 4;
        int k = 9;
        List<String> lst = new ArrayList<>();
        permute(str.substring(0,n), "",lst);
        System.out.println(lst.get(k-1));
    } 


    // public static String permute(int count,String ques,int k,String ans ) {
    //     if(ques.length() == 0 || count == k) {
    //         return ans;
    //     }

    //     for (int i = 0; i < ques.length(); i++) {
    //         char ch = ques.charAt(i);
    //         String s1 = ques.substring(0, i);
    //         String s2 = ques.substring(i+1);
    //         return permute(count+1,s1+s2, k, ans+ch);

    //     }
        
    //     return "";
    // }

    // public static void main(String[] args) {
   
    //     String str = "123456789";
    //     int n = 3;
    //     int k = 4;
    //     System.out.println(permute(0,str.substring(0,n), k, ""));
    // }


    
}

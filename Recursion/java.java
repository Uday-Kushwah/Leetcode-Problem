package Leetcode.Recursion;
public class java {

    /* public static void permutation(String ques,String ans) {
        if(ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        permutation(ques.substring(1), ans);
        permutation(ques.substring(1), ans+ch);
    }
    public static void main(String[] args) {
        String s = "abc";
        permutation(s, "");
    } */

    /* public static boolean checkAageHai(String str,char ch,int count) {
        boolean aagehai = true;
        for (int i = count+1; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                aagehai = false;
            }
        }
        return aagehai;
    }

    public static void permutation(String ques,String ans,int count) {
        if(ques.length() == 0) {
            count++;
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        if(checkAageHai(ans, ch, count)) {
            permutation(ques.substring(1), ans,count);
            permutation(ques.substring(1), ans+ch,count);
        }
    }
    public static void main(String[] args) {
        String s = "aabc";
        permutation(s, "",0);
    } */



   
    /* public static void combination(String ques,String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            boolean aagehai = false;
            for(int j = i+1;j<ques.length();j++) {
                if(ques.charAt(j) == ch) {
                    aagehai = true;
                    break;
                }
            }
            if(!aagehai) {
                String s1 = ques.substring(0, i);
                String s2 = ques.substring( i+1);
                combination(s1+s2, ans+ch);
            }
        }
    }
    public static void main(String[] args) {
        String s = "aabc";
        combination(s, "");
        // System.out.println(s.substring(0,0));
    } */



    public static void generateParenthesis(int n,String ans,int open,int close) {
        
        if(close == n && open == n) {
            System.out.println(ans);
            return;
        }

        if(open > n) {
            return;
        }
        if(close > open) {
            return;
        }
        generateParenthesis(n, ans+"(", open+1, close);
        generateParenthesis(n, ans+")", open, close+1);
    }
    public static void main(String[] args) {
        int n = 3;
        generateParenthesis(n,"",0,0);
    }
}

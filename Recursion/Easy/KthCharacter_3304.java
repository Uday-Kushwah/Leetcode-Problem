package Leetcode.Recursion.Easy;

public class KthCharacter_3304 {

   /*  public static void KthCharacter(String ques,int k) {
        if(ques.length() >= k) {
            System.out.println(ques);
            return;
        }
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            char nextchar = (char)(ch+1);
            str.append(nextchar);
        }

        ques += str.toString();
        KthCharacter(ques, k);
       
    }
    public static void main(String[] args) {
        int k = 5;
        KthCharacter("a", k);
    } */



    public static char KthCharacter(String ques,int k) {
        if(ques.length() >= k) {
            System.out.println(ques);
            return ques.charAt(k-1);
        }
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            char nextchar = (char)(ch+1);
            str.append(nextchar);
        }

        ques += str.toString();
        return KthCharacter(ques, k);
       
    }
    public static void main(String[] args) {
        int k = 5;
        System.out.println(KthCharacter("a", k));
    }
}
package Leetcode.Recursion.Medium;

public class PartitionOfString {

    public static void Partition(String ques, String ans ) {
        if(ques.length() == 0) {
            // System.out.println("|"+ans);
            System.out.println(ans.substring(0,ans.length()-1));
            return;
        }
        for (int i = 0; i < ques.length(); i++) {
            String ch = ques.substring(0,i+1);
            Partition(ques.substring(i+1), ans+ch+'|');
        }
    }
    public static void main(String[] args) {
        String s = "nitin";
        Partition(s, "");
    }
}

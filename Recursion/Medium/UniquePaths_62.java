package Leetcode.Recursion.Medium;

public class UniquePaths_62 {

    public static int UniquePaths(int m, int n, int hor, int ver,String ans) {
        if(m == hor && n == ver) {
            System.out.println(ans);
           
            return 1;
        }
        if(hor > m || ver > n) {
            return 0;
        }
        int n1 =  UniquePaths(m, n, hor+1, ver, ans+"H");
        int n2 =  UniquePaths(m, n, hor, ver+1, ans+"V");
        return n1+n2;
    }
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        
        System.out.println(UniquePaths(m-1, n-1, 0, 0, ""));
    }
}

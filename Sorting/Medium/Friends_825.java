package Leetcode.Sorting.Medium;

public class Friends_825 {
    public static int numFriendRequests(int[] ages) {
        int count = 0;
        for (int i = 0; i < ages.length; i++) {
            int x = ages[i];
            for (int j = i+1; j < ages.length; j++) {
                int y = ages[j];
                boolean is = (y<= 0.5*x+7 || y > x || (y > 100 && x < 100));
                if(is) {
                    count++;

                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        // int[] ages = {16,17,18};
        // int[] ages = {16,16};
        int[] ages = {20,30,100,110,120};
        System.out.println(numFriendRequests(ages));
    }
}

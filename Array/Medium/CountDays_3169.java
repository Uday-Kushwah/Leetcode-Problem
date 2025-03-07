package Leetcode.Array.Medium;

public class CountDays_3169 {

    public static int countDays(int days, int[][] meetings) {
        //worst case : TC = (n^2);
        int[] count_days = new int[days];
        for (int i = 0; i < meetings.length; i++) {
            int start = meetings[i][0];
            int end = meetings[i][1];
            for (int j = start-1; j < end; j++) {
                count_days[j] = 1;
            }
        }
        int nomeeting = 0;
        for (int i = 0; i < count_days.length; i++) {
            System.out.print(count_days[i]+" ");
            if(count_days[i] == 0) {
                nomeeting++;
            }
        }
        System.out.println();
        return nomeeting;

        
        //Best case : O(n) 
        // int meeting = 0;
        // for (int i = 0; i < meetings.length; i++) {
        //     int start = meetings[i][0];
        //     int end = meetings[i][1];
        //     meeting += end-start+1;
            
        // }
        // int nomeeting = days-meeting;
        // System.out.println(nomeeting); 
        // if(nomeeting < 0 ){
        //     return 1;
        // }
        // if(nomeeting == 1) {
        //     return 0;
        // }
        // return nomeeting;


        




    }

    public static void main(String[] args) {
        int days = 10;
        int[][] meetings = {{5,7},{1,3},{9,10}};
        // int days = 4;
        // int[][] meetings = {{2,3},{1,2},{2,3},{2,4},{1,2},{1,3}};
        System.out.println(countDays(days, meetings));
    }
}

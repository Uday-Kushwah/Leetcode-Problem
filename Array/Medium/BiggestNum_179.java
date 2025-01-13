package Leetcode.Array.Medium;
public class BiggestNum_179 {
    public static String largestNumber(int[] arr) {
        
        boolean is_0_arr = true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                is_0_arr = false;
            }
        }
        if(is_0_arr) {
            return "0";
        }
        
        int n = arr.length;
        int i = 0;
        while (i < n) {
            for (int j = i+1; j < arr.length; j++) {
                String num_i = ""+arr[i];
                String num_j = ""+arr[j];
                String num_i_add_num_j = num_i+num_j;
                String num_j_add_num_i = num_j+num_i;
                // if(Long.parseLong(num_j_add_num_i) > Long.parseLong(num_i_add_num_j)) {
                if(num_j_add_num_i.compareTo(num_i_add_num_j) > 0){ 
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
            i++;
        }
        String ans = "";
        for (int k = 0; k < arr.length; k++) {
            ans += (arr[k]+"");
        }
        return ans;
    }
    public static void main(String args[]) {
       
        // int[] arr = {2,10};
        // int[] arr = {700000000,500000000};
        // int[] arr = {1000000000, 1000000000};
        
        int[] arr = {0,0};
        System.out.println(largestNumber(arr));
        
    }
}

//https://codeskiller.codingblocks.com/problems/446

package Leetcode.SlidingWindow;

import java.util.Scanner;

public class Kartik446_codeSkiller {

    public static int KartikBhaiyaAndString(int k, String str, char ch) {
        int si = 0 , ei = 0, ans = 0, flip = 0;
        while (ei < str.length()) {
            //grow
            if(str.charAt(ei) == ch) {
                flip++;
            }
            //shrink
            while (flip > k && si <= ei) {
                if(str.charAt(si) == ch) {
                    flip--;
                }
                si++;
            }

            //ans update
            ans = Math.max(ans,ei - si +1);
            ei++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int flip_a = KartikBhaiyaAndString(n, str, 'a');
        int flip_b = KartikBhaiyaAndString(n, str, 'b');
        System.out.println(Math.max(flip_a, flip_b));
        sc.close();
    }
}

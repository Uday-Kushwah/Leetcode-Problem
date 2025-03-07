package Leetcode.String.Medium;

public class StringCompress_443 {


    public static int reverse(int n) {
        int ans =0;
        while (n != 0) {
            int lastdigit = n % 10;
            ans =ans*10+ lastdigit;
            n /= 10;
        }
        return ans;
    }

    public static int compress(char[] chars) {
        if(chars.length == 1) {
            return 1;
        }
        int n = chars.length;
        String str = "";
        int ans = 0;
        for (int i = 0; i < n; i++) {
            str += chars[i];
            ans++;
            int count = 1;
            while ((i < (n-1)) && chars[i] == chars[i+1]) {
                count++;
                i++;

            }
            if(count > 1) {
                ans++;
                str += count;
            }
        }
        // System.out.println(str);
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            chars[c++] = str.charAt(i);
            i++;
            int num = ((int)str.charAt(i) - 48);
            if(num > 10){
                num = reverse(num);
                while(num != 0) {
                    int lastdigit = num%10;
                    chars[c++] = (char)(lastdigit+48);
                    num /= 10;
                }
            } else {
                chars[c++] = (char)(num+48);
            }
        }
        System.out.println(str);
        return str.length();
    }
    public static void main(String[] args) {
        // char[] ch = {'a','a','b','b','c','c','c'};
        // char[] ch = {'a'};
        char[] ch = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
     
        System.out.println(compress(ch));

        System.out.println();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]+" ");
        }
    }
}

package Leetcode.String.Medium;

public class StringCompress_443 {

    public static String UniqueChar(char[] ch) {
        String ans = "";
        for (int i = 0; i < ch.length-1; i++) {
            if(ch[i] != ch[i+1]) {
                ans += ch[i];
            }
        }
        ans += ch[ch.length-1];
        return ans;
    }

    public static int CountDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }


    public static int compress(char[] chars) {
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
        System.out.println(str);
        // return str.length();

        return ans;
    }
    public static void main(String[] args) {
        char[] ch = {'a','a','b','b','c','c','c'};
        // char[] ch = {'a'};
        // System.out.println(UniqueChar(ch));
        System.out.println(CountDigits(12345));
        System.out.println(compress(ch));
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]+" ");
        }
    }
}

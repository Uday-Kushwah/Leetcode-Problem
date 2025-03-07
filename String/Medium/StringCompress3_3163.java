package Leetcode.String.Medium;

public class StringCompress3_3163 {

    public static String compressedString(String word) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            int count = 1;
            char ch = word.charAt(i);
            while(i < word.length()-1 && ch == word.charAt(i+1)) {
                count++;
                i++;
            }

            while (count > 9) {
                s.append(9);
                s.append(ch);
                count -= 9;
            }
            if(count <= 9) {
                s.append(count);
                s.append(ch);
            }
        }
        return s.toString();
    }
    public static void main(String[] args) {
        // String str = "abcde";
        String str = "aaaaaaaaaaaaaaaaaaaaaaaabb";
        System.out.println(compressedString(str));
    }
}

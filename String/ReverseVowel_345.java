package Leetcode.String;

public class ReverseVowel_345 {

    public static boolean isVowel(char chr){
        if(chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u' ||chr == 'A' ||chr == 'E' ||chr == 'I' || chr == 'O' || chr == 'U'){
            return true;
        } 
        else {
             return false;
        }
    }
    public static String reverseVowels(String s) {
        char[] str = s.toCharArray();
        
        int i = 0;
        int j = str.length-1;
        while (i <= j) {
            if(isVowel(str[i]) && isVowel(str[j])){
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
                j--;
            } else if(!isVowel(str[i])) {
                i++;
            } else {
                j--;

            }
        }
        // String ans = "";
        // for (int k = 0; k < str.length; k++) {
        //     ans += str[k];
        // }
        // return ans;

        return new String(str);

    }
    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }
}

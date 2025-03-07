package Leetcode.Recursion.Medium;

public class CoinChange_322 {
    //2147483647
    static int answer = Integer.MAX_VALUE;
    public static void Coin(int[] coin,int amount, String ans,int idx, int count) {
        if(amount == 0) {
            // answer = Math.min(answer,count);
            if(answer > count) {
                answer = count;
            }
            System.out.println(ans);
            return;
        }
        for(int i=idx;i <coin.length;i++) {
            if(amount >= coin[i]) {
                Coin(coin,amount-coin[i], ans+coin[i],i,count+1);
            }
        }
    }

    public static void main(String[] args) {
        int[] coins = {2,1};
        int amount = 3;
        // int[] coins = {2};
        // int amount = 3;
        Coin(coins, amount,"", 0, 0);
        System.out.println(Integer.MAX_VALUE);
        if (answer == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println( answer);
        }
    }
}

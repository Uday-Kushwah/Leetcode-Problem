package Leetcode.Recursion.Medium;

public class NumberDice_1155 {
    
    
   /*  public static void RollingDice(int no_of_dice, int target, int currDice, int currSum, String ans, int no_of_face) {
        // Base case: If all dice are used
        if (currDice == no_of_dice) {
            // Check if the current sum matches the target
            if (currSum == target) {
                System.out.println(ans);
            }
            return;
        }

        // Try all possible outcomes for the current die
        for (int i = 1; i <= no_of_face; i++) {
            RollingDice(no_of_dice, target, currDice + 1, currSum + i, ans + i, no_of_face);
        }
    }

    public static void main(String[] args) {
        int no_of_dice = 2; // Number of dice
        int no_of_face = 6; // Number of faces on each die
        int target = 7;     // Target sum
        
        RollingDice(no_of_dice, target, 0, 0, "", no_of_face);
    } */



    // count the no. of pair

    public static int RollingDice(int no_of_dice, int target, int currDice, int currSum, String ans, int no_of_face) {
        // Base case: If all dice are used
        int count = 0;
        if (currDice == no_of_dice) {
            // Check if the current sum matches the target
            if (currSum == target) {
                // System.out.println(ans);
                return 1;
            }
            return 0;
        }
        
        // Try all possible outcomes for the current die
        for (int i = 1; i <= no_of_face; i++) {
            count += RollingDice(no_of_dice, target, currDice + 1, currSum + i, ans + i, no_of_face);
        }
        return count;
    }

    public static void main(String[] args) {
        int no_of_dice = 2; // Number of dice
        int no_of_face = 6; // Number of faces on each die
        int target = 7;     // Target sum
        System.out.println(RollingDice(no_of_dice, target, 0, 0, "", no_of_face));
        
    }
}

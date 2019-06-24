import com.sun.jndi.url.iiop.iiopURLContextFactory;

public class Explore {
    public static void main(String[] args) {
        int[][] scoreCards = {
            // Ben's
            {1, 2, 4, 2, 6, 5, 4, 3, 3, 2, 5, 7, 2, 7, 8, 4, 3, 2},
            // Alena's
            {2, 3, 5, 1, 1, 2, 3, 1, 1, 2, 4, 1, 3, 3, 2, 6, 3, 2},
            // Pasan's
            {4, 4, 2, 1, 2, 2, 1, 4, 2, 2, 2, 3, 2, 5, 8, 1, 2, 2}
        };
        // Create a new friends array using the array literal shortcut
        // Include Ben, Alena, Pasan
        String[] friends = { "Ben", "Alena", "Pasan" };
        // // Enhanced foor loop
        // for (String friend : friends) {
        //     System.out.printf("Hey, %s! The movie starts at 7. C U there! %n", friend);
        // }
        // //Standard format
        // for (int i = 0; i < friends.length; i++) {
        //     System.out.printf("Hey, %s! The movie starts at 7. C U there! %n", friends[i]);
        // }
        // int[] bensScoreCard = {1, 2, 1, 5, 2, 4, 4, 4, 3, 6, 1, 2, 5, 4, 3, 2, 6, 3};
        // for (int i = 0; i < bensScoreCard.length; i++) {
        //     System.out.printf("Hole number #%d: %d %n", i + 1, bensScoreCard[i]);

        // }
        // For each friend, print their name
        // for each hole
        // print their score
        for (int i = 0; i < friends.length; i++) {
            System.out.printf("%s's stats: %n*|*|*|*|%n",friends[i]);
            for (int j = 0; j < scoreCards[i].length; j++) {
                System.out.printf("Hole #%d: %d %n--------%n", j+1, scoreCards[i][j]);

        }
        
    }
} 
}
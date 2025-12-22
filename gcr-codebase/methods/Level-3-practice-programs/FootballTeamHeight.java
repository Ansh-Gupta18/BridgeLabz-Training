import java.util.Scanner;

public class FootballTeamHeight {

    // Method to calculate sum of heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    // Method to calculate mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    // Method to find tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] heights = new int[11];
        Scanner sc = new Scanner(System.in);
        // Generate random heights between 150 and 250
        System.out.println("each player in the range 150 cms to 250 cms");
        for (int i = 0; i < heights.length; i++) {
           System.out.print("Enter the height of : " +(i + 1 )+ " player : "); // 150 to 250
           heights[i] = sc.nextInt();
            System.out.println("Player " + (i + 1) + " height: " + heights[i] + " cm");
        }

        System.out.println("\nShortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");
        System.out.println("Mean Height: " + findMean(heights) + " cm");
    }
}

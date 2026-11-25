import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int t = sc.nextInt();

        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] > t) {
                    count++;
                }
            }
        }

        System.out.println("Values greater than " + t + ": " + count);
        sc.close();
    }
}

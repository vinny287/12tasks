import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value to find: ");
        int target = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < 3 && !found; i++) {
            for (int j = 0; j < 3 && !found; j++) {
                if (a[i][j] == target) {
                    System.out.println("Found at row " + i + ", column " + j);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Not found");
        }
        sc.close();
    }
}

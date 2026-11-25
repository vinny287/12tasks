public class Task5 {
    public static void main(String[] args) {
        int[][] a = {
                {12, 5, 8, 20},
                {3, 17, 9, 14},
                {25, 1, 6, 10}
        };

        int min = a[0][0];
        int max = a[0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (a[i][j] < min) min = a[i][j];
                if (a[i][j] > max) max = a[i][j];
            }
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}

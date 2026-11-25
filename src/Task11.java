public class Task11 {
    static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = {
                {3, -1, 4},
                {-5, 2, -7},
                {8, -9, 6}
        };

        System.out.println("Before:");
        print(a);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < 0) {
                    a[i][j] = 0;
                }
            }
        }

        System.out.println("After:");
        print(a);
    }
}

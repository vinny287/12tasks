
public class Task2 {
    public static void main(String[] args) {
        int[][] a = {{5, 10, 15}, {20, 25, 30}};

        System.out.println(a[1][2]);   // 30

        a[0][1] = 99;

        for (int[] row : a) {
            for (int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
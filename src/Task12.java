public class Task12 {
    public static void main(String[] args) {
        int[][] grades = {
                {85, 90, 78, 92},
                {70, 65, 88, 75},
                {95, 98, 91, 100}
        };

        int classMax = grades[0][0];
        int total = 0;
        int count = 0;

        for (int i = 0; i < 3; i++) {
            int studentSum = 0;
            for (int j = 0; j < 4; j++) {
                studentSum += grades[i][j];
                if (grades[i][j] > classMax) {
                    classMax = grades[i][j];
                }
            }
            double avg = studentSum / 4.0;
            System.out.println("Student " + (i + 1) + " average: " + avg);

            total += studentSum;
            count += 4;
        }

        System.out.println("Class maximum: " + classMax);
        System.out.println("Overall average: " + (double) total / count);
    }
}

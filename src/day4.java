/*
void main() {
    int[][] attendance = new int[5][3];
    int[][] StudentAttendance = {
            {0, 1, 0},
            {1, 0, 0},
            {1, 1, 1},
            {1, 0, 1},
            {0, 0, 0}


    };
    for (int row = 0; row < StudentAttendance.length; row++) {
        System.out.println("Student" + (row+1));
        for (int col = 0; col < StudentAttendance[row].length; col++) {
            if (StudentAttendance[row][col] == 1)
                System.out.println("Class : Present");
            else
                System.out.println("Class : Absent");
        }
        System.out.println();
    }
}

 */
void main() {
    int[][] marks = new int[5][3];
    int[][] studentsmarks = {
            {78, 90, 34}, {89, 65, 89}, {12, 34, 56}, {66, 12, 89}, {33, 77, 88}
    };
    String[] subjects = {"Maths", "Physics", "Chemistry"};

    for (int col = 0; col < 3; col++) {
        int total = 0;

        for (int row = 0; row < 5; row++) {
            total += studentsmarks[row][col];
        }

        double average = total / 5.0;

        System.out.println(subjects[col]);
        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
        System.out.println();
    }

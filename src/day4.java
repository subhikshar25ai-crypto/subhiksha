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

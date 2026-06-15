/*
  String name = "vetias";
  System.out.println(name.toUpperCase());
}

   */
    /*
    String name = "vetias,college,arts";
    System.out.println(name.split(",")[2]);
}

     */
    /*
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter your name");
    String name = Sc.nextLine();
    System.out.println("enter your department");
    String dept = Sc.nextLine();
    System.out.println("Enter youe Age");
    String age = Sc.nextLine();
    System.out.println("details :");
    System.out.println("Name:" + name);
    System.out.println("Dept:" + dept);
    System.out.println("Age:" + age);H
}

     */
    /*
    void main() {
        int[][] marks = new int[5][3];
        int[][] studentsmarks = {
                {78, 90, 34}, {89, 65, 89}, {12, 34, 56}, {66, 12, 89}, {33, 77, 88}
        };
        String[] subjects = {"Maths", "Physics", "Chemistry"};

        for (int col = 0; col < 3; col++) {
            int total = 0
        }
    }
     */

public class day5 {

    static class Student {
        String name, dept;
        int regNo;
        int maths, physics, chemistry;

        Student(String n, int r, String d) {
            name = n;
            regNo = r;
            dept = d;
        }
        int getMaths() {
            return maths;
        }
        int getPhysics() {
            return physics;
        }

        int getChemistry() {
            return chemistry;
        }

        void setMaths(int m) {
            maths = m;
        }

        void setPhysics(int p) {
            physics = p;
        }

        void setChemistry(int c) {
            chemistry = c;
        }
        void updateMarks(int m) {
            maths = m;
        }

        void updateMarks(int m, int p) {
            maths = m;
            physics = p;
        }

        void updateMarks(int m, int p, int c) {
            maths = m;
            physics = p;
            chemistry = c;
        }

        void show() {
            System.out.println(name + " " + regNo + " " + dept);
            System.out.println(maths + " " + physics + " " + chemistry);
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("KUMAR", 101, "MATHS");
        Student s2 = new Student("REYMANTH", 102, "PHY");
        Student s3 = new Student("DHARANI", 103, "chemistry");
        s1.updateMarks(80, 85, 90);
        s2.setMaths(80);
        s2.setPhysics(75);
        s2.setChemistry(60);
        s3.updateMarks(90);
        s1.show();
        s2.show();
        s3.show();
    }
}


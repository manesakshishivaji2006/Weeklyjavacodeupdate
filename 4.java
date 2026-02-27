interface Exam {
    void setMarks(int m1, int m2);
    void displayMarks();
}

class Student {
    int rollNo;

    void setRollNo(int r) {
        rollNo = r;
    }

    int getRollNo() {
        return rollNo;
    }
}

class Result extends Student implements Exam {
    int marks1, marks2;

    public void setMarks(int m1, int m2) {
        marks1 = m1;
        marks2 = m2;
    }

    public void displayMarks() {
        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
    }

    void displayResult() {
        int total = marks1 + marks2;
        double percentage = total / 2.0;

        System.out.println("Roll No: " + getRollNo());
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);
    }
}

class StudentTest {
    public static void main(String[] args) {
        Result r = new Result();

        r.setRollNo(101);
        r.setMarks(80, 90);

        r.displayMarks();
        r.displayResult();
    }
}

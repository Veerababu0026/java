import java.util.Scanner;

class Subjects {
    int marks[] = new int[4];

    void getMarks(int mark[]) {
        marks = mark;
    }
}

class Total extends Subjects {
    int total = 0;

    void calculateTotal() {
        for (int mark : marks) {
            total += mark;
        }
        System.out.println("Total = " + total);
    }
}

class Average extends Total {
    double aggregate;

    void calculateAverage() {
        aggregate = total / 4.0;
        System.out.println("Aggregate = " + aggregate);
    }
}

class Grade extends Average {
    void calculateGrade() {
        if (aggregate > 75) {
            System.out.println("DISTINCTION");
        } else if (aggregate >= 60 && aggregate < 75) {
            System.out.println("FIRST DIVISION");
        } else if (aggregate >= 50 && aggregate < 60) {
            System.out.println("SECOND DIVISION");
        } else if (aggregate >= 40 && aggregate < 50) {
            System.out.println("THIRD DIVISION");
        } else {
            System.out.println("FAIL");
        }
    }

    public static void main(String[] args) {
        int m[] = new int[4];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks in Python: ");
        m[0] = scanner.nextInt();
        System.out.print("Enter the marks in C Programming: ");
        m[1] = scanner.nextInt();
        System.out.print("Enter the marks in Mathematics: ");
        m[2] = scanner.nextInt();
        System.out.print("Enter the marks in Physics: ");
        m[3] = scanner.nextInt();

        Grade student = new Grade();
        student.getMarks(m);
        student.calculateTotal();
        student.calculateAverage();
        student.calculateGrade();
    }
}
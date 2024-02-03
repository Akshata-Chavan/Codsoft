import java.util.*;

public class grades {

    public void studentGrade() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Subjects: ");
        int n = sc.nextInt();

        int marks[] = new int[n];

        int i;
        float total = 0, avg;

        System.out.println("Enter marks for " + n + " Subjects: ");

        for (i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        sc.close();

        avg = total / n;

        System.out.println("The Grade Obtained is: ");

        if (avg >= 90) {
            System.out.println("A+");
        } else if (avg >= 80) {
            System.out.println("A");
        } else if (avg >= 70) {
            System.out.println("B+");
        } else if (avg >= 60) {
            System.out.println("B");
        } else if (avg >= 50) {
            System.out.println("C+");
        } else if (avg >= 45) {
            System.out.println("c");
        } else {
            System.out.println("Fail");
        }

    }

    public static void main(String[] args) {
        grades sg= new grades();
        sg.studentGrade();
    }

}
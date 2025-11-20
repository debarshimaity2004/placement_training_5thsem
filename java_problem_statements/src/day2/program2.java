// Create a class with the following attributes: 
// int rollno, 
// int mark1, 
// int mark2, 
// int mark3. 
// Create an array of objects for the above class. 
// Create the main class and in the main method calculate and print the following. 
// Total marks obtained by each student. 
// The highest mark in each subject with the roll number of the student who scored it. 
// The student who obtained the highest total mark. 
// Input Format 
// The first line of the input consists of the value of n. 
// The second lines consist of an integer (roll number, mark1, mark2, and mark3) 
// Output Format 
// First n lines print the total marks of each student. 
// The next 3 lines print the student's roll number and highest marks in each subject, separated 
// by a space. 
// The last line prints the roll number of the student and the highest total marks scored. 
// Sample Input 
// 5 
// 1 98 85 76 
// 2 85 74 65 
// 3 85 96 75 
// 4 52 65 79 
// 5 52 75 65 
// Sample Output 
// 259 
// 224 
// 256 
// 196 

import java.util.Scanner;

class Student {
    int rollno;
    int mark1,mark2,mark3;

    public Student(int rollno, int mark1, int mark2, int mark3) {
        this.rollno = rollno;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    public int getTotalMarks() {
        return mark1 + mark2 + mark3;
    }
}
public class program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter student details (rollno,mark1,mark2,mark3):");
            int rollno = scanner.nextInt();
            int mark1 = scanner.nextInt();
            int mark2 = scanner.nextInt();
            int mark3 = scanner.nextInt();
            students[i] = new Student(rollno, mark1, mark2, mark3);
        }

        int highestMark1 = -1, highestMark2 = -1, highestMark3 = -1;
        int rollHighestMark1 = -1, rollHighestMark2 = -1, rollHighestMark3 = -1;
        int highestTotalMarks = -1, rollHighestTotalMarks = -1;

        for (Student student : students) {
            int totalMarks = student.getTotalMarks();
            System.out.println(totalMarks);

            if (student.mark1 > highestMark1) {
                highestMark1 = student.mark1;
                rollHighestMark1 = student.rollno;
            }
            if (student.mark2 > highestMark2) {
                highestMark2 = student.mark2;
                rollHighestMark2 = student.rollno;
            }
            if (student.mark3 > highestMark3) {
                highestMark3 = student.mark3;
                rollHighestMark3 = student.rollno;
            }
            if (totalMarks > highestTotalMarks) {
                highestTotalMarks = totalMarks;
                rollHighestTotalMarks = student.rollno;
            }
        }

        System.out.println(rollHighestMark1 + " " + highestMark1);
        System.out.println(rollHighestMark2 + " " + highestMark2);
        System.out.println(rollHighestMark3 + " " + highestMark3);
        System.out.println(rollHighestTotalMarks + " " + highestTotalMarks);
    }
}

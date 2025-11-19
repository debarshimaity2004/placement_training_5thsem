
// Ritik is working on a science project where he wants to build a magic board. This board 
// should display a corresponding character for a given number input. However, Ritik wants the 
// program to convert exactly four numbers into their respective ASCII characters without using 
// any loops or iteration. Your task is to help Ritik develop this application. 
// Sample Input 1: 
// Enter the digits: 
// 65 
// 66 
// 67 
// 68 
// Sample Output 1: 
// 65-A 
// 66-B 
// 67-C 
// 68-D 

import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the digits: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt(); 
        int num3 = s.nextInt();
        int num4 = s.nextInt();

        char char1 = (char) num1;
        char char2 = (char) num2;
        char char3 = (char) num3;
        char char4 = (char) num4;

        System.out.println(num1 + "-" + char1);
        System.out.println(num2 + "-" + char2);
        System.out.println(num3 + "-" + char3);
        System.out.println(num4 + "-" + char4);
    }
}

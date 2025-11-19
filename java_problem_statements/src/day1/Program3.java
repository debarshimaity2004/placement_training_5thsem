// The newspaper Agency 
// Each Sunday, a newspaper agency sells w copies of a special edition newspaper for Rs.x per 
// copy. The cost to the agency of each newspaper is Rs.y. The agency pays a fixed cost for 
// storage, delivery and so on of Rs.100 per Sunday. The newspaper agency wants to calculate 
// the profit which it obtains only on Sundays. Can you please help them out by writing a 
// program to compute the profit if w, x, and y are given. 
// Input Format: Input consists of 3 integers: w, x, and y. w is the number of copies sold, x is 
// the cost per copy and y is the cost the agency spends per copy. 
// Output Format: The output consists of a single integer which corresponds to the profit 
// obtained by the newspaper agency. 
// SAMPLE INPUT: 
// 1000 
// 2 
// 1 
// SAMPLE OUTPUT: 
// 900 

import java.util.Scanner;
public class Program3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of copies sold, cost per copy and cost spent per copy: ");
        int w = s.nextInt();
        int x = s.nextInt();
        int y = s.nextInt();

        int revenue = w * x;
        int cost = (w * y) + 100;
        int profit = revenue - cost;

        System.out.println(profit);
    }
}

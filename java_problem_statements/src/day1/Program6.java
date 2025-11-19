// In the town of Lakeland, the Water Supply Company is working to promote efficient water 
// usage while ensuring fair pricing for its residents. To achieve this, the company has 
// introduced a tiered water tariff system to encourage customers to be mindful of their 
// consumption. The company bills its customers based on the amount of water they use in a 
// month, following this structured tariff: 
// For the first 100 litres of water, customers are charged at a rate of 2 per liter. 
// For any water usage between 101 and 500 litres, the rate is 1.5 per liter. 
// For consumption beyond 500 litres, the rate drops to 1 per liter. 
// Objective: Your task is to develop a billing system that calculates the total water bill for a 
// customer based on their monthly water usage. 
// Input format: The program will prompt the user to input the total number of litres consumed 
// during the month. 
// Output Format: The system should compute the total bill according to the tariff structure 
// and display it in a user-friendly format. 
// Explanation: 
// If a customer uses 550 litres of water in a month, their total bill will be calculated as follows: 
// For the first 100 litres: 2 per litre → *200 
// For the next 400 litres (101 to 500): 1.5 per litre → ₹600 
// For the remaining 50 litres (above 500): 1 per litre 
// → 50 
// Total Bill: 200 + ₹600 + 50 = 850 
// Input: 
// Enter the number of litres consumed: 550 
// Output: 
// Total Water Bill: ₹850.0 

import java.util.Scanner;
public class Program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of litres consumed:");
        int litresConsumed = scanner.nextInt();
        double totalBill = 0.0;

        if (litresConsumed <= 100) {
            totalBill = litresConsumed * 2;
        } else if (litresConsumed <= 500) {
            totalBill = (100 * 2) + ((litresConsumed - 100) * 1.5);
        } else {
            totalBill = (100 * 2) + (400 * 1.5) + ((litresConsumed - 500) * 1);
        }

        System.out.println("Total Water Bill: " + totalBill);
        scanner.close();
    }
}

// An investor wants to decide whether to invest in a stock based on these conditions: 
// If the stock price increased by more than 10% in the last month, the investor will buy the 
// stock. 
// If the stock price stayed within 5-10% of its previous value, the investor will hold the stock. 
// If the stock price dropped by more than 5%, the investor will sell the stock. 
// Write a program that takes the stock's price from a month ago and the current price and 
// determines whether the investor should "Buy," "Hold," or "Sell." 
// Input Format: 
// The stock price a month ago (float). 
// The current stock price (float). 
// Output Format: 
// "Buy," "Hold," or "Sell." 
// Example: 
// Input: 
// Previous Price: 100 
// Current Price: 115 
// Output: 
// Buy 

import java.util.Scanner;
public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the stock price a month ago:");
        float previousPrice = scanner.nextFloat();
        System.out.println("Enter the current stock price:");
        float currentPrice = scanner.nextFloat();
        
        float percentageChange = ((currentPrice - previousPrice) / previousPrice) * 100;
        
        if (percentageChange > 10) {
            System.out.println("Buy");
        } else if (percentageChange >= 5 && percentageChange <= 10) {
            System.out.println("Hold");
        } else if (percentageChange < -5) {
            System.out.println("Sell");
        } else {
            System.out.println("Hold");
        }
        
        scanner.close();
    }
}

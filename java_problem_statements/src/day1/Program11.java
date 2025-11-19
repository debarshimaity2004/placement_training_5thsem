// The IT giant "SoftCompInfo" has decided to transfer its message through the network using a 
// new encryption technique. The company has decided to encrypt the data using the non-prime 
// number concept. The message is in the form of a number and the sum of non-prime digits 
// present in the message is used as the encryption key. 
// Write an algorithm to determine the encryption key. 
// Example 
// Input: 45673 
// Output:10 
// Explanation 
// The non-prime digits are 4 and 6. Hence the output is 4+6 = 10. 

import java.util.Scanner;
public class Program11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the message number: ");
        String message = scanner.nextLine();

        int sumOfNonPrimeDigits = 0;
        for (char ch : message.toCharArray()) {
            int digit = Character.getNumericValue(ch);
            if (isNonPrime(digit)) {
                sumOfNonPrimeDigits += digit;
            }
        }

        System.out.println("Encryption Key: " + sumOfNonPrimeDigits);
        scanner.close();
    }
    private static boolean isNonPrime(int digit) {
        return digit == 0 || digit == 1 || digit == 4 || digit == 6 || digit == 8 || digit == 9;
    }
}

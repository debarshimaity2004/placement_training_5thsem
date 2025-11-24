// In computer science, a set is an abstract data type that can store certain values, without any 
// particular order, and no repeated values(Wikipedia). is an example of a set, but is not a set. 
// Today you will learn how to use sets in java by solving this problem. 
// You are given pairs of strings. Two pairs are identical if and . That also implies it is not same 
// as. After taking each pair as input, you need to print the number of unique pairs you currently 
// have. 
// Input Format 
// In the first line, there will be an integer denoting the number of pairs. Each of the next lines 
// will contain two strings separated by a single space. 
// Constraints: 
// Length of each string is at most and will consist of lower case letters only. 
// Output Format 
// Print lines. In the line, print the number of unique pairs you have after taking a pair as input. 
// Sample Input 
// 5 
// john tom 
// john mary 
// john tom 
// mary anna 
// mary anna 
// Sample Output 
// 3 
// 3 

import java.util.HashSet;
public class collection {
    public static void main(String[] args) {
        HashSet<String> uniquePairs = new HashSet<>();
        String[] inputs = {
            "john tom",
            "john mary",
            "john tom",
            "mary anna",
            "mary anna"
        };

        for (String input : inputs) {
            uniquePairs.add(input);
            System.out.println(uniquePairs.size());
        }
    }
}

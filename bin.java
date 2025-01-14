// public class bin{
// public static void decToBin(int n){
//     int myNUm = n;
//     int pow = 0;
//     int binNum = 0;
//     while (n>0) {
//         int rem = n%2;
//         binNum = binNum+(int)Math.pow(10, pow);
//         pow++;
//         n = n/2;
//     }
//     System.out.println("binary form of"+ myNUm + "="+ binNum);
// }

//     public static void main(String[] args) {
//         decToBin(15);
//     }
// }

import java.util.Scanner;

public class bin {

    // public static void main(String[]args){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter First Number");
    //     double x = sc.nextDouble();
    //     System.out.println("Enter Second Number");
    //     double y = sc.nextDouble();
    //     System.out.println("Enter third Number");
    //     double z = sc.nextDouble();
    //     System.out.println("The avrage number is "+ average(x,y,z)+"\n");
    // }
    // public static double average(double x,double y,double z){
    //     return (x+y+z)/3;
    // }


    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int num;
    //     System.out.println("Eter an integer");
    //     num = sc.nextInt();
    //     if(isEven(num)) {
    //         System.out.println("Number is even");
    //         } else {
    //         System.out.println("Number is odd");
    //     }
    
    // }
    // public static boolean isEven(int number) {
    //     if(number % 2 == 0) {
    //     return true;
    //     }
    //     else {
    //     return false;
    //     }
    //     }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter digit:");
//     int digits = sc.nextInt();
//     System.out.println("The sum is"+sumDigits(digits));
// }
// public static int sumDigits(int n){
//     int SumofDigits = 0;
//     while (n>0) {
//         int lastDigit = n %10;
//         SumofDigits = SumofDigits + lastDigit;
//       n = n/10;
//     }
//     return SumofDigits;
// }



public static void main(String args[]) {
System.out.println("Please Enter a number : ");
Scanner sc = new Scanner(System.in);
int palindrome = sc.nextInt();
if(isPalindrome(palindrome)) {
System.out.println("Number : " + palindrome + " is a palindrome");
} else {
System.out.println("Number : " + palindrome + " is not a palindrome");
}
}
public static boolean isPalindrome(int number) {
int palindrome = number; // copied number into variable
int reverse = 0;
while (palindrome != 0) {
int remainder = palindrome % 10;
reverse = reverse * 10 + remainder;
palindrome = palindrome / 10;
}
// if original and the reverse of number is equal means
// number is palindrome in Java
if (number == reverse) {
    return true;
    }
    return false;
    }
}
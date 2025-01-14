// // import java.util.Scanner;

// // public class Function {
// //     // public static void prinhelloworld(){
// //     //     for(int i=1;i<=3;i++){
// //     //         System.out.println("Hello world");
// //     //     }
       
// //     // }
// // public static int CalculateSum(int a,int b){
   
// //     int sum = a+b;
// //     return sum;

// // }

// // public static void swap(int a,int b){
// //     int temp = a;
// //     a=b;
// //     b=temp;
// //     System.out.println("a ="+a);
// //     System.out.println("b ="+b);
// // }
// //     public static void main(String args[]) {
// //     //     Scanner sc = new Scanner(System.in);
// //     //     int a = sc.nextInt();
// //     //     int b = sc.nextInt();
// //     //     int sum = CalculateSum(a,b);
// //     // System.out.println(sum);
// //     int a =5;
// //     int b = 10;
// //  swap(a,b);
// //     }
// // }

// import java.util.Scanner;

// /**
//  * Function
//  */
// public class Function {

  
//     public static float[] Arthematic_calc(float a,float b){
//       float sum = a+b;
//       float product = a*b;
//       float modulo = a%b;
//       float division = a/b;
//       float subtract = a-b;
//       return new float[]{sum, product, modulo, division, subtract};
//         }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         float a = sc.nextFloat();
//         float b = sc.nextFloat();
//      // Call the method to perform arithmetic calculations
//      float[] results = Arthematic_calc(a, b);
 
//      System.out.println("Sum: " + results[0]);
//      System.out.println("Product: " + results[1]);
//      System.out.println("Modulo: " + results[2]);
//      System.out.println("Division: " + results[3]);
//      System.out.println("Subtract: " + results[4]);
//     }
// }




// factorial
// public class Function {

//     public static int factorial(int n){
//         int f =1;
//         for(int i=1;i<=n;i++){
//    f= f*i;
//         }
//         return f;//factorial of n
//     }
//     public static void main(String args[]){
//      System.out.println(factorial(7));
//     }
// }


// Binomial Coefficent
/**
 * Function
//  */
// public class Function {
//     public static int factorial(int n){
//            int f =1;
//            for(int i=1;i<=n;i++){
//       f= f*i;
//            }
//            return f;//factorial of n
//        }
//        public static int binCoeff(int n,int r){
//         int fact_n = factorial(n);
//         int fact_r = factorial(r);
//         int fact_nmr = factorial(n-r);

//         int binCoeff = fact_n / (fact_r * fact_nmr);
//         return binCoeff;
//        }
//        public static void main(String args[]){
//         System.out.println(binCoeff(5,2));
//        }
//    }

import java.util.Scanner;

/**
 * Function
 */
public class Function {
// For 2 number sum
// alc int sum
    // public static int sum(int a,int b){
    //     return a+b;
    // }
    // For 3 number sum

// public static int sum(int a, int b, int c){
//     return a+b+c;
// }
// public static float sum(float a, float b){
//     return a+b;
// }

//     public static void main(String args[]){
// System.out.println(sum(3,5));
// System.out.println(sum(3.2f,4.8f));

//     }
// prime method check
// public static boolean isPrime(int n){
//     // boolean isPrime = true;
//     for(int i =2;i<=n-1;i++){
//         if(n%i==0){
//            return false;
//         }
//     }
//     return true;
// }

public static boolean isPrime(int n){
    if(n==2){
        return true;
    }
    for(int i=2;i<=Math.sqrt(n);i++){
        
        if(n%i==0){
            return false;

        }
    }
    return true;
}
// public static void main(String args[]){
//     System.out.println(isPrime(16));
// }

// Scanner sc = new Scanner(System.in);

// int n = sc.nextInt();
// for(int i =1;i=n-1;i++){
//    int s= n % i;
// }
// if(s==0){
//     System.out.println("Not prime");
// }else{
//     System.out.println("Prime");
// }
// }



// print all prime numbers 2 to n

//  public static void PrimeRange(int n){
//   for(int i=2;i<=n;i++){
//      if(isPrime(i)){ //true
//     System.out.println(" Prime number is "+ i);
//      }
//   }
//   System.out.println();
//  }

//  public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//     PrimeRange(n);
//  }


public static void binToDec(int binNum){
    int myNum = binNum;
    int pow = 0;
    int decNum =0;
    while (binNum>0) {
        int lastDigit = binNum % 10;
        decNum = decNum + (lastDigit * (int)Math.pow(2,pow));

        pow++;
        binNum = binNum/10;

    }
    System.out.println("decimal of "+ myNum + "="+decNum);

}

public static void main(String[] args) {
    binToDec(1010);
}
}
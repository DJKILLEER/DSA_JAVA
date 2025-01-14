import java.util.Scanner;
public class homework2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        //Q-1
        // int a = sc.nextInt();
        // if(a>0){
        //     System.out.println("Entered number is positive");
        // }
        // else{
        //     System.out.println("Negative");
        // }

//Q-2

    // double temp = sc.nextDouble();
    // if(temp>100){
    //     System.out.println("You have fever");
    // }else{
    //     System.out.println("You dont have an fever");
    // }
    
    
//Q-3
//    System.out.println("Enter in number 1-7");
//            int week = sc.nextInt();
//            switch (week) {
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("wednesday");
//                 break;
//             case 4:
//                 System.out.println("thrusday");
//                 break;
//             case 5:
//                 System.out.println("friday");
//                 break;
//             case 6:
//                 System.out.println("saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
           
//             default:
//             System.out.println("Enter correct keyword");
//                 break;
//            }

//Q-4
System.out.println("Enter a Year");

int year = sc.nextInt();

boolean x = (year%4) == 0;
boolean y = (year%100) != 0;
boolean z = ((year % 100 == 0) && (year % 400 == 0));

if (x && (y || z)) {
    System.out.println(year + " is a leap year");
    } else {
    System.out.println(year + " is not a leap year");
    }
    }
    }
   

// if(year%4==0){
//     System.out.println(" A Leap year");
// }
// else if(year%100==0){
//  System.out.println("NOt a leap year");
// }
//Q-5
//Q-6

    }
}

import java.util.Scanner;

public class condition {
    public static void main(String args[]) {
        // int age =16;
        // if (age>=18) {
        //     System.out.println("Adult:- Drive , college, vote");
        // }
        // if (age>13 && age <18) {
        //     System.out.println("Teenager");
        // }
        // else{
        //     System.out.println("Not Adult");
        // }


    //     // Print largest value of two number
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     // int b = sc.nextInt();
    //     if(a%2==0){
    //         System.out.println("even");
    //     }
    //  else{
    //     System.out.println("number is odd ");
    //  }

    // // income tax calculator
    // System.out.println("Enter your income");
    //         Scanner sc = new Scanner(System.in);
    //         float income = sc.nextFloat();
    //         float tax;
    //         if(income<500000){
    //         System.out.println("You have to pay 0% tax"+income);
    //         }
    //         else if(income>500000 && income<1000000){
    //             System.out.println("You have to pay 20% tax");
    //            tax = (income*0.20f);
    //             System.out.println("tax is"+ tax);

    //         }
    //         else  {
    //             System.out.println("You have to pay 30% tax");
    //      tax =  (income*0.30f);
    //          System.out.println("tax is"+ tax);

    //         }

    //  print largest number of 3 number
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int c = sc.nextInt();

   
    //     if(a>b&&a>c){
    //         System.out.println("a is max");
    //     }
    // else if(b>c){
    //      System.out.println("B is max");
    // }
    // else{
    //     System.out.println("C is max");
    // }
    //  String type = ((5%2)==0)?"even":"odd";
    //  System.out.println(type);


//     Scanner sc = new  Scanner(System.in);
//     System.out.println("Enter your marks");
//     int marks = sc.nextInt();
//    String status = marks>=33?"passed":"Failed";
//    System.out.println(status);

    //     System.out.println("Student is passed");
    // } 
    // else if(marks<33){
    //     System.out.println("Failed");
    // }



    // Switch
    // int numb = 6;
    // switch (numb) {
    //     case 1:
    //     System.out.println("Samosa");
            
    //         break;
    // case 2:
    // System.out.println("Burger");
    // break;
    // case 3:
    // System.out.println("Mango shake");
    // break;
    //     default:
    //     System.out.println("null");
    //         break;
    // }

    // Calculator

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a :");
    int a = sc.nextInt();
    System.out.println("Enter b :");

    int b = sc.nextInt();
    System.out.println("Enter operator :");

    char c = sc.next().charAt(0);
switch (c) {
    case '+':
       System.out.println(a+b);
        break;
    case '-':
       System.out.println(a-b);
        break;
    case '%':
       System.out.println(a%b);
        break;
    case '/':
       System.out.println(a/b);
        break;
    case '*':
       System.out.println(a*b);
        break;

    default:
      System.out.println("Enter right operator");
        break;
}

}
}

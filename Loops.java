import java.util.Scanner;

public class Loops {
    public static void main(String args[]){
    //     int i=0;
        Scanner sc = new Scanner(System.in);
   /*     int n = sc.nextInt();
    while(i<=n){
        System.out.println(i);
        i++;
    }
    int n = sc.nextInt();
    int sum = 0;
    int i =1;
    while (i<=n) {
        sum+=i;
        i++;
    }
    System.out.println(sum);
      for(int i =1;i<=4;i++){
        System.out.print("****\n");
      }
    int line =1;
    while(line<=4){
        System.out.println("****");
        line++;

    int n = 10899;
    
    while(n>0){
int lastDigit = n%10;
System.out.print(lastDigit);
n = n/10;

    }
    System.out.println();
int n =10899;
int rev = 0;
while (n>0) {
    int lastDigit = n%10;
   
    rev = (rev*10)+lastDigit;
    n = n/ 10;
}
System.out.println(rev);
int counter = 1;
do{
    System.out.println(counter);
    counter++;
}while(counter<=10);

do{
    System.out.println("Enter your number");
    int n = sc.nextInt();
    if(n%10==0){
        break;  
}
System.out.println(n);
}while(true);

for(int i =1;i<=5;i++){
    if(i==3)
      continue;
      System.out.println(i);
}
do{
    System.out.println("Enter your number");
    int n = sc.nextInt();
    if(n%10==0){
        continue;
    }
    System.out.println(n);
}while(true);

*/
int n = sc.nextInt();
if(n==2){
    System.out.println("n is prime");
}else{
    boolean isPrime = true;
    for(int i =2;i<=Math.sqrt(n);i++) {
        if(n%i==0){
            isPrime = false;
        }
    }
    if(isPrime==true){
        System.out.println(n+" is prime");
    } else{
        System.out.println(n+" is not prime");
    }
}

    }
   
}

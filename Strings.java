// import java.util.Scanner;

// public class Strings {
//     public static void printchar(String str){
//         for(int i=0;i<str.length();i++){
//             System.out.print(str.charAt(i)+ " ");
//         }
//         System.out.println();
//     }
    
//     public static boolean ispalidrome(String str) {
//         for(int i=0;i<str.length()/2;i++){
//             int n = str.length();
//             if(str.charAt(i) != str.charAt(n-1-i)){
//             //    not a palindrome
//             return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//       String str = "noon";
//       System.out.println(ispalidrome(str));


//     }
// }




// Aim 85

public class Strings{

public static float getShortestPath(String path){
    int x =0,y=0;

    for(int i=0;i<path.length();i++){
        char dir = path.charAt(i);
        // south
        if(dir=='S'){
            y--;
        }
        // North
        else if(dir=='N'){
             y++;
        }
        // West
        else if(dir=='W'){
            x--;
        }
        // East
        else {
            x++;
        }
    }
    int x2 = x*x;
    int y2 = y*y;
    return (float)Math.sqrt(x2+y2);
}


public static String toUpperCase(String str){
    StringBuilder sb = new StringBuilder("");
    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);

    for(int i=1;i<str.length();i++){
        if(str.charAt(i)== ' '&& i<str.length()-1){
            sb.append(str.charAt(i));
            i++;
             sb.append(Character.toUpperCase(str.charAt(i)));
        }else{
            sb.append(str.charAt(i));
        }
    }
    return sb.toString();
}

public static String compress(String str){
    String newStr = "";

    for(int i=0;i<str.length();i++){
        Integer count = 1;
        while (i<str.length()-1 && str.charAt(i)== str.charAt(i+1)) {
            count++;
            i++;
        }
        newStr += str.charAt(i);
        if(count>1){
            newStr += count.toString();
        }
    }
    return newStr;
}

public static void main(String[] args) {
    // String str = "WNEENESENNN";
    //  System.out.println(getShortestPath(str));
    // String str = "Helloworld";
    // System.out.println(str.substring(0,5));
    // String fruits[] = {"apple","mango","banana"};

    // String largest = fruits[0];
    // for(int i=1;i<fruits.length;i++){
    //     if(largest.compareTo(fruits[i])<0){
    //           largest = fruits[i];
    //     }
    // }
    // System.out.println(largest);

    // String str = "hi, i am elon musk";
    // System.out.println(toUpperCase(str));
    String str = "aaabbcccdd";
    System.out.println(compress(str));
   }
}
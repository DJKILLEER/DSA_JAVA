// public class Pattern3 {
//     public static void hollow_rectangele(int totalrow,int totalcolum){
//         // Outer loo
// public class Patteps
//         for(int i=1;i<=totalrow;i++){
//         //    Inner loop
//         for(int j=1;j<=totalcolum;j++){
//             // Cell - (i,j)
//             if(i==1||i==totalrow || j==1 || j == totalcolum){
//                 // Boundary cells
//                 System.out.print("*");
//             }
//             else{
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
//            }
//     }
//     public static void main(String[] args) {
//        hollow_rectangele(10,7 );
//     }

// }
// {
//    public static void pyramid(int n){
//     for(int i =1;i<=n;i++){
//         // Spaces
//         for(int j=1;j<=n-i;j++){
//           System.out.print(" ");
//           }
//         //   stars
//           for(int j =1;j<=i;j++ ){
//     System.out.print("*");
//           }
//           System.err.println();
//         }

//     }
//     public static void main(String[] args) {
//         pyramid(400);
//     }
// }

// public class attern3{

//     public static void Floyid(int n){

//         int counter =1;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=i;j++){
//       System.out.print(counter+" ");
//       counter++;
//         }
//         System.out.println();
//     }

//     }
// public static void main(String[] args) {
//     Floyid(5);
// }

// }
// public class attern3 {

//     public static void Tri(int n){
// for(int i =1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//          if((i+j)%2==0){
//             // even
//             System.out.print("1");
//          }else{
//             System.out.print("0");
//          }

//     }
//     System.out.println();
// }
//     }
//     public static void main(String args[]) {
//         Tri(5);
//     }
// }

// public class attern3 {
//     public static void bUtterfly(int n){
//         // list half
//         for(int i = 1; i<=n;i++){
//             // stars =i
//            for(int j=1;j<=i;j++){
//          System.out.print("*");
//            }
//         //    Spaces = 2*(n-i)
//         for(int j=1;j<=2*(n-i);j++){
//             System.out.print(" ");
//         }
//         // starts = i
//         for(int j=1;j<=i;j++ ){
//             System.out.print("*");
//         }
//         System.out.println();
//         }
//         // 2nd half
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//                   }
//                //    Spaces = 2*(n-i)
//                for(int j=1;j<=2*(n-i);j++){
//                    System.out.print(" ");
//                }
//                // starts = i
//                for(int j=1;j<=i;j++ ){
//                    System.out.print("*");
//                }
//                System.out.println();
//         }
//     }
//        public static void main(String args[]) {
//     bUtterfly(8);
//      }
//      }

public class attern3 {
    public static void solid_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // hollow rectangle
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void Numb_pyra(int n) {

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Number
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
    }




   public static void Palindromic(int n){
    for(int i=1;i<=n;i++){
  for(int j=1;j<=(n-1);j++){
    System.out.print(" ");
  }
//   desending
for(int j=i;j>=1;i--){
    System.out.print(j);
}
// assending
for(int j=2;j<=i;j++){
    System.out.print(j);
}
System.out.println();
    }
   }



   
    public static void main(String args[]) {
        // solid_rhombus(9);
        // hollow_rhombus(10);
        // diamond(3);
        Numb_pyra(5);
        // Palindromic(5);
    }
}
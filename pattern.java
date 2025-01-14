public class pattern {
//     // star pattern
//     public static void main(String args[]) {
        
//                 for(int row=0;row<5;row++){
//                     for(int colum=0;colum<=row;colum++){
//                         System.out.print("*");
                       
//                     }
//                     System.out.println();
//                 }
//             }
//         }
        // inverted star pattern 
// public class pattern {
//     public static void main(String args[]) {
//                 for(int row=0;row<5;row++){
//                     for(int colum=row;colum<5;colum++){
//                         System.out.print("*");
//                     }
//                     System.out.println();
//                 }
//             }
//         }

// // half pyramid pattern
public class pattern {
    public static void main(String args[]) {
                for(int row=1;row<=4;row++){
                    for(int colum=1;colum<=row;colum++){
                        System.out.print(colum);
                    }
                    System.out.println();
                }
            }
        }




// charcter pattern
// public class pattern {
//     public static void main(String args[]) {
//         char ch = 'A';
//                 for(int row=1;row<=4;row++){
//                     for(int colum=1;colum<=row;colum++){
//                         System.out.print(ch);
//                         ch++;
//                     }
//                     System.out.println();
//                 }
//             }
//         }

    //Print Hollow rectangle pattern
// public class pattern {
    // public static void main(String args[]) {
                // for(int row=1;row<=4;row++){
                //     for(int colum=1;colum<=5;colum++){
                //         if(row==1||row==4||colum==1||colum==5){
                //         System.out.print("*");
                //         }else{
                //             System.out.print(" ");
                //         }

                //     }
                //     System.out.println();
                // }
                
        //     }
        // }





// // inverted & rotated half-pyramid
// public class pattern {
//     public static void main(String args[]) {
                // for(int row=1;row<=4;row++){
                //     for(int space=1;space<=4-row;space++){
                //         System.out.print(" ");
                //     }
                //     for(int colum=1;colum<=row;colum++){
                //         System.out.print("*");
                //     }
                
                //     System.out.println();
                // }
    // }
    //     }

// inverted half pyamid with number
// public class pattern {
//     public static void main(String args[]) {
          
//                 for(int row=1;row<=5;row++){
//                     //you can also use 5-row+1 on 6-row 
//                     for(int colum=1;colum<=6-row;colum++){
//                         System.out.print(colum);
                    
//                     }
//                     System.out.println();
//                 }
//             }
//         }

// //   FLOYD Triangle
// public class pattern {
//     public static void main(String args[]) {
//           int n = 1;
//                 for(int row=1;row<=5;row++){
//                     for(int colum=1;colum<=row;colum++){                        
//                             System.out.print(n+" ");
//                             n++;
//                         }                        
//                         System.out.println();
//                     }                   
//                 }
//             }
// //  0-1 triangle
// public class pattern {
//     public static void main(String args[]) {
         
//                 for(int row=1;row<=5;row++){
//                     for(int colum=1;colum<=row;colum++){
//                         if((row+colum)%2==0){
//                             System.out.print("1");
//                         }  else{                    
//                             System.out.print("0");
//                         }
//                         }                        
//                         System.out.println();
//                     }                   
//                 }
//             }




//  butterfly pattern
// public class pattern {
//     public static void butterfly(int n){
//         for(int row=1;row<=n;row++){
//            for(int col=1;col<=row;col++){
//           System.out.print("*");
//            }
//            for(int space=1;space<=2*(n-row);space++){
//               System.out.print(" ");
//            }
//            for(int col2=1;col2<=row;col2++){
//             System.out.print("*");
//            }
//            System.out.println();
//         }

//         // 2half
//         for(int row=n;row>=1;row--){
//             for(int col=1;col<=row;col++){
//                 System.out.print("*");
//                  }
//                  for(int space=1;space<=2*(n-row);space++){
//                     System.out.print(" ");
//                  }
//                  for(int col2=1;col2<=row;col2++){
//                   System.out.print("*");
//                  }
//                  System.out.println();

//         }
//     }
//     public static void main(String args[]) {
//          butterfly(4);
//             }
// }
        

//Solid Rhombus
// public class pattern {

//     public static void main(String[] args) {
//         for(int row=1;row<=5;row++){
//             for(int space=1;space<=(5-row);space++){
//               System.out.print(" ");
//             }
//             for(int col=1;col<=5;col++){
//               System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//Hollow rhombus

// public class pattern {

//     public static void main(String[] args) {
//         for(int row=1;row<=5;row++){
//               for(int sp=1;sp<=(5-row);sp++){
//                 System.out.print(" ");
//               }
//             for(int col=1;col<=5;col++){
//                 if (row==5||row==1||col==1||col==5) {
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
                
//             }
//             System.out.println();
//         }
//     }
    
// }
  


//diamond pattern
// public class pattern {

//     public static void main(String[] args) {
//         for(int row=1;row<=4;row++){
//             for(int sp=1;sp<=(4-row);sp++){
//                 System.out.print(" ");
//             }
//             for(int col=1;col<=(2*row)-1;col++){
//                 System.out.print("*");

//             }
//             System.out.println();
//         }
//         for(int row=4;row>=1;row--){
//             for(int sp=1;sp<=(4-row);sp++){
//                 System.out.print(" ");
//             }
//             for(int col=1;col<=(2*row)-1;col++){
//                 System.out.print("*");

//             }
//             System.out.println();
//         }
//     }
// }


// // Number Pyramid
// public class pattern {
//     public static void main(String[] args) {
      

//         for(int row=1;row<=5;row++){
//             for(int sp=1;sp<=(5-row);sp++){
//                 System.out.print(" ");
//             }
//             for(int col=1;col<=row;col++){
//               System.out.print(row+" ");
//             }
            
//             System.out.println();
            
//         }
        
//     }
// }

// // PALINDROMIC Pattern with Numbers
// public class pattern {

//     public static void main(String[] args) {
        // for(int row=1;row<=5;row++){
            
        //     for(int sp=1;sp<=(5-row);sp++){
        //         System.out.print(" ");
        //     }
           
        //     for(int col=row;col>=1;col-- ){
        //         System.out.print(col);
        //     }
        //     for(int col=2;col<=row;col++){

        //         System.out.print(col);
        //     }
        //     System.out.println();
        // }
// }
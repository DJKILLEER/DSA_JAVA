public class Bit{

         public static void oddorEven(int n){
                int bitmask = 1;
                if((n&bitmask)==0){
                    System.out.println("Number even");
                }else{
                    System.out.println("odd");
                }
         }
         public static int getithBit(int n,int i){
                int bitmask = 1<<i;
                if((n&bitmask)==0){
                    return 0;
                }else{
                    return 1;
                }
         }
         
         public static int setithBit(int n,int i){
                int bitmask = 1<<i;
               return n|bitmask;
         }
         public static int clearithBit(int n,int i){
                int bitmask = ~(1<<i);
               return n&bitmask;
         }


         public static int updateIthBit(int n,int i,int newBit){
            // if(newBit == 0){
            //     return clearithBit(n, i);
            // }else{
            //     return setithBit(n, i);
            // }

             n = clearithBit(n, i);
            int bitmask = newBit<<i;
            return n | bitmask;
         }

          public static int cleariBit(int n,int i){
                int bitmask = (~0)<<i;
               return n&bitmask;
         }
          public static int cleariBitInRange(int n,int i,int j){
            int a = ((~0)<<(j+1));
            int b = (1<<i)-1;

                int bitmask = a | b;
               return n&bitmask;
         }
         public static boolean PowerofTwo(int n){
            return (n&(n-1))==0;
         }

         public static int countSetBits(int n){
            int count = 0;
            while(n>0){
                if((n&1)!=0){
                    // check our lsb
                    count++;
                }
                n = n>>1;
            }
            return count;
         }

         public static int FastExpo(int a,int n){
            int ans =1;

            while(n>0){
                if((n&1)!=0){
                    // check Lsb
                    ans = ans * a;
                }
                a = a*a;
                n = n>>1;
            }
            return ans;
         }
    public static void main(String[] args) {
        // oddorEven(9);
        // oddorEven(3);
        // oddorEven(11);
        // oddorEven(14);
        // System.out.println(cleariBitInRange(10, 2,4));
        //  System.out.println(PowerofTwo(8));
        //  System.out.println(PowerofTwo(15));
        // System.out.println(countSetBits(10));
        // System.out.println(FastExpo(3, 5));
        int x=3,y=4;

        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("x = "+ x + "y= "+ y);
    }
}
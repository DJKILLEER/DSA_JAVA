
public class Recursion {

    public static void printDec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void printInc(int n){
        if(n==1){
            System.out.print(n+ " ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");

    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
          return fn;
    }

    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int sn = sum(n-1);
        int sum = n + sum(n-1);
        return sum;
    }
    public static int fibn(int n){
        if(n==1 || n ==0){
            return n;
        }
         int fn= fibn(n-1)+fibn(n-2);
         return fn;
    }

    public static boolean isSorted(int arr[],int i){
        if(i== arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static int firstOccurence(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
      return firstOccurence(arr, key, i+1);
    }
    public static int lastOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
      int isFound = lastOccurence(arr, key, i+1);
      if(isFound == -1 && arr[i]==key){
        return i;
      }
        return isFound;

    }
   

    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }
    public static int optimizepower(int a,int n){
        if(n==0){
            return 1;
        }
        int halfpower = optimizepower(a, n/2);
       int halfpowersq = halfpower * halfpower;
        // n is odd
        if(n%2!=0){
            halfpowersq = a * halfpowersq;
        }
        return halfpowersq;
    }
    public static int tillingProblem(int n){
        // 2 X n (floor size)
        // base case
        if(n == 0 || n==1){
            return 1;
        }
        // vertical choice
        int fnm1 = tillingProblem(n-1);
        // horizonatal choice
        int fnm2 = tillingProblem(n-2);

        int totways = fnm1 + fnm2;
        return totways;
    }
    public static void removedublicate(String str,int idx,StringBuilder newStr,boolean[] map){
      if(idx == str.length()){
        System.out.println(newStr);
        return;
      }
      char currChar = str.charAt(idx);
      if(map[currChar-'a'] == true){
        // dublicate
        removedublicate(str, idx+1, newStr, map);
      } else{
        map[currChar-'a'] = true;
        removedublicate(str, idx+1, newStr.append(currChar), map);
      }
    }

    public static int pairing(int n){
    if(n==1||n==2){
        return n;
    }
    // choice
    // single
    //   int fnm1 = pairing(n-1);
    // //   pair
    //  int fnm2 = pairing(n-2);
    //  int pairways = (n-1) *fnm2;
    // //  tot ways
    // int totalways = fnm1 * pairways;
    // return totalways; 

    return pairing(n-1)*(n-1)*pairing(n-2);
    }
    public static void binaryString(int n,int lastplace,String str){
        if(n==0){
           System.out.println(str);
           return;
        }
     
        binaryString(n-1,0, str+("0") );
       if(lastplace==0){
        binaryString(n-1,1, str+("1") );

       }
        

    }
    public static void main(String[] args) {
       binaryString(3, 0,"");

    }
}




        //  int n = 26;
        // //  printInc(n);
        // //  printDec(n);
        // System.out.println(fibn(n));
        // int arr[] = {8,3,6,9,5,10,2,5,3};
        // System.out.println(optimizepower(2, 10));
         // String str = "appnnacollege";
        //  removedublicate(str, 0,new StringBuilder(""),new boolean[26]);
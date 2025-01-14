import java.util.ArrayList;
import java.util.Collections;

public class ArrList {

    // public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
    //     int temp = list.get(idx1);
    //     list.set(idx1, list.get(idx2));
    //     list.set(idx2, temp);
    // }
    //O(n2)
//    public static int storewater(ArrayList<Integer> list){
//     int maxwater = 0;
//     //brute force
//     for(int i=0;i<list.size();i++){
//         for (int j=i+1;j<list.size();j++){
//             int ht = Math.min(list.get(i),list.get(j));
//             int width = j-i;
//             int currwater = ht*width;
//             maxwater = Math.max(maxwater,currwater);
//         }
//     }
//     return maxwater;
//    }
// public static int storewater(ArrayList<Integer> list){
//     int maxwater = 0;
//     int lp = 0;
//     int rp = list.size()-1;

//     while(lp<rp){
//         // calculate water area
//        int ht = Math.min(list.get(lp),list.get(rp));
//        int width = rp-lp;
//        int currwater = ht*width;
//        maxwater = Math.max(maxwater,currwater);

//         // update pointer
//         // if(list.get(lp)<list.get(rp)){
//         //     lp++;
//         // }else{
//         //     rp--;
//         // }
//          int x = list.get(lp)<list.get(rp) ? lp++ : rp--;
//     }
//     return maxwater;
// }

// public static boolean pairSum(ArrayList<Integer> list,int target){
//      int lp = 0;
//      int rp = list.size()-1;
//      while(lp!=rp){
//         // Case 1
//         if(list.get(lp)+list.get(rp)==target){
//             return true;
//         }
//         if(list.get(lp)+list.get(rp)<target){
//             lp++;
//         }else{
//             rp--;
//         }

//      }
//      return false;

// }

public static boolean pairSum(ArrayList<Integer> list,int target){
           int bp = -1;
           int n = list.size();
           for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                //breaking point
                bp =i;
                break;
            }
           }
        int lp = bp+1;//smallest 
        int rp = bp;//largest

        while(lp!=rp){
            //case 1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            //case 2
            if(list.get(lp)+list.get(rp)<target){
                lp = (lp+1)%n;
            }else{
                //case 3
                rp = (n+rp-1) % n;
            }
        }
        return false;
}
    public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(11);
            list.add(15);
            list.add(6);
            list.add(8);
            list.add(9);
            list.add(10);
         int target = 16;
            System.out.println(pairSum(list, target));
    }
}
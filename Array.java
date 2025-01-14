// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.HashSet;
// import java.util.LinkedHashSet;
import java.util.*;

public class Array {
    // public static void update(int marks[]) {
    //     for(int i=0;i<marks.length;i++){
    //         marks[i] = marks[i] +1;
    //     }
    // }
    // public static void main(String[] args) {
    //     int marks[] = {97,98,99};
    //     update(marks);

    // //   print our marks
    // for(int i=0;i<marks.length;i++){
    //     System.out.println(marks[i]+" ");
    // }
    // System.out.println();
    // }

// Todays Learning
// Linear search=> eg canteen menu searching for our need food

// public static int linearSearch(int numbers[],int key){
//     for(int i=0;i<numbers.length;i++){
//         if(numbers[i]==key){
//             return i;
//         }
//     }
//     return -1;
// }
// public static void main(String[] args) {
//     int numbers[] = {2,4,6,8,10,12,14,16};
//     // String menu[] = {"dosa","samosa","frooti","icecream","mango"};
//     int key =10;
//     int index = linearSearch(numbers, key);
//     if(index == -1){
//         System.out.println("Not found");
//     }else{
//     System.out.println("Key is at index:" + index);
//     }
// }

// }



// Largest Number

// public static int GetLargest(int numbers[]){
//     int Largest = Integer.MIN_VALUE; //infinity
//     int smallest = Integer.MAX_VALUE;
//     for(int i=0;i<numbers.length;i++){
//         if(Largest <numbers[i]){
//             Largest = numbers[i];
//         }
//         if(smallest>numbers[i]){
//             smallest=numbers[i];
//         }
//     }
//     System.out.println("smallest value is "+ smallest);
//     return Largest;

// }
// public static void main(String[] args) {
//     int numbers[] = {1,2,6,3,5};
//     System.out.println("Largest value is"+ GetLargest(numbers));
// }




// // Binary Search code
// public static int binarysearch(int numbers[],int key){
// int start = 0, end = numbers.length-1;
// while (start<= end) {
//     int mid = (start + end) /2;
//     // comprisons
//     if(numbers[mid]== key){
//         // found
//         return mid;
//     }
//     if(numbers[mid]<key){
//         // right
//         start = mid +1;
//     }else{
//         // left
//         end = mid -1;
//     }

// }
// return -1;
// }
// public static void main(String[] args) {
//     int numbers[] = {2,4,6,8,10,12};
//     int key = 4;

//     System.out.println("index for key is:" + binarysearch(numbers, key));
// }




// Reverse an array
// public static void reverse(int numbers[]){
//     int first = 0,last = numbers.length-1;
   
//     while (first<last) {
//         int temp = numbers[last];
//         numbers[last] = numbers[first];
//         numbers[first] = temp;

//         first++;
//         last--;
//     }
// }
// public static void main(String[] args) {
//     int numbers[] = {2,4,6,8,10};
//       reverse(numbers);
//     //   print
//       for(int i=0;i<numbers.length;i++){
//         System.out.print(numbers[i]+ " ");
//       }
//       System.out.println();
// }



// Pairs in array

// public static void printPairs(int numbers[]){
//   int  tp=0;
// for(int i=0;i<numbers.length;i++){
//     int curr = numbers[i];
//     for(int j=i+1;j<numbers.length;j++){
//          System.out.print("("+curr+","+numbers[j]+")");
//          tp++;
//     }
//     System.out.println();
// }
// System.out.println("Total pairs ="+tp);

// }
// public static void main(String[] args) {
//     int numbers[] = {2,4,6,8,10};
//     printPairs(numbers);
// }



// // Print Sub-Array
// public static void printSubarray(int numbers[]){
//     int ts=0;
//     for(int i=0;i<numbers.length;i++){
//         int start = i;
//         for(int j=i;j<numbers.length;j++){
//          int end = j;
//          for(int k=start;k<=end;k++){
//             System.out.print(numbers[k]+" ");
//          }
//          ts++;
//          System.out.println();
//         }
//         System.out.println();
//     }
//     System.out.println("total subarray = "+ts);
// }

// public static void main(String[] args) {
//     int numbers[] = {2,4,6,8,10};
//     printSubarray(numbers);
// }

// Max subarray Sum I

// public static void MaxSubArraySum(int numbers[]){
//     int currSum=0;
//     int maxSum = Integer.MIN_VALUE;
//         for(int i=0;i<numbers.length;i++){
//             int start = i;
//             for(int j=i;j<numbers.length;j++){
//              int end = j;
//              currSum =0;
//              for(int k=start;k<=end;k++){
//                currSum += numbers[k];
//              }
//              System.out.println(currSum);
//              if(maxSum<currSum){
//                 maxSum = currSum;
//              }
             
//             }
//         }
//         System.out.println("Max sum = "+maxSum);
// }
// public static void main(String[] args) {
//     int numbers[] = {1,-2,6,-1,3};
//     MaxSubArraySum(numbers);
// }


// Max subarray Sum II
// public static void MaxSubArraySumII(int numbers[]){
//     int currSum=0;
//     int prefix[] = new int[numbers.length];
//     prefix[0] =numbers[0];
//     // calculate prefix array
//     for(int i=1;i<prefix.length;i++){
//       prefix[i] = prefix[i-1] + numbers[i];
//     }
//     int maxSum = Integer.MIN_VALUE;
//         for(int i=0;i<numbers.length;i++){
//             int start = i;
//             for(int j=i;j<numbers.length;j++){
//              int end = j;
//              currSum = start==0? prefix[end]: prefix[end] - prefix[start-1];
             
//              if(maxSum<currSum){
//                 maxSum = currSum;
//              }
             
//             }
//         }
//         System.out.println("Max sum = "+maxSum);
// }
// public static void main(String[] args) {
//     int numbers[]={1,-2,6,-1,3};
//     MaxSubArraySumII(numbers);
// }



// // Max subarray Sum III by Kadenes algorithm optimised code

// public static void MaxSubarraySumIII(int numbers[]){
//           int mx = Integer.MIN_VALUE;
//           int cs = 0;
//           for(int i=0;i<numbers.length;i++){
//             cs = cs + numbers[i];
//             if(cs<0){
//                 cs =0;
//             }
//             mx= Math.max(cs,mx);
//           }
//           System.out.println("Our max subarray sum is "+ mx);

// }

// public static void main(String[] args) {
//     int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
//     MaxSubarraySumIII(numbers);
// }

// DSA sheet Trapping Rainwater Q-22
// public static int trappedRainwater(int height[]){
//     int n = height.length;
// // calculate left max boundry - array
// int leftMax[] = new int[n];
// leftMax[0] = height[0];
// for(int i=1;i<n;i++){
//   leftMax[i] = Math.max(height[i], leftMax[i-1]);
// }
// // Calculate right max boundry - array
// int rightMax[] = new int[n];
// rightMax[n-1] = height[n-1];
// for(int i=n-2;i>=0;i--){
//     rightMax[i] = Math.max(height[i],rightMax[i+1]);
// }
// int trappedWater =0;
// // loop
// for(int i=0;i<n;i++){
//     // waterlevel = min(leftmax boundry ,rightmax boundry)
//    int waterlevel = Math.min(leftMax[i],rightMax[i]);
//    // trapped water = waterlevel - height[i]
//    trappedWater += waterlevel-height[i];
// }
// return trappedWater;
// }
// public static void main(String args[]) {
//     int height[] = {4,2,0,6,3,2,5};
//    System.out.println(trappedRainwater(height));
// }


// stocks buy sell
// public static int buyAndSellStocks(int prices[]){
//     int buy_price = Integer.MAX_VALUE;
//     int maxProfit = 0;

//     for(int i=0;i<prices.length;i++){
//         if(buy_price<prices[i]){
//             // profit
//             int profit = prices[i] - buy_price; // Todays profit
//             maxProfit = Math.max(maxProfit,profit);
//         } else{
//           buy_price = prices[i];
//         }
//     }
//     return maxProfit;
// }

// public static void main(String[] args) {
//     int prices[] = {7,1,5,3,6,4};
//   System.out.println(buyAndSellStocks(prices));
// }

//     public static boolean containsDuplicate(int[] nums) {
//         for(int i=0;i<nums.length-1;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         int nums[] = {1,2,3,4};
//        System.out.println(containsDuplicate(nums));
//     }
// }




// public static boolean containsDuplicate(int[] nums){
//     HashSet<Integer>set=new HashSet<>();
//     for(int i=0;i<nums.length;i++){
//         if(set.contains(nums[i])){
//             return true;
//         }else{
//             set.add(nums[i]);
//         }
//     }

// return false;
// }

// public static void main(String args[]){
//     int nums[] = {1,2,3,4};
//    System.out.println(containsDuplicate(nums));
// }
// Roated arrays

// public static int search(int[] nums, int target){
//     // min have index of minimum element of nums
//     int min = minSearch(nums);
//     // find in sorted left
//     if(nums[min]<=target&&target<= nums[nums.length-1]){
//        return search(nums, min,nums.length-1,target);
//     }
//     // find in sorted right 
//     else{
//         return search(nums,0,min, target);
//     }
// }
// // binary search to find target in left to right boundry
// public static int search(int[] nums,int left,int right,int target){
//     int l = left;
//     int r = right;
//     // System.out.println(left+" "+ right);
//     while(l<=r){
//         int mid = l + (r - l) / 2;
//         if(nums[mid]==target){
//             return mid;
//         }
//         else if(nums[mid]>target){
//             r = mid-1;
//         }
//         else{
//             l = mid+1;
//         }

//     }
//     return -1;
// }

// // smallest element index
// public static int minSearch(int[] nums){
//     int left = 0;
//     int right = nums.length-1;
//     while (left<right) {
//         int mid = left + (right - left)/2;
//         if(mid>0 && nums[mid-1]> nums[mid]){
//             return mid;
//         }else if(nums[left]<=nums[mid]&&nums[mid]>nums[right]){
//             left = mid+1;
//         }
//         else{
//             right = mid-1;
//         }
//     }
//     return left;
// }

// public static void main(String[] args) {
//     int nums[] = {4,5,6,7,0,1,2};
//     int target = 0;
//     System.out.println(search(nums,target));
// }
// }


// BEST TIME TO BUY AND SELL STOCKS
// public static int maxProfit(int[] prices){
//     int buy = prices[0];
//     int profit = 0;
//     for(int i=1;i<prices.length;i++){
//         if(buy < prices[i]){
//             profit = Math.max(prices[i]-buy,profit);

//         }
//         else{
//             buy = prices[i];
//         }

//     }
//     return profit;
// }

// public static void main(String[] args) {
//     int prices[] = {7,1,5,3,6,4};
//      System.out.println(maxProfit(prices));
// }




// 42. Trapping Rain Water

//     public static int trap(int[] height) {
//         int n = height.length;
//         int res = 0,l=0,r=n-1;
//         int rMax = height[r], lMax=height[l];
//         while(l<r){
//             if(lMax<rMax){
//                 l++;
//                 lMax = Math.max(lMax,height[l]);
//                 res += lMax - height[l];
//             }else{
//                 r--;
//                 rMax = Math.max(rMax,height[r]);
//                 res += rMax - height[r];
//             }
//         }
//         return res;
//     }
//     public static void main(String[] args){
//         int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
//         System.out.println(trap(height));
//   }








// 15. 3Sum

    public static List<List<Integer>> threeSum(int nums[]) {
        List<List<Integer>>result = new ArrayList <List<Integer>> ();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
               for(int k=j+1;k<nums.length;k++){
                if(nums[i] + nums[j] + nums[k] == 0){
                    List<Integer>triplet = new ArrayList < Integer > ();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    Collections.sort(triplet);
                    result.add(triplet);
                }
               }
            }
        }
        result = new ArrayList<List<Integer>> (new LinkedHashSet<List<Integer>>(result));
        return result;
    }
    public static void main(String args[]){
        int nums[] = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}

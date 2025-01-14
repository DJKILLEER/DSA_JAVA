import java.util.Stack;
public class StackB {
// public class StackB {
  // public static void pushAtbottom(Stack<Integer> s, int data) {
  // if (s.isEmpty()) {
  // s.push(data);
  // return;
  // }
  // int top = s.pop();
  // pushAtbottom(s, data);
  // s.push(top);
  // }

  // public static String reverseString(String str){
  // Stack<Character> s = new Stack<>();
  // int idx = 0;
  // while (idx<str.length()) {
  // s.push(str.charAt(idx));
  // idx++;
  // }
  // StringBuilder result = new StringBuilder("");
  // while (!s.isEmpty()) {
  // char curr = s.pop();
  // result.append(curr);
  // }
  // return result.toString();
  // }

  // public static void reverseStack(Stack<Integer> s){
  // if(s.isEmpty()){
  // return;

  // }
  // int top = s.pop();
  // reverseStack(s);
  // pushAtbottom(s, top);
  // }
  // public static void printStack(Stack<Integer> s){
  // while (!s.isEmpty()) {
  // System.out.println(s.pop());
  // }
  // }
 

// public static void stockSpan(int stocks[],int span[]) {
//  Stack<Integer> s = new Stack<>();
//  span[0] =1;
//  s.push(0);
//  for(int i=1;i<stocks.length;i++){
//   int currPrice = stocks[i];
//   while (!s.isEmpty() && currPrice>stocks[s.peek()]) {
//     s.pop();
//   }
//   if(s.isEmpty()){
//     span[i] = i+1;

//   }else{
//     int prevHigh = s.peek();
//     span[i] = i-prevHigh;
//   }
//   s.push(i);
//  }
  
//  }
// public static boolean isValid(String str){
//   Stack<Character> s = new Stack<>();
//   for(int i=0;i<str.length();i++){
//     char ch = str.charAt(i);
//     //opening
//     if(ch == '(' || ch == '{' || ch == '['){
//            s.push(ch);
//     }else{
//       // closing
//       if (s.isEmpty()) {
//         return false;
//       }
//       if((s.peek() =='(' && ch==')') 
//       || (s.peek()=='{'  && ch=='}') 
//       || (s.peek()=='['  && ch==']') ){
//          s.pop();
//       }else{
//         return false;
//       }
//     }

//   }
//   if(s.isEmpty()){
//     return true;
//   }else{
//     return false;
//   }
// }

// public static boolean isDulicate(String str){
//   Stack<Character> s = new Stack<>();
//   for(int i =0; i<str.length();i++){
//     char ch = str.charAt(i);
//     //closing
//     if(ch==')'){
//       int count = 0;
//       while (s.peek() != '(') {
//         s.pop();
//         count++;
//       }
//       if(count<1){
//         return true; //duplicate
//       }else{
//         s.pop(); //opeing pair
//       }
//     }else{
//        //opeing,oprator,oprand
//        s.push(ch);
//     }
    
//   }
//   return false;
// }


public static void maxArea(int arr[]){
  int maxArea = 0;
  int nsr[] = new int[arr.length];
  int nsl[] = new int[arr.length];
  // nsr next smaller right
  Stack<Integer> s = new Stack<>();

  for(int i=arr.length-1;i>=0;i--){
    while (!s.isEmpty() && arr[s.peek()]>=arr[i]) {
      s.pop();
    }
    if(s.isEmpty()){
      nsr[i] = arr.length;
    }else{
      nsr[i] = s.peek();
    }
    s.push(i);
  }


  // nsl next smaller left
  s = new Stack<>();

  for(int i=0;i<arr.length;i++){
    while (!s.isEmpty() && arr[s.peek()]>=arr[i]) {
      s.pop();
    }
    if(s.isEmpty()){
      nsl[i] =-1;
    }else{
      nsl[i] = s.peek();
    }
    s.push(i);
  }
  // current area: width = j-i-1 = nsr[i]-nsl[i]-1
  for(int i=0;i<arr.length;i++){
    int height = arr[i];
    int width = nsr[i] - nsl[i] - 1;
    int currArea = height * width;
     maxArea = Math.max(currArea, maxArea);
  }
   System.out.println("Max area in histogram : "+ maxArea);
}
  public static void main(String args[]) {
  int arr[] = {2,1,5,6,2,3}; //heights
  maxArea(arr);
}
}

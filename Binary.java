// import Binary.Node.BinaryTree;
// import java.util.*;
// import java.util.LinkedList;

// public class Binary {
// public static class  Node {
//  int data;
//  Node left;
//  Node right;

//  Node(int data){
//     this.data = data;
//     this.left = null;
//     this.right = null;
//  }
// }
//  static class  BinaryTree {
//     static int idx = -1;
// public static Node buildTree(int nodes[]){
//   idx++;
//   if(nodes[idx]==-1){
//     return null;
//   }
//   Node newNode = new Node(nodes[idx]);
//   newNode.left = buildTree(nodes);
//   newNode.right = buildTree(nodes);

//   return newNode;
//  }   

//  public static void preorder(Node root){
//   if(root==null){
//     return;
//   }
//   System.out.print(root.data+" ");
//   preorder(root.left);
//   preorder(root.right);
//  }
//  public static void inorder(Node root){
//   if(root==null){
//     return;
//   }
//   inorder(root.left);
//   System.out.print(root.data+" ");
//   inorder(root.right);
//  }
//  public static void postorder(Node root){
//   if(root==null){
//     return;
//   }
//   postorder(root.left);
//   postorder(root.right);
//   System.out.print(root.data+" ");

//  }

//--------------------------

//level-ordertreverasal
//  public static void levelOrder(Node root){
//   if(root == null){
//     return;
//   }
//   Queue<Node> q = new LinkedList<>();
//   q.add(root);
//   q.add(null);

//   while (!q.isEmpty()) {
//     Node currNode = q.remove();
//     if(currNode==null){
//       System.out.println();
//       if(q.isEmpty()){
//         break;
//       }else{
//         q.add(null);
//       }
//     }else{
//       System.out.print(currNode.data+" ");
//       if(currNode.left != null){
//         q.add(currNode.left);
//       }
//       if(currNode.right != null){
//         q.add(currNode.right);
//       }
//     }
//   }
//  }

// public static int height(Node root){
//   if(root==null){
//     return 0;
//   }
//   int lh = height(root.left);
//   int rh = height(root.right);
//   return Math.max(lh,rh) +1;
// }

// public static int count(Node root){
//   if(root == null){
//     return 0;
//   }
//   int lcount = count(root.left);
//   int rcount = count(root.right);
//   return lcount + rcount +1;
// }

// public static int sum(Node root){
//   if(root == null){
//     return 0;
//   }
//   int lSum = sum(root.left);
//   int Rsum = sum(root.right);
//  return lSum + Rsum + root.data ;
// }

// public static int diameter2(Node root){
//   if(root==null){
//     return 0;
//   }
//     int leftDia = diameter2(root.left);
//     int leftHt = height(root.left);
//     int rightDia = diameter2(root.right);
//     int rightHt = height(root.right);

//     int selfDiam = leftHt + rightHt + 1;

//    return Math.max(selfDiam, Math.max(leftDia, rightHt));
//   }
// static class Info {
//    int diam;
//    int ht;
//    public Info(int diam,int ht){
//     this.diam = diam;
//     this.ht = ht;
//    }
// }
// public static Info diameter(Node root){
//   if(root == null){
//     return new Info(0, 0);
//   }
//     Info leftInfo = diameter(root.left);
//     Info righInfo = diameter(root.right);

//     int diam = Math.max(Math.max(leftInfo.diam, righInfo.diam),leftInfo.ht + righInfo.ht + 1);
//     int ht = Math.max(leftInfo.ht, righInfo.ht)+1;

//     return new Info(diam, ht);
// }



  // public static boolean isIdentical(Node node, Node subRoot) {
  //   if (node == null && subRoot == null) {
  //     return true;
  //   } else if (node == null || subRoot == null || node.data != subRoot.data) {
  //     return false;
  //   }
  //   if (!isIdentical(node.left, subRoot.left)) {
  //     return false;
  //   }
  //   if (!isIdentical(node.right, subRoot.right)) {
  //     return false;
  //   }
  //   return true;
  // }

  // public static boolean isSubTree(Node root, Node subRoot) {
  //   if (root == null) {
  //     return false;
  //   }
  //   if (root.data == subRoot.data) {
  //     if (isIdentical(root, subRoot)) {
  //       return true;
  //     }
  //   }

  //   return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
  // }

  // import java.util.LinkedList;
  // import java.util.Queue;
  // import java.util.*;

// import java.util.ArrayList;

// import DoublyLL.Node;


  // static class Info {
  //   Node node;
  //   int hd;

  //   public Info(Node node,int hd){
  //     this.node = node;
  //     this.hd = hd;
  //   }
    
  // }
  // public static void topView(Node root){
  //   //Level Order
  //   Queue<Info> q = new LinkedList<>();
  //   HashMap<Integer,Node> map = new HashMap<>();

  //   int min = 0,max = 0;
  //   q.add(new Info(root, 0));
  //   q.add(null);

  //   while (!q.isEmpty()) {
  //     Info curr = q.remove();
  //     if(curr == null){
  //       if(q.isEmpty()){
  //         break;
  //       }else{
  //         q.add(null);
  //       }
  //     }
  //    else{
  //     if(!map.containsKey(curr.hd)){
  //       map.put(curr.hd, curr.node);
  //     }
  //     if(curr.node.left!=null){
  //       q.add(new Info(curr.node.left, curr.hd-1));
  //       min = Math.min(min, curr.hd-1);
  //     }
  //     if(curr.node.right!=null){
  //       q.add(new Info(curr.node.right, curr.hd+1));
  //       max = Math.max(max, curr.hd+1);
  //     }
  //   }
  //   }
  //   for(int i=min;i<=max;i++){
  //     System.out.print(map.get(i).data+" ");
  //   }
  //   System.out.println();
  // }

  // public static void KLevel(Node root,int level,int k){
  //   if(root==null){
  //     return;
  //   }
  //   if(level==k){
  //     System.out.print(root.data+" ");
  //     return;
  //   }
  //   KLevel(root.left, level+1, k);
  //   KLevel(root.right, level+1, k);

  // }

  // public static boolean getPath(Node root,int n,ArrayList<Node> path){
  //   if(root == null){
  //     return false;
  //   }
  //   path.add(root);

  //   if(root.data == n){
  //     return true;
  //   }
  //   boolean foundLeft = getPath(root.left, n, path);
  //   boolean foundRight = getPath(root.right, n, path);

  //   if(foundLeft || foundRight){
  //     return true;
  //   }
  //   path.remove(path.size()-1);
  //   return false;
  // }

  // public static Node lca(Node root,int n1,int n2){
  //   ArrayList<Node> path1 = new ArrayList<>();
  //   ArrayList<Node> path2 = new ArrayList<>();

  //   getPath(root,n1,path1);
  //   getPath(root,n2,path2);

  //   //last common ancestor
  //   int i = 0;
  //   for(; i<path1.size() && i<path2.size();i++){
  //      if(path1.get(i) != path2.get(i)){
  //       break;
  //      }
  //   }
  //      //last equal node --> i-1
  //      Node lca = path1.get(i-1);
  //      return lca;
  // }

  // public static Node lca2(Node root,int n1,int n2){
    
  //   if(root == null || root.data == n1 || root.data == n2){
  //     return root;
  //   }
  //   Node leftLca = lca2(root.left, n1, n2);
  //   Node rightLca = lca2(root.right, n1, n2);

  //   if(rightLca ==  null){
  //     return leftLca;
  //   }
  //   if(leftLca == null){
  //     return rightLca;
  //   }
  //   return root;
  // }
  
  // public static int lcaDist(Node root,int n){
  //   if(root == null){
  //     return -1;
  //   }
  //   if(root.data == n){
  //     return 0;
  //   }
  //   int leftDist = lcaDist(root.left, n);
  //   int rightDist = lcaDist(root.right, n);

  //   if(leftDist == -1 && rightDist == -1){
  //     return -1;
  //   }else if(leftDist == -1){
  //     return rightDist+1;
  //   }else{
  //     return leftDist+1;
  //   }
       
  // }
  // public static int minDist(Node root,int n1,int n2){
  //   Node lca = lca2(root,n1,n2);
  //   int dist1 = lcaDist(lca,n1);
  //   int dist2 = lcaDist(lca,n2);

  //   return dist1 + dist2;
  // }
  public class Binary {
    static class Node {
      int data;
      Node left, right;
  
      public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
      }
    }

  public static int KAncestor(Node root,int n,int k){
    if(root==null){
      return -1;
    }
    if(root.data == n){
      return 0;
    }
    int leftDist = KAncestor(root.left, n, k);
    int rightDist = KAncestor(root.right, n, k);

    if(leftDist == -1 && rightDist == -1){
      return -1;
    }
    int max = Math.max(leftDist, rightDist);
    if(max+1 == k){
      System.out.println(root.data);
    }
    return max+1;

  }
  
  public static int transfrom(Node root){
    if(root == null){
      return 0;
    }
    int leftChild = transfrom(root.left);
    int rightChild = transfrom(root.right);

    int data = root.data;
    int newLeft = root.left == null ? 0 : root.left.data;
    int newRight = root.right == null ? 0: root.right.data;
    root.data = newLeft + leftChild + newRight+ rightChild;
    return data;

  }
  public static void preorder(Node root){
      if(root==null){
        return;
      }
      System.out.print(root.data+" ");
      preorder(root.left);
      preorder(root.right);
     }
  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    
     
    transfrom(root);
    preorder(root);
  }
}

public class AVL {
    static class Node{
        int data,height;
        Node left,right;

        Node(int data){
            this.data = data;
            height = 1;
        }
    }
    public static Node root;
    public static int height(Node root){
        if(root==null)
            return 0;
        
            return root.height;
        }
    
        static int max(int a,int b){
            return (a>b)? a:b;
        }
    
        //Right rotate subtree rooted with y
        public static Node rightRotate(Node y){
            Node x = y.left;
            Node T2 = x.right;

            //perfrom rotation
            x.right = y;
            y.left = T2;

            //update heights
            y.height = max(height(y.left),height(y.right)) + 1;
            x.height = max(height(x.left),height(x.right)) + 1;
    
            //Return new root
            return x;
    }

    //left rotate subtree rooted with x
    public static Node leftRotate(Node x){
        Node y = x.right;
        Node T2 = y.left;

        //perfrom rotation
        y.left = x;
        x.right = T2;

        //update heights
        x.height = max(height(x.left),height(x.right)) + 1;
        y.height = max(height(y.left),height(y.right)) + 1;

        //Return new root
        return y;
    }

    //Get Balance factor of node
    public static int getBalanace(Node root){
        if(root == null)
        return 0;

        return height(root.left)-height(root.right);
    }
    public static Node Insert(Node root,int key){
            if(root==null){
                root = new Node(key);
                
            }
            if(key<root.data){
              root.left =  Insert(root.left, key);
            }
            else if(key>root.data){
               root.right = Insert(root.right, key);
            }
            else
                return root; //Dublicate keys are not allowed
            
            //Update root height
            root.height = 1 + Math.max(height(root.left), height(root.right));

            //Get root's balanace factor
            int bf = getBalanace(root);

            //LL Case
            if(bf>1 && key < root.left.data)
                return rightRotate(root);

           //RR Case
            if(bf< -1 && key> root.right.data)
                return leftRotate(root);
          //Left Right Case
          if(bf>1 && key >root.left.data){
            root.left = leftRotate(root.left);
            return rightRotate(root);
          }
          //Right Left Case
          if(bf < -1 && key < root.right.data){
            root.right = rightRotate(root.right);
            return leftRotate(root);
          }
          return root;//return if AVL balanced
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
        root = Insert(root,10);
        root = Insert(root,20);
        root = Insert(root,30);
        root = Insert(root,40);
        root = Insert(root,50);
        root = Insert(root,25);

        preorder(root);
    }
}

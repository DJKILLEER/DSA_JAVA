
// import java.util.LinkedList;
public class Linked2 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    

    public static Node head;
    public static Node tail;
    public static int size;

  
    public void addFirst(int data) {
        // create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // new node next = head
        newNode.next = head; // link
        // head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }



// public static boolean isCycle(){
//     Node slow = head;
//     Node fast = head;

//     while (fast!=null && fast.next!=null) {
//         slow = slow.next; //+1
//         fast = fast.next.next; //+2
//         if(slow==fast){
//             return true; //cycle exist
//         }
//     }
//     return false;  // cycle doesnt exist
// }

//   public static void removeCycle(){
//     // detect  cycle
//     Node slow = head;
//     Node fast = head;
//     boolean cycle = false;
//     while (fast!=null && fast.next!=null) {
//         slow = slow.next;
//         fast = fast.next.next;
//         if(fast==slow){
//            cycle= true;
//            break;
//         }
//     }
//     if(cycle==false){
//         return;
//     }
//     // find meeting point
//         slow = head;
//         Node prev = null; //lastnode
//         while (slow!=fast) {
//             prev = fast;
//             slow = slow.next;
//             fast = fast.next;
//         }
//         prev.next = null;
//     // remove cycle --> last.next = null
//   }

//     public static void main(String[] args) {
//         head = new Node(1);
//         Node temp = new Node(2);
//         head.next = temp;
//         head.next.next = new Node(3);
//         head.next.next.next = temp;
//         //1->2->3->2
//         System.out.println(isCycle());    
//         removeCycle();
//         System.out.println(isCycle());    
    
//     }
// }





//merge sort code

    public Node getMid(Node head) {
        // slow fast approach
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;// slow is mid node
    }

    private Node merge(Node head1,Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1!=null && head2!=null) {
            if(head1.data<=head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2!=null) {
            temp = head2.next;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }
public Node mergeSort(Node head){
    if(head==null || head.next == null){
        return head;
    }
    //find mid
     Node mid = getMid(head);
    //left & right MS
    Node rightHead = mid.next;
    mid.next = null;
    Node newLeft = mergeSort(head);
    Node newRight = mergeSort(rightHead);

    //merge
    return merge(newLeft,newRight);
}


//------------------------------------------------------


// Zigzack
public void Zigzack(){
    // find mid
    Node slow = head;
    Node fast = head.next;
    while (fast!=null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    Node mid = slow;
    // reverse 2nd half
    Node curr = mid.next;
    mid.next = null;
    Node prev = null;
    Node next;

    while (curr!=null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    Node left = head;
    Node right = prev;
    Node nextL,nextR;

    //alt merge - zig-zag merge
    while (left!=null && right != null) {
        nextL= left.next;
        left.next=right;
        nextR = right.next;
        right.next = nextL;

        left = nextL;
        right = nextR;

    }
}

//------------------------------------------

public static void main(String[] args) {
    // create
    Linked2 ll = new Linked2();
    ll.addLast(1);
    ll.addLast(2);
    ll.addLast(3);
    ll.addLast(4);
    ll.addLast(5);
    // ll.addLast(6);
    
    //1-2-3-4-5

    ll.print();
    ll.Zigzack();
    ll.print();
 
}
}
//-------------------------------------------------


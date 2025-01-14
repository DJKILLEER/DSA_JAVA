public class LinkedList {
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

    // public void add(int idx, int data) {
    //     if (idx == 0) {
    //         addFirst(data);
    //         return;
    //     }
    //     Node newNode = new Node(data);
    //     size++;
    //     Node temp = head;
    //     int i = 0;
    //     while (i < idx - 1) {
    //         temp = temp.next;
    //         i++;
    //     }
    //     // i = idx-1 ; temp --> prev
    //     newNode.next = temp.next;
    //     temp.next = newNode;
    // }

    // public int removeFirst() {
    //     if (size == 0) {
    //         System.out.println("LL is empty");
    //         return Integer.MIN_VALUE;
    //     } else if (size == 1) {
    //         int val = head.data;
    //         head = tail = null;
    //         size = 0;
    //         return val;
    //     }
    //     int val = head.data;
    //     head = head.next;
    //     size--;
    //     return val;
    // }

    // public int removelast() {
    //     if (size == 0) {
    //         System.out.println("LL is empty");
    //         return Integer.MIN_VALUE;
    //     } else if (size == 1) {
    //         int val = head.data;
    //         head = tail = null;
    //         size = 0;
    //         return val;
    //     }
    //     // prev i = size-2
    //     Node prev = head;
    //     for (int i = 0; i < size - 2; i++) {
    //         prev = prev.next;
    //     }
    //     int val = prev.next.data;// tail.data
    //     prev.next = null;
    //     tail = prev;
    //     size--;
    //     return val;
    // }

    // public int itrSearch(int key) {
    //     Node temp = head;
    //     int i = 0;
    //     while (temp != null) {
    //         if (temp.data == key) {
    //             // key found
    //             return i;
    //         }
    //         temp = temp.next;
    //         i++;
    //     }
    //     // not found
    //     return -1;
    // }

    // public int helper(Node head, int key) {
    //     if (head == null) {
    //         return -1;
    //     }
    //     if (head.data == key) {
    //         return 0;
    //     }
    //     int idx = helper(head.next, key);
    //     if (idx == -1) {
    //         return -1;
    //     }
    //     return idx + 1;
    // }

    // public int recSearch(int key) {
    //     return helper(head, key);
    // }

    // public void reverse() {
    //     // O(n)
    //     Node prev = null;
    //     Node curr = tail = head;
    //     Node next;

    //     while (curr != null) {
    //         next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }
    //     head = prev;
    // }

    // public void deleteNthfromend(int n) {
    //     // caculate size of the linked list
    //     int s2 = 0;
    //     Node temp = head;
    //     while (temp != null) {
    //         temp = temp.next;
    //         s2++;
    //     }
    //     if (n == s2) {
    //         head = head.next;// removefirst
    //         return;
    //     }
    //     // s2 - n
    //     int i = 1;
    //     int itofind = s2 - n;
    //     Node prev = head;
    //     while (i < itofind) {
    //         prev = prev.next;
    //         i++;
    //     }
    //     prev.next = prev.next.next;
    //     return;
    // }

    public Node findMid(Node head) {
        // slow fast approach
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;// slow is mid node
    }
    
    public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        // step1 - find mid
       Node midNode = findMid(head);
    
        // step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
       Node right = prev;
       Node left = head;
        //step3 - check left half & right half
        while (right!=null) {
            if(left.data!=right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        // O(1)
        LinkedList li = new LinkedList();
        li.addFirst(1);
        // li.addFirst(2);
        li.addLast(2);
        li.addLast(1);
        li.print();
        System.out.println(li.checkPalindrome());
    }
}

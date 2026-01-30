import java.util.List;

class ListNode{
    int data;
    ListNode next;

    ListNode(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    ListNode head;
    void add(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
        }else{
            ListNode current = head;
            while(current.next != null){
                current  = current.next;
            }
            current.next = newNode;
        }
    }

    static ListNode removNode(ListNode head , int n){
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        if(n == size){
            return head.next;
        }

        int target = size - n;
        temp = head;
        for(int i =1; i < target; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
    static ListNode reverseList(ListNode head) {

        ListNode curr = head, prev = null, next;
        while (curr != null) {
            next = curr.next; // 2
            curr.next = prev; 
            prev = curr;
            curr = next;
        }
        return prev;
    }

    static int findMiddle(ListNode head){
        int middle = 0;
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        middle = size / 2;
        for(int i = 0; i < middle; i++){
            head = head.next;
        }
        return head.data;
    }

    public void display(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class REVERSE_LIINK {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(50);
        list.add(50);
        list.display();  // Output: 10 -> 20 -> 30 -> NULL
        list.head = LinkedList.reverseList(list.head);
        list.display();  // Output: 30 -> 20 -> 10 -> NULL
       // list.head = LinkedList.removNode(list.head, 1);
        list.display();  // Output: 30 -> 10 -> NULL
        System.out.println("Middle element: " + LinkedList.findMiddle(list.head));
}
}



import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class LinkedList {
    ListNode head;
    
    public void addNode(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    

    public int findNthFromEnd(int n) {
        if (head == null || n <= 0) {
            return -1; 
        }
        
        ListNode fast = head;
        ListNode slow = head;
        
  
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                return -1; 
            }
            fast = fast.next;
        }
 
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow.val;
    }
    

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class NthNodeFromEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();
        
        System.out.println("Enter the number of elements in the linked list:");
        int count = scanner.nextInt();
            
        System.out.println("Enter the elements of the linked list:");
        for (int i = 0; i < count; i++) {
            int num = scanner.nextInt();
            list.addNode(num);
        }
        
        
        System.out.println("Enter the value of n (position from end):");
        int n = scanner.nextInt();
        
      
        System.out.print("Linked List: ");
        list.display();
        
       
        int result = list.findNthFromEnd(n);
        if (result != -1) {
            System.out.println("The " + n + "th node from the end is: " + result);
        } else {
            System.out.println("Invalid position or empty list!");
        }
        
        scanner.close();
    }
}

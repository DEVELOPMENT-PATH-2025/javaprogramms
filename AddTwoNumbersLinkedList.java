import java.util.Scanner;

// Node class for the linked list
class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class LinkedListOperations {
    
    public static ListNode addNode(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            return newNode;
        }
        
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }
    
    // Create a linked list from user input
    public static ListNode createList(Scanner scanner, String listName) {
        System.out.println("Enter the number of digits for " + listName + ":");
        int n = scanner.nextInt();
        
        System.out.println("Enter the digits for " + listName + " (from most significant to least significant):");
        ListNode head = null;
        for (int i = 0; i < n; i++) {
            int digit = scanner.nextInt();
            head = addNode(head, digit);
        }
        return head;
    }
    
    // Add two numbers represented as linked lists
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;
        
        // Reverse both lists for easier addition (least significant digit first)
        l1 = reverseList(l1);
        l2 = reverseList(l2);
        
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }
        
        // Reverse the result back to most significant digit first
        return reverseList(dummyHead.next);
    }
    
    // Helper method to reverse a linked list
    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
    }
    
    // Display the linked list
    public static void displayList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}

public class AddTwoNumbersLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Create first number as linked list
            ListNode num1 = LinkedListOperations.createList(scanner, "first number");
            
            // Create second number as linked list
            ListNode num2 = LinkedListOperations.createList(scanner, "second number");
            
            // Display input numbers
            System.out.print("\nFirst number:  ");
            LinkedListOperations.displayList(num1);
            
            System.out.print("Second number: ");
            LinkedListOperations.displayList(num2);
            
            // Add the numbers
            ListNode sum = LinkedListOperations.addTwoNumbers(num1, num2);
            
            // Display the result
            System.out.print("Sum:           ");
            LinkedListOperations.displayList(sum);
            
        } finally {
            scanner.close();
        }
    }
}

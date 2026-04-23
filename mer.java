import java.util.Scanner;

class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class mer {

    public static void displayList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    public static Node mergeSortedLists(Node head1, Node head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;
        
        if (head1.data < head2.data) {
            head1.next = mergeSortedLists(head1.next, head2);
            return head1;
        } else {
            head2.next = mergeSortedLists(head1, head2.next);
            return head2;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter number of elements for first list: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter elements for first list (in sorted order):");
        Node list1 = null;
        Node tail1 = null;
        for (int i = 0; i < n1; i++) {
            Node newNode = new Node(scanner.nextInt());
            if (list1 == null) {
                list1 = newNode;
                tail1 = newNode;
            } else {
                tail1.next = newNode;
                tail1 = newNode;
            }
        }
        
       
        System.out.print("\nEnter number of elements for second list: ");
        int n2 = scanner.nextInt();
        System.out.println("Enter elements for second list (in sorted order):");
        Node list2 = null;
        Node tail2 = null;
        for (int i = 0; i < n2; i++) {
            Node newNode = new Node(scanner.nextInt());
            if (list2 == null) {
                list2 = newNode;
                tail2 = newNode;
            } else {
                tail2.next = newNode;
                tail2 = newNode;
            }
        }
       
       
        System.out.println("\nFirst linked list:");
        displayList(list1);
        System.out.println("Second linked list:");
        displayList(list2);
       
    
        Node mergedHead = mergeSortedLists(list1, list2);
        
        System.out.println("\nMerged linked list:");
        Node current = mergedHead;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
        
        scanner.close();
    }
}
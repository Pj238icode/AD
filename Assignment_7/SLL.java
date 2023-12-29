import java.util.Scanner;

class SLL {
    class L1 {
        int data;
        L1 next;

        L1(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static L1 head = null;

    void create(int data) {
        L1 node = new L1(data);
        if (head == null) {
            head = node;
        } else {
            L1 temp = head;
            head = node;
            node.next = temp;
        }

    }

    void display() {
        if (head == null) {
            System.out.println("LL is empty");
        } else {
            L1 temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.print("null");
        }
    }

    void insertAtlast(int data) {
        L1 node = new L1(data);
        if (head == null) {
            head = node;
        } else {
            L1 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            node.next = null;
        }
    }

    void insertAtKth(int data, int position) {
        L1 node = new L1(data);
        if (head == null) {
            head = node;
        } else {
            L1 temp = head;
            for (int i = 0; i < position - 1; i++) {
                temp = temp.next;

            }
            L1 temp1 = temp.next;
            temp.next = node;
            node.next = temp1;

        }

    }

    void deleteKthnode(int position) {
        if (head == null) {
            System.out.println("Nothing to delete");
        } else {
            L1 temp = head;
            for (int i = 0; i < position - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;

        }
    }

    void reverse(L1 temp) {
        if (head == null || head.next == null) {
            return;
        } else if (temp == null) {
            return;

        }
        reverse(temp.next);
        System.out.print(temp.data + "->");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SLL obj = new SLL();
        System.out.print("Enter the number of nodes you want to insert: ");
        int nodes = sc.nextInt();
        System.out.print("Enter the nodes: ");
        for (int i = 0; i < nodes; i++) {
            int node = sc.nextInt();
            obj.create(node);
        }
        obj.display();
        obj.insertAtlast(3);
        obj.insertAtlast(4);
        obj.insertAtlast(5);
        obj.insertAtlast(6);
        System.out.println();
        obj.insertAtKth(4, 3);
        obj.insertAtKth(2, 4);
        obj.display();
        obj.deleteKthnode(5);
        System.out.println();
        obj.reverse(head);
        System.out.print("null");
        obj.display();

    }
}
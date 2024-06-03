public class CDLL {
    public DNode head;
    public DNode tail;
    public int size;

    DNode createCDLL(int nodeValue) {
        head = new DNode();
        DNode newNode = new DNode();
        newNode.value = nodeValue;
        head = newNode;
        tail = newNode;
        newNode.next = newNode;
        newNode.prev = newNode;
        size = 1;
        return head;
    }

    void insertNode(int nodeValue, int loc) {
        DNode newNode = new DNode();
        newNode.value = nodeValue;
        if (head == null) {
            createCDLL(nodeValue);
            return;
        } else if (loc == 0) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        } else if (loc >= size) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            tail = newNode;
        } else {
            DNode tempNode = head;
            int index = 0;
            while (index < loc - 1) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;

    }

    void traverseCDLL(){
        if (head != null) {
            DNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }else{
            System.out.println("CDLL does not exist.");
        }

        // System.out.println();
    }

    void revtraverseCDLL(){
        if (head != null) {
            DNode tempNode = tail;
            for (int i = size; i > 0; i--) {
                System.out.print(tempNode.value);
                if (i != 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.prev;
            }
        }else{
            System.out.println("CDLL does not exist.");
        }

        // System.out.println();
    }

}

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

    void traverseCDLL() {
        if (head != null) {
            DNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        } else {
            System.out.println("CDLL does not exist.");
        }

        // System.out.println();
    }

    void revtraverseCDLL() {
        if (head != null) {
            DNode tempNode = tail;
            for (int i = size; i > 0; i--) {
                System.out.print(tempNode.value);
                if (i != 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.prev;
            }
        } else {
            System.out.println("CDLL does not exist.");
        }

        // System.out.println();
    }

    boolean searchNode(int nodeValue) {
        if (head != null) {
            DNode tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("\nThe node found at location: " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\nNode not found!!");
        return false;
    }

    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("The CDLL does not exist");
            return;
        } else if (location == 0) {
            if (size == 1) {
                head.prev = null;
                head.next = null;
                head = tail = null;
                size--;
                return;
            } else {
                head = head.next;
                head.prev = tail;
                tail.next = head;
                size--;
            }
        } else if (location >= size) {
            if (size == 1) {
                head.prev = null;
                head.next = null;
                head = tail = null;
                size--;
                return;
            } else{
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
                size--;
            }
        } else{
            DNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }

    public void deleteCDLL(){
        DNode  tempNode = head;
        for (int i = 0; i < size; i++) {
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("The CDLL has been del");
    }

}

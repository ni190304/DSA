public class DLL {
    public DNode head;
    public DNode tail;
    public int size;

    public DNode createDLL(int nodeValue) {
        head = new DNode();
        DNode newNode = new DNode();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }

    public void insertInLL(int nodeValue, int loc) {
        DNode node = new DNode();
        node.value = nodeValue;
        if (head == null) {
            createDLL(nodeValue);
            return;
        } else if (loc == 0) {
            node.prev = null;
            node.next = head;
            head = node;
        } else if (loc >= size) {
            node.next = null;
            node.prev = tail;
            tail.next = node;
            tail = node;
        } else {
            DNode tempNode = head;
            int index = 0;
            while (index < loc - 1) {
                tempNode = tempNode.next;
                index++;
            }
            DNode nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
            nextNode.prev = node;
            node.prev = tempNode;
        }
        size++;
    }

    public void traverseLL() {
        if (head == null) {
            System.out.println("SLL does not exist!");
        } else {
            DNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" --> ");
                }
                tempNode = tempNode.next;
            }

            System.out.println("\n");
        }

    }

    public void revtraverseLL() {
        if (head == null) {
            System.out.println("SLL does not exist!");
        } else {
            DNode tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" <-- ");
                }
                tempNode = tempNode.prev;
            }

            System.out.println("\n");
        }

    }

    boolean searchNode(int nodeValue) {
        if (head != null) {
            DNode tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Found the node at location: " + (i + 1) + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found!!!");
        return false;
    }

    public void deletionOfNode(int location) {
        if (head == null) {
            System.out.println("The SLL does not exist");
            return;
        } else if (location == 0) {
            if (size == 1) {
                head = null;
                tail = null;
                size--;
            } else {
                head  = head.next;
                head.prev = null;
                size--;
            }
        } else if (location >= size) {
            DNode tempNode = tail.prev;
            if (size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            } else {
                tempNode.next = null;
                tail = tempNode;
                size--;
            }
        } else {
            DNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;

            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }

    public void deleteSLL(){
        DNode tempNode = head;
        for (int i = 0; i < size; i++) {
            tempNode.prev = null;
            tempNode = tempNode.next; 
        }
        head = null;
        tail = null;
        System.out.println("The linked list got deleted");
    }

}

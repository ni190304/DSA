public class DLL {
    public DNode head;
    public DNode tail;
    public int size;

    public DNode createDLL(int nodeValue){
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
}

public class CDLL {
    public DNode head;
    public DNode tail;
    public int size;

    DNode createCDLL(int nodeValue){
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

    


}

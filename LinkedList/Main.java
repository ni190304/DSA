public class Main {
    public static void main(String[] args) {

        // SLL

        // SLL sll = new SLL();
        // sll.createSLL(5);
        // System.out.println(sll.head.value);
        // sll.insertInLL(6, 1);
        // sll.insertInLL(7, 3);
        // sll.insertInLL(9, 0);
        // sll.traverseLL();
        // sll.deletionOfNode(6);
        // sll.traverseLL();
        // sll.deleteSLL();
        // sll.traverseLL();
        // sll.searchNode(10);
        // System.out.println(sll.head.next.next.value);

        // CSLL

        CSLL csll = new CSLL();
        csll.createCSLL(5);
        csll.insertCSLL(4, 0);
        csll.insertCSLL(6,2);
        csll.insertCSLL(10, 7);
        csll.insertCSLL(7, 5);
        csll.traverseCSLL();
        csll.searchNode(10);
        csll.deleteNode(1);
        csll.traverseCSLL();
        csll.deleteCSLL();
        csll.traverseCSLL();



        
    }
}
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
        System.out.println(csll.head.value);
        System.out.println(csll.head.next.value);
        csll.insertCSLL(4, 1);
        System.out.println(csll.head.value);



        
    }
}
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

        // CSLL csll = new CSLL();
        // csll.createCSLL(5);
        // csll.insertCSLL(4, 0);
        // csll.insertCSLL(6,2);
        // csll.insertCSLL(10, 7);
        // csll.insertCSLL(7, 5);
        // csll.traverseCSLL();
        // csll.searchNode(10);
        // csll.deleteNode(1);
        // csll.traverseCSLL();
        // csll.deleteCSLL();
        // csll.traverseCSLL();

        // DLL

        // DLL dll = new DLL();
        // dll.createDLL(1);
        // dll.insertInLL(2, 0);
        // dll.insertInLL(3, 1);
        // dll.insertInLL(5, 1);
        // dll.insertInLL(7, 2);
        // // System.out.println(dll.head.next.prev.value);
        // dll.traverseLL();
        // // dll.revtraverseLL();
        // dll.searchNode(1);
        // System.out.println(dll.size);
        // dll.deletionOfNode(2);
        // dll.traverseLL();
        // dll.deleteSLL();
        // dll.traverseLL();

        // CDLL

        CDLL cdll = new CDLL();
        cdll.createCDLL(12);
        cdll.insertNode(3, 0);
        cdll.insertNode(6, 1);
        cdll.insertNode(7, 3);
        // System.out.println(cdll.head.next.value); 
        cdll.traverseCDLL();
        System.out.println();
        cdll.revtraverseCDLL();
        cdll.searchNode(5);
        System.out.println();
        cdll.deleteNode(2);
        cdll.traverseCDLL();
        System.out.println();
        cdll.deleteCDLL();
        System.out.println();
        cdll.traverseCDLL();




        
    }
}
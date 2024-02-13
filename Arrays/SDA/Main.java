package DSA.Arrays.SDA;

public class Main {
    public static void main(String[] args) {
        SD_Array sda = new SD_Array(10);
        sda.insert(0, 12);
        sda.insert(1, 10);
        sda.insert(2,20);
        

        // var first_element = sda.arr[0];
        // System.out.println(first_element);
        // var third_element = sda.arr[3];
        // System.out.println(third_element);
        
        System.out.println("Array Traversal");
        sda.traversalArray();

        sda.searchInArray(12);
        sda.searchInArray(11);
        
        sda.deleteValue(15);
        sda.traversalArray();


    }
}
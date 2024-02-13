package DSA.Arrays.SDA;

public class SD_Array{
    int arr[];

    public SD_Array(int sizeOfArray){
        this.arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueTobeInserted){

        try {
            if (arr[location] == Integer.MIN_VALUE) {
                System.out.println(arr[location]);
                arr[location] = valueTobeInserted;
                System.out.println("Successfully inserted");
            }
            else{
                // System.out.println(Arrays.toString(arr));
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // System.out.println(Arrays.toString(arr));
            System.out.println("Invalid index to access array!");
        }
    }

    // Array Traversal

    public void traversalArray(){
        try {
            for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        } catch (Exception e) {
            System.out.println("Array no longer exists");
        }
    }

    // Search for an element in the array

    public void searchInArray(int valueToSearch){
       for (int i = 0; i < arr.length; i++) {
        if (arr[i] == valueToSearch) {
            System.out.println("Value is found at the index of "+ (i+1));
            return;
        }
       } 
       System.out.println(valueToSearch +" not found");
    }

    // Delete value from Array

    public void deleteValue(int valuetoDelete){
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == valuetoDelete) {
                    arr[i] = Integer.MIN_VALUE;
                    System.out.println("The value has been deleted successfully");
                }
            }

            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Value not available");
        }
    }



}
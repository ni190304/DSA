package DSA.Arrays.MDA;

public class MD_Array {

    int arr[][];

    public MD_Array(int numberOfRows, int numberOfColumns) {
        this.arr = new int[numberOfRows][numberOfColumns];
        System.out.println(arr.length);
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    // Inserting value in the array

    public void insertValueInTheArray(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;
                System.out.println("The value successfully inserted");
            } else {
                System.out.println("Already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array");
        }
    }

    public void accessCell(int row, int col) {
        System.out.println("\nAccessing Row " + row + " and Col " + col);
        try {
            System.out.println("Cell value is " + arr[row][col]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array");
        }
    }

    public void traverse2DArray(){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }
    }

    public void searchingValue(int value){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == value) {
                    System.out.println("Value is found at ["+row+"]["+col+"]");
                    return;
                }
            }
        }

        System.out.println("Value not found");
    }

    public void deleteValue(int row, int col){
        try {
            System.out.println("Succesfully deleted");
            arr[row][col] = Integer.MIN_VALUE;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This index is invalid");
        }
    }
}
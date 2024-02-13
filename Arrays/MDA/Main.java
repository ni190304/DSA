package DSA.Arrays.MDA;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        MD_Array mda = new MD_Array(3,3);
        mda.insertValueInTheArray(0, 0, 10);
        mda.insertValueInTheArray(0, 1, 20);
        mda.insertValueInTheArray(1, 0, 30);
        mda.insertValueInTheArray(2, 0, 40);

        mda.accessCell(1, 1);
        mda.traverse2DArray();
        mda.searchingValue(20);

        System.out.println(Arrays.deepToString(mda.arr));
        mda.deleteValue(1, 0);
        System.out.println(Arrays.deepToString(mda.arr));

        


    }
}

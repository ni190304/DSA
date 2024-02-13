package DSA.ArrayList;
import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        // ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(30,10,20));

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2, 4);

        System.out.println(numbers);

        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("A");
        stringList.add("B");
        stringList.add(1,"C");
        stringList.add("E");
        stringList.add("F");
        System.out.println(stringList);

        // System.out.println(stringList.get(2));

        //Accessing

        for (int i = 0; i < stringList.size(); i++) {
            String letter = stringList.get(i);
            System.out.println(letter);
        }

        for (String letter : stringList) {
            System.out.println(letter);
        }

        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            String letter = iterator.next();
            System.out.println(letter);
        }

        //Searching

        for (String letter : stringList) {
            if (letter.equals("F")) {
                System.out.println("The element is found");
                break;
            }
        }

        //indexOf
        int index = stringList.indexOf("C");
        System.out.println("Found at index "+index);


        // Deleting

        stringList.remove(2);
        stringList.remove("E");
        System.out.println(stringList);


        
    }
}

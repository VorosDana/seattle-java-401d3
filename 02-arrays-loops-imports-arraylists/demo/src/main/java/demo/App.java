/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;

import java.lang.*;
import java.util.*;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
//        System.out.println(new App().getGreeting());

        String[] array = new String[]{"Hello", "again"};

//        for (String item : array) {
//            System.out.println(item);
//        }

//        System.out.println("array1:" + array.length);

//        String[] array2 = new String[10];
//        System.out.println("array2:" + array2.length);
//
//        for (int x = 0; x < 10; x++) {
//            System.out.println(array2[x]);
//        }
//
//        int x = 0;
//        while (x < array.length) {
//            if (x != 13) {
//
//            }
//            if (x < 1) {
//                x++;
//                continue;
//            }
//            System.out.println(array[x]);
//            x++;
//        }
//
//        aa:
//        for (; ; ) {
//            bb:
//            while (true) {
//                break bb;
//            }
//            break aa;
//        }
//
//        int j = 0;
//        do {
//            System.out.println(array[j]);
//        } while (j < array.length);

        primitivesAndOrObjects();
    }

    /**
     * Write your own docs!
     */
    public static void primitivesAndOrObjects() {
        int x = 5;
        Integer y = 5;
        Double d = 6.0;

        ArrayList<Integer> list = new ArrayList<>();
        List<String> myOtherList;

        list.add(5);
        list.add(3);

        for (Integer item : list) {
            System.out.println(item);
        }
    }

    public static int addNumbers(int a, int b) {
        return 0;
    }

    public static int[] reverse(int[] arr) {
        int[] results = new int[arr.length];
        return arr;
    }
}

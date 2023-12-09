import java.text.DecimalFormat;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Deque<Integer> testList = new Deque<>();
        System.out.println(
        testList.getSize() + ", \n" +
        testList.isEmpty()
        );
        testList.addFront(1);
        testList.addBack(0);
        testList.addBack(-1);
        testList.addBack(-2);
        testList.addBack(-3);
        testList.addFront(2);
        testList.remove(1);
        System.out.println(testList.isEmpty());
        System.out.println(testList.getSize());
        System.out.println(testList.removeBack());
    }
}
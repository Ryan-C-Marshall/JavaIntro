import java.text.DecimalFormat;
import java.util.*;
import java.time.LocalTime;

class Main {
    public static void main(String[] args) {


        LocalTime time1 = LocalTime.now();

        for (int i = 0; i < 1000; i++) {
            SherlockAnagrams.computeAnagrams("ifailuhkqqifailuhkqqifailuhkqqifailuhkqqifailuhkqqifailuhkqqifailuhkqqifailuhkqq");
        }

        LocalTime time2 = LocalTime.now();

        System.out.println((time2.getSecond() * 1_000_000 + (double) time2.getNano() / 1000 - (time1.getSecond() * 1_000_000 + (double) time1.getNano() / 1000)) / 1_000_000d);

        /*
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

         */
    }
}
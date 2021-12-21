import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void values() {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 5, 8, 23, 4);
        for (int x : intList) {
            Collections.sort(intList);
            if (x > 0 && x % 2 == 0) {
                System.out.print(x + "\s");
            }
        }
    }

    public static void main(String[] args) {
        values();
        System.out.println();
        StreamMain.streamMain();
    }
}

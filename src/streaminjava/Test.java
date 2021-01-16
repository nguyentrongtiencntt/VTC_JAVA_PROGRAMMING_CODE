package streaminjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Object[] res =
                Stream.of(1,2,3,4,5,6,7,8)
                        .filter(i->i%2==0)
                        .filter(i->i>3)
                        .toArray();

        Object[] resa = Stream.of(1,2,3,4,5,6,7,8)
                        .filter(i->i%2==0)
                        .filter(i->i>6) .toArray();
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(resa));

    }
}

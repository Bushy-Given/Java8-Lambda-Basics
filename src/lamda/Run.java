package lamda;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.List;

public class Run {

    public static void main(String[] args){

        List<Integer> values = Arrays.asList(5,7,88,42,2);
        values.forEach(System.out::println);

        Fly lambdaflying = ()-> System.out.println("im flying");
        lambdaflying.flying();
    }
}
@FunctionalInterface
interface Fly{
    void flying();
}
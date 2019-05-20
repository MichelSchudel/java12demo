package nl.craftsmen.java12demo;

import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class ApiTests {

    class MinMax {
        private Optional<Integer> min;
        private Optional<Integer> max;

        public MinMax(Optional<Integer> min, Optional<Integer> max) {
            this.min = min;
            this.max = max;
        }
    }
    @Test
    public void teeingDemo() {
        List<Integer> numbers = List.of(1,2,3,4,5);
        MinMax range = numbers.stream()
                        .collect(Collectors.teeing(

                                minBy(Integer::compareTo),
                                maxBy(Integer::compareTo),
                                (r1,r2) -> new MinMax(r1,r2)));

    }
}

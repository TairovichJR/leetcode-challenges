package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by tairovich_jr on 2021-06-18.
 */
public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        return IntStream.range(1, n+1)
                .mapToObj( i -> (i % 3 == 0 && i % 5 == 0)
                        ? "FizzBuzz" : (i % 3 == 0)
                        ? "Fizz" : (i % 5 == 0)
                        ? "Buzz" :
                        String.valueOf(i))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(new FizzBuzz().fizzBuzz(3));
    }
}

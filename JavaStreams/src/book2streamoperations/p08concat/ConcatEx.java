package book2streamoperations.p08concat;

import java.util.stream.Stream;

public class ConcatEx {
    public static void main(String[] args)
    {
        Stream<Integer> firstStream = Stream.of(1, 2, 3);
        Stream<Integer> secondStream = Stream.of(4, 5, 6);
         
        Stream<Integer> resultingStream = Stream.concat(firstStream, secondStream);
         
        resultingStream
        .forEach(System.out::println);
        
    }
}

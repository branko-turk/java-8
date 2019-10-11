package book2streamoperations.p09skip;

import java.util.stream.Stream;

public class SkipEx {
    public static void main(String[] args)
    {
        Stream<Integer> evenNumInfiniteStream = Stream.iterate(0, n -> n + 2);
        evenNumInfiniteStream
                .skip(2)
                .limit(3)
                .forEach(System.out::println);
    }
}
//Description
//Stream.skip() method is stateful intermediate operation. Stateful operations,
//such as distinct and sorted, may incorporate state from previously seen elements 
//when processing new elements.
//Returns a stream consisting of the remaining elements of the stream after discarding 
//the first n elements of the stream.
//If the stream contains fewer than n elements then an empty stream will be returned.
//Generally skip() is a cheap operation, it can be quite expensive on ordered 
//parallel pipelines, especially for large values of n.
//Using an unordered stream source (such as generate(Supplier)) or removing the ordering
//constraint with BaseStream.unordered() may result in significant speedups of skip() in parallel pipelines.
//skip() skips the first n elements in the encounter order.
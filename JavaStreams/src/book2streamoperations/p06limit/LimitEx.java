package book2streamoperations.p06limit;

import java.util.stream.Stream;

public class LimitEx {
    public static void main(String[] args)
    {
        Stream<Integer> evenNumInfiniteStream = Stream.iterate(8, n -> n + 2);
         
        evenNumInfiniteStream
                .limit(5)
                .forEach(System.out::println);
    }

}
//Stream.limit() method is short-circuiting intermediate operation. 
//An intermediate operation is short-circuiting if, when presented 
//with infinite input, it may produce a finite stream as a result. 
//Please note that a terminal operation is short-circuiting if, 
//when presented with infinite input, it may terminate in finite time.
//It returns a stream consisting of the maximum elements, no longer 
//than given size in length, of current stream.
//Generally, limit() is cheap operation but may sometimes be expensive 
//if maxSize has a large value and stream is parallely processed.
//Using an unordered stream source (such as generate(Supplier)) or removing 
//the ordering constraint with BaseStream.unordered() may result in significant 
//speedups of limit() in parallel pipelines.
//limit() returns the first n elements in the encounter order.
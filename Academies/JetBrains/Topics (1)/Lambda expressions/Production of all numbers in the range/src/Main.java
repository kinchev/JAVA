import java.util.function.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static java.util.stream.StreamSupport.longStream;


class Operator {


    public static LongBinaryOperator binaryOperator = (x,y)-> LongStream.rangeClosed(x,y).reduce(1L,(a, b)->a*b);
}

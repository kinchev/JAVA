import java.util.function.LongUnaryOperator;

class Operator {

    public static LongUnaryOperator unaryOperator = x -> {
        ++x;
        return x % 2 == 0 ? x : ++x;
    };
}

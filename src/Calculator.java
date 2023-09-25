import java.util.function.*;

public class Calculator {
    public static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> { //Ошибка в том что делить на ноль нельзя, и в первом варианте это ни как не проверялось!
        if (y != 0) {
            return x / y;
        } else {
            throw new ArithmeticException("Ошибка! На ноль делить нельзя!");
        }
    };
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
}
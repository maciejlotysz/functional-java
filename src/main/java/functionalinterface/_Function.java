package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        int increment = increment(1);
        System.out.println(increment);

        int incFunction = incrementByFunction.apply(1);
        System.out.println(incFunction);

        int incAndMultiply = incrementByFunction.andThen(multiplyBy10Function).apply(1);
        System.out.println(incAndMultiply);

        Function<Integer, Integer> incBY1AntThenMultiplyBY10 = incrementByFunction.andThen(multiplyBy10Function);
        System.out.println(incBY1AntThenMultiplyBY10.apply(1));

        BiFunction<Integer, Integer, Integer> addThenMultiplyBiFunction =
                (addNumber, multiplyNumber) -> (addNumber + 1) * multiplyNumber;
        System.out.println(addThenMultiplyBiFunction.apply(10, 4));

    }

    static int increment(int number) {
        return number + 1;
    }

    static Function<Integer, Integer> incrementByFunction = number -> ++number;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

}

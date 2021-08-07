package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {



        System.out.println("Function increment");
        int increment;
        increment = incrementByOne(1);
        System.out.println("Increment by one: " + increment);

        int increment2 = incrementByOneFunction.apply(10);
        System.out.println("Increment by one function: " + increment2);

        int multiple = multiplyBy10Function.apply(increment2);
        System.out.println("Multiply by 10 function: " + multiple);

        int addandmultiple = incByOneAndMultiplyBy10.apply(20);
        System.out.println("Increment by one function and then multiply by 10 function 'andThen': " + addandmultiple);

        int incandmultipleby10BiFunction = incByOneAndMultiplyBiFunction.apply(5,10);
        System.out.println("Increment and multiply 'biFunction': " + incandmultipleby10BiFunction);
    }
    static Function <Integer, Integer> incrementByOneFunction = test ->  test + 1;
    static Function <Integer, Integer> multiplyBy10Function = test2 -> test2 * 10;
    static Function <Integer, Integer> incByOneAndMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);
    static BiFunction<Integer, Integer, Integer> incByOneAndMultiplyBiFunction = (t1, t2) -> (t1+1)*t2;

    static int incrementByOne (int number){
        return number + 1;
    }


}

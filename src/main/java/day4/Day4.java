package day4;

import java.util.Optional;

/**
 * Created by Ibrahim Chowdhury on 21 Jun, 2021
 * <p>
 * Today We will see optional class
 */
public class Day4 {
    public static void main(String[] args) {

        Integer firstValue = 50;
        Integer secondValue = null;

        Optional<Integer> value1 = Optional.ofNullable(firstValue);
        Optional<Integer> value2 = Optional.ofNullable(secondValue);

        System.out.println(whoIsGreater(value1, value2));

    }

    public static Integer whoIsGreater(Optional<Integer> firstValue, Optional<Integer> secondValue) {

        // to pass the default value if any parameter value is missing
        Integer value1 = firstValue.orElse(0);
        Integer value2 = secondValue.orElse(0);

        return value1 > value2 ? value1 : value2;
    }
}

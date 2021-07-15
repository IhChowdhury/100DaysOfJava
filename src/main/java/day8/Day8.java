package day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Created by Ibrahim Chowdhury on 15 July, 2021
 *
 * Today we will see example of Function which is a functional interface
 *
 * This example crated two Funtion one fucntion will return size of a list and
 * other funtion will multiply size of list.
 */
public class Day8 {
    public static void main(String[] args) {
        Function<List, Integer> getSizeFunc = x -> x.size();
        Function<Integer,Integer> multiplyFunc = x -> x * x;

        List<Character> characters = new ArrayList<Character>(Arrays.asList('A','B','C','D','E'));
        System.out.println(getSizeFunc.andThen(multiplyFunc).apply(characters)); //output: 25

    }
}

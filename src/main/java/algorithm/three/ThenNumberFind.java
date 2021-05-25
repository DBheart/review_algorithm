package algorithm.three;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ThenNumberFind {
    public int[] parse(String inputOne) {
        StringTokenizer token = new StringTokenizer(inputOne);
        int number = token.countTokens();
        int[] output = new int[number];

        for(int i=0;i<number;i++){
            output[i] = Integer.parseInt(token.nextToken());
        }
        return output;
    }

    public int[] process(int[] numberArray, int x) {
        return Arrays.stream(numberArray ).filter(number -> number <x).toArray();
    }
}

package algorithm.five;

import java.util.Arrays;
import java.util.StringTokenizer;

public class MinMax {
    public int[] parse(String input) {
        StringTokenizer token = new StringTokenizer(input);

        int count = token.countTokens();
        int[] parseInput = new int[count];

        for(int i=0;i<count;i++){
            parseInput[i] = Integer.parseInt(token.nextToken());
        }

        return parseInput;


    }

    public int[] process(int[] parseInput) {
        Arrays.sort(parseInput);

        int max = parseInput[parseInput.length -1];
        int min = parseInput[0];

        int[] output = new int[2];

        output[0] = min;
        output[1] = max;

        return output;
    }
}

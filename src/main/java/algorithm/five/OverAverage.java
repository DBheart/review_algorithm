package algorithm.five;

import java.util.Arrays;
import java.util.StringTokenizer;

public class OverAverage {
    public String[] parse(String input) {
        StringTokenizer token = new StringTokenizer(input);
        int tokenCount = token.countTokens();
        String[] parseInput = new String[tokenCount];
        for(int i=0;i<tokenCount;i++){
            parseInput[i] = token.nextToken();
        }

        return parseInput;

    }

    //TODO Arrays에서는 Max라던가 구하는게 없나?
    //TODO 반올림 공식 : https://coding-factory.tistory.com/250
    public double jegment(String[] parseInput) {
        int N = Integer.parseInt(parseInput[0]);

        double sum = 0;
        for(int i=1;i<=N;i++){
            sum += Integer.parseInt(parseInput[i]);
        }

        double scoreAverage = sum/N;

        double overAverageCount = 0;
        for(int i=1;i<=N;i++){
            double score =  Integer.parseInt(parseInput[i]);

            if(score > scoreAverage){
                overAverageCount += 1;
            }
        }

        return Math.round(overAverageCount/N * 100*1000)/1000.0;


    }
}

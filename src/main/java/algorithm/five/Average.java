package algorithm.five;

import java.util.Arrays;

public class Average {
    public double[] calculate(int[] score,int count) {

        Arrays.sort(score);

        int M = score[count-1];

        double[] output = new double[count];

        for(int i=0;i<score.length;i++){
            //TODO int를 나누어서 소수점이 나오면 0이 되어버린다.
            double d = (double)score[i];
            output[i] = d/M * 100;
        }

        return output;
    }

    //TODO steam의 reduce를 해도 될것 같다.
    public double jegment(double[] calScore,int count) {
        int sum = 0;
        for(int i=0;i<calScore.length;i++){
            sum += calScore[i];
        }

        return sum/count;
    }
}

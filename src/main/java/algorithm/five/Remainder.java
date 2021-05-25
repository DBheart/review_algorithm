package algorithm.five;

import java.util.Arrays;

public class Remainder {
    public int[] calculation(int[] input) {
        return Arrays.stream(input).map(number -> number%42).toArray();
    }

    public int judgment(int[] calInput) {
        int[] remainderCount = new int[42];
        for(int number:calInput){
            remainderCount[number] +=1;
        }

        int count = 0;
        for(int countNumber:remainderCount){
            if(countNumber >=1){
                count++;
            }
        }

        return count;
    }
}

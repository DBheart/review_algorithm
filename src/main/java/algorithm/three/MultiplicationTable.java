package algorithm.three;

public class MultiplicationTable {
    public int[] process(int input) {
        int[] output = new int[9];
        for(int i=1;i<=9;i++){
            int arrIndex = i -1;
            output[arrIndex] = i * input;
        }

        return output;
    }
}

package algorithm.five;

public class MaximumValue {
    public int[] process(String[] input) {
        int maxNumber = 0;
        int index = 0;

        for(int i=0;i<input.length;i++){
            int parseNumber = Integer.parseInt(input[i]);
            if(maxNumber < parseNumber){
                maxNumber = parseNumber;
                index = i+1;
            }
        }

        int[] output = new int[2];

        output[0] = maxNumber;
        output[1] = index;

        return output;
    }
}

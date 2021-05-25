package algorithm.three;

public class StarPrint1 {
    public static void main(String[] args) {

    }

    public String[] process(int input) {
        String[] output = new String[input];

        String reduceOutput = "";
        for(int i=0;i<input;i++){
            reduceOutput = reduceOutput + "*";
            output[i] = reduceOutput;
        }

        return output;
    }
}

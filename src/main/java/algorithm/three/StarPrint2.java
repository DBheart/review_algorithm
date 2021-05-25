package algorithm.three;

//TODO 공백 채우기 : https://recordsoflife.tistory.com/477
public class StarPrint2 {
    public static void main(String[] args) {

    }

    public String[] process(int input) {
        String[] output = new String[input];


        String reduceOutput = "";
        for(int i=0;i<input;i++){
            reduceOutput = reduceOutput + "*";
            output[i] = reduceOutput;
        }

        for(int i=0;i<output.length;i++){
            String parseInput = output[i];
            output[i] = String.format("%1$" + input + "s", parseInput);
        }

        return output;
    }
}

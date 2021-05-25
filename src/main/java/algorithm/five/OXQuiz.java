package algorithm.five;

//TODO OX를 영어로 모라고 해야해?
public class OXQuiz {
    public String[] parse(String input) {
        return input.split("");
    }

    public int process(String[] parseInput) {
        int reduceCount = 0;
        int successionRightCount = 0;

        int[] output = new int[parseInput.length];

        for(int i=0;i<parseInput.length;i++){
            if("O".equals(parseInput[i])){
                successionRightCount +=1;
            }else{
                successionRightCount = 0;
            }

            output[i] = successionRightCount;
        }

        for(int count: output){
            reduceCount +=count;
        }

        return reduceCount;
    }
}

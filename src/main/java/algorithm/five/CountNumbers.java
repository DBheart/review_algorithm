package algorithm.five;

public class CountNumbers {
    public Integer parse(int a, int b, int c) {
        return a * b * c;
    }

    public int[] process(Integer parseInput) {
        String[] digitNumbers = parseInput.toString().split("");
        int[] countNumbers = new int[10];
        for(int i=0;i<digitNumbers.length;i++){
            switch(digitNumbers[i]){
                case "1": countNumbers[1] +=1; break;
                case "2": countNumbers[2] +=1; break;
                case "3": countNumbers[3] +=1; break;
                case "4": countNumbers[4] +=1; break;
                case "5": countNumbers[5] +=1; break;
                case "6": countNumbers[6] +=1; break;
                case "7": countNumbers[7] +=1; break;
                case "8": countNumbers[8] +=1; break;
                case "9": countNumbers[9] +=1; break;
                default:countNumbers[0] +=1;
            }
        }

        return countNumbers;
    }
}

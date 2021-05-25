package algorithm.six;

//TODO 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
public class OneNumber {
    public int calulator(Integer input) {

        int count =0;
        for(int i= 1;i<=input;i++){
            if(isSeqNumber(i)){
                count++;
            }
        }

        return count;
    }

    private static boolean isSeqNumber(Integer seq) {
        String[] parseIntput = seq.toString().split("");

        if(parseIntput.length>=3){
            return official(parseIntput);

        }else{
            return true;
        }
    }

    private static boolean official(String[] parseIntput) {
        int a = Integer.parseInt(parseIntput[0]);
        int d = Integer.parseInt(parseIntput[1]) - Integer.parseInt(parseIntput[0]);
        for(int i=2;i<parseIntput.length;i++){
            int seqNumber = Integer.parseInt(parseIntput[i]);
            if(seqNumber != a+ i*d){
                return false;
            }
        }

        return true;
    }
}

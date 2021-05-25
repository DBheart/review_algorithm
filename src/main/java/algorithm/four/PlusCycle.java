package algorithm.four;

public class PlusCycle {
    public String paserInput(Integer n) {
        if(n <10){
            return "0"+n;
        }else{
            return n.toString();
        }
    }

    public int process(String parseN) {
        int cycleCount = 1;

        String temp = parseN;
        while(true){
            String[] splitDigitNumber = temp.split("");

            Integer tens = Integer.parseInt(splitDigitNumber[0]);
            Integer units = Integer.parseInt(splitDigitNumber[1]);

            Integer sum = tens + units;

            String[] sumSplit = sum.toString().split("");

            int 마지막글자수 = sumSplit.length-1;
            String lastDigitNumber = sumSplit[마지막글자수];

            temp = units.toString() + lastDigitNumber;
            if(parseN.equals(temp) ){
                break;
            }else{
                cycleCount++;
            }
        }

        return cycleCount;
    }
}

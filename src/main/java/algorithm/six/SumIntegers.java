package algorithm.six;

public class SumIntegers {
    public static void main(String[] args) {

    }

    public static long sum(int[] a){
        long sum = 0;

        for(int number:a){
            sum +=number;
        }

        return sum;
    }
}

package algorithm.three;

import java.util.Scanner;

public class ReduceSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int sumNumber = sumFromInputNumber(input);

        System.out.println(sumNumber);
    }

    public static int sumFromInputNumber(int input) {
        int reduceSum = 0;
        for(int i=1;i<=input;i++){
            reduceSum += i;
        }

        return reduceSum;
    }
}

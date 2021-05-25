package algorithm.three;

import java.util.Scanner;

public class ABPlus3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for(int i=0;i<input;i++){
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A + B);
        }
    }
}

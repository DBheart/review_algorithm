package algorithm.four;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ABPlus5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while(true){
            String input = br.readLine();
            String[] parseInput = parse(input);

            int A = Integer.parseInt(parseInput[0]);
            int B = Integer.parseInt(parseInput[1]);

            if(A ==0 && B ==0){
                break;
            }else{
                System.out.println(A+ B);
            }
        }
    }

    private static String[] parse(String input) {
        StringTokenizer token = new StringTokenizer(input);
        int length = token.countTokens();
        String[] paserInput = new String[length];
        for(int i=0;i<length;i++){
            paserInput[i] = token.nextToken();
        }

        return paserInput;
    }
}

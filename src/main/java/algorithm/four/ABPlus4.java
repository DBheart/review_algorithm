package algorithm.four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ABPlus4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String input = br.readLine();

            StringTokenizer tokenizer = new StringTokenizer(input);

            int A = Integer.parseInt(tokenizer.nextToken());
            int B = Integer.parseInt(tokenizer.nextToken());

            System.out.println(A + B);
        }

    }
}

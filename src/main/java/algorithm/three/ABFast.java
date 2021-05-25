package algorithm.three;

import java.io.*;
import java.util.StringTokenizer;

public class ABFast {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testNumber = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0;i<testNumber;i++){
            String input = br.readLine();
            int[] parseInput = parse(input);
            Integer output = parseInput[0] + parseInput[1];

            bw.write(output.toString());
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }

    public static int[] parse(String input) {
        StringTokenizer token = new StringTokenizer(input);

        int[] parseOutput = new int[2];
        parseOutput[0] = Integer.parseInt(token.nextToken());
        parseOutput[1] = Integer.parseInt(token.nextToken());

        return parseOutput;
    }
}

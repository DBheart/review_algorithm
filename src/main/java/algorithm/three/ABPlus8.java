package algorithm.three;

import java.io.*;
import java.util.StringTokenizer;

//TODO 리턴에 값뿐만 아니라 과정값도 필요할 때
public class ABPlus8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testNumber = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(Integer i=1;i<=testNumber;i++){
            String input = br.readLine();
            StringTokenizer token = new StringTokenizer(input);
            Integer A = Integer.parseInt(token.nextToken());
            Integer B = Integer.parseInt(token.nextToken());

            Integer sum = A + B;
            bw.write("Case #");
            bw.write(i.toString());
            bw.write(": ");;
            bw.write(A.toString());
            bw.write(" + ");
            bw.write(B.toString());
            bw.write(" = ");
            bw.write(sum.toString());
            bw.newLine();

        }

        bw.flush();
        bw.close();
    }
}

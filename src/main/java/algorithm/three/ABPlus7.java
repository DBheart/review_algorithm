package algorithm.three;

import java.io.*;
import java.util.StringTokenizer;

//TODO JAVA IO에 대해서 알아보자... 어? 저번에 알아봤나? 봤으면 한번 더 보도록 하자.
public class ABPlus7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testNumber = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=1;i<=testNumber;i++){
            String input = br.readLine();
            StringTokenizer token = new StringTokenizer(input);
            int A = Integer.parseInt(token.nextToken());
            int B = Integer.parseInt(token.nextToken());

            Integer sum = A + B;
            bw.write("Case #"+i+": ");
            bw.write(sum.toString());
            bw.newLine();

        }

        bw.flush();
        bw.close();
    }
}

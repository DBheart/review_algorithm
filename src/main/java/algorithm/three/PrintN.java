package algorithm.three;

import java.io.*;

public class PrintN {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(Integer i=number;i>0;i--){
            bw.write(i.toString());
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}

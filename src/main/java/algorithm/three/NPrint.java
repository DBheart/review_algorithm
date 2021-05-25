package algorithm.three;

import java.io.*;

public class NPrint {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int printNumber = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(Integer i=1;i<=printNumber;i++){
            bw.write(i.toString());
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}

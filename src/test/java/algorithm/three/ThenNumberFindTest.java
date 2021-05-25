package algorithm.three;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThenNumberFindTest {
    @Test
    public void testOne(){
        //정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
        //N과 X
        //수열 A
        String inputOne = "10 5";
        String inputTwo = "1 10 4 9 2 3 8 5 7 6";

        ThenNumberFind thenNumberFind = new ThenNumberFind();
        int[] NX = thenNumberFind.parse(inputOne);

        int N = NX[0];
        int X = NX[1];

        int[] NumberArray = thenNumberFind.parse(inputTwo);

        int[] output = thenNumberFind.process(NumberArray,X);

        Assert.assertEquals(output[0],1);
        Assert.assertEquals(output[1],4);
        Assert.assertEquals(output[2],2);
        Assert.assertEquals(output[3],3);
    }

}
package algorithm.five;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

//TODO 배열과 컬렉션에서 MIN, MAX 구하는 방법은 무엇무엇이 있을까? 그외의 것들도 있었지? Math가 있구나..
public class MinMaxTest {
    @Test
    public void testOne(){
        int length = 5;
        String input = "20 10 35 30 7";

        MinMax minMax = new MinMax();
        int[] parseInput =  minMax.parse(input);

        int[] output = minMax.process(parseInput);

        Assert.assertEquals(output[0],7);
        Assert.assertEquals(output[1],35);
    }

}
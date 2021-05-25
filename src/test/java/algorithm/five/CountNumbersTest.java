package algorithm.five;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountNumbersTest {

    @Test
    public void testOne(){
        int A = 150;
        int B = 266;
        int C = 427;

        CountNumbers countNumbers = new CountNumbers();
        Integer parseInput = countNumbers.parse(A,B,C);
        int[] arrayNine = new int[10];
        arrayNine = countNumbers.process(parseInput);


        Assert.assertEquals(arrayNine[0], 3);
        Assert.assertEquals(arrayNine[1], 1);
        Assert.assertEquals(arrayNine[3], 2);
        Assert.assertEquals(arrayNine[7], 2);
    }

}
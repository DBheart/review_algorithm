package algorithm.five;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemainderTest {
    @Test
    public void testOne(){
        int[] input = new int[]{1,2,3,4,5,6,7,8,9,10};
        Remainder remainder = new Remainder();

        int[] calInput = remainder.calculation(input);

        int output = remainder.judgment(calInput);

        Assert.assertEquals(output,10);
    }

    @Test
    public void testTwo(){
        int[] input = new int[]{42, 84, 252, 420, 840, 126, 42, 84, 420, 126};

        Remainder remainder = new Remainder();

        int[] calInput = remainder.calculation(input);

        int output = remainder.judgment(calInput);

        Assert.assertEquals(output,1);
    }

    @Test
    public void testThree(){
        int[] input = new int[]{
                39,
                40,
                41,
                42,
                43,
                44,
                82,
                83,
                84,
                85
        };

        Remainder remainder = new Remainder();

        int[] calInput = remainder.calculation(input);

        int output = remainder.judgment(calInput);

        Assert.assertEquals(output,6);

    }

}
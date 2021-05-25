package algorithm.five;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumValueTest {

    @Test
    public void testOne(){
        String[] input = new String[]{"3", "29", "38", "12", "57", "74", "40", "85", "61"};

        MaximumValue maximumValue = new MaximumValue();

        int[] output = maximumValue.process(input);

        Assert.assertEquals(output[0],85);
        Assert.assertEquals(output[1],8);
    }
}
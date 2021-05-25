package algorithm.three;

import org.junit.Assert;
import org.junit.Test;

import javax.naming.ldap.Rdn;

import static org.junit.Assert.*;

public class ReduceSumTest {
    @Test
    public void testOne(){
        ReduceSum reduceSum = new ReduceSum();

        int input = 3;

        int output = reduceSum.sumFromInputNumber(input);

        Assert.assertEquals(output,6);
    }

}
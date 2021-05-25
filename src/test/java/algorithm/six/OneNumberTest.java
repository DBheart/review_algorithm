package algorithm.six;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OneNumberTest {

    @Test
    public void testOne(){
        int input = 100;

        OneNumber oneNumber = new OneNumber();
        int output = oneNumber.calulator(input);

        Assert.assertEquals(output,99);
    }
    @Test
    public void testTwo(){
        int input = 1;

        OneNumber oneNumber = new OneNumber();
        int output = oneNumber.calulator(input);

        Assert.assertEquals(output,1);
    }
    @Test
    public void testThree(){
        int input = 210;

        OneNumber oneNumber = new OneNumber();
        int output = oneNumber.calulator(input);

        Assert.assertEquals(output,105);
    }
    @Test
    public void testFour(){
        int input = 1000;

        OneNumber oneNumber = new OneNumber();
        int output = oneNumber.calulator(input);

        Assert.assertEquals(output,144);
    }

}
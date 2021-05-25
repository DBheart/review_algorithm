package algorithm.six;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

//TODO 무한수열
public class SelfNumberTest {
    @Test
    public void testOne(){
        int n = 10000;

        SelfNumber selfNumber = new SelfNumber();
        Map<Integer, List<Integer>> calNumber = selfNumber.calculate(n);

        Integer[] output = selfNumber.jegment(calNumber,n);

//        Assert.assertEquals(output[0],1);
//        Assert.assertEquals(output[1],3);
//        Assert.assertEquals(output[2],5);
//        Assert.assertEquals(output[3],7);
//        Assert.assertEquals(output[4],9);
//        Assert.assertEquals(output[5],20);
//        Assert.assertEquals(output[6],31);
//        Assert.assertEquals(output[7],42);
//        Assert.assertEquals(output[8],53);
//        Assert.assertEquals(output[9],64);
//        Assert.assertEquals(output[10],75);
//        Assert.assertEquals(output[11],86);
//        Assert.assertEquals(output[12],97);
    }

}
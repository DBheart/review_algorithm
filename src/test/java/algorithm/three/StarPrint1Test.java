package algorithm.three;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StarPrint1Test
{

    @Test
    public void testOne(){
        StarPrint1 starPrint1 = new StarPrint1();

        int input = 5;

        String[] output = starPrint1.process(input);

        Assert.assertEquals(output,new String[]{"*","**","***","****","*****"});

    }
}
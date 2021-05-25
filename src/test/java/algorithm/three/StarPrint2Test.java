package algorithm.three;

import org.junit.Assert;
import org.junit.Test;

public class StarPrint2Test
{

    @Test
    public void testOne(){
        StarPrint2 starPrint2 = new StarPrint2();

        int input = 5;

        String[] output = starPrint2.process(input);

        Assert.assertEquals(output,new String[]{"    *","   **","  ***"," ****","*****"});

    }
}
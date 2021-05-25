package algorithm.three;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationTableTest {

    @Test
    public void testOne(){
        MultiplicationTable multiplicationTable = new MultiplicationTable();

        int intput = 2;

        int[] output = multiplicationTable.process(intput);

        for(int i= 0;i<output.length;i++){
            int multiplNumber = i + 1;
            Assert.assertEquals(output[i],2 * multiplNumber);
        }
    }

}
package algorithm.four;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlusCycleTest {
    @Test
    public void testOne(){
        int N = 26;
        PlusCycle plusCycle = new PlusCycle();
        String parseN = plusCycle.paserInput(N);

        int cycelCount = plusCycle.process(parseN);

        Assert.assertEquals(cycelCount,4);
    }

    @Test
    public void testTwo(){
        int N = 55;
        PlusCycle plusCycle = new PlusCycle();
        String parseN = plusCycle.paserInput(N);
        int cycleCount = plusCycle.process(parseN);
        Assert.assertEquals(cycleCount,3);
    }

    @Test
    public void testThree(){
        int N = 1;
        PlusCycle plusCycle = new PlusCycle();
        String parseN = plusCycle.paserInput(N);
        int cycleCount = plusCycle.process(parseN);
        Assert.assertEquals(cycleCount,60);
    }

    @Test
    public void testFour(){
        int N = 0;
        PlusCycle plusCycle = new PlusCycle();
        String parseN = plusCycle.paserInput(N);
        int cycleCount = plusCycle.process(parseN);
        Assert.assertEquals(cycleCount,1);
    }

}
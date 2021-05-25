package algorithm.three;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ABFastTest {

    @Test
    public void testOne(){
        String input = "1 1";

        ABFast abFast = new ABFast();
        int[] parseInput = abFast.parse(input);
        int output = parseInput[0] + parseInput[1];
        Assert.assertEquals(output,2);
    }
    @Test
    public void testTwo(){
        String input = "12 34";

        ABFast abFast = new ABFast();
        int[] parseInput = abFast.parse(input);
        int output = parseInput[0] + parseInput[1];
        Assert.assertEquals(output,46);
    }
    @Test
    public void testThree(){
        String input = "5 500";

        ABFast abFast = new ABFast();
        int[] parseInput = abFast.parse(input);
        int output = parseInput[0] + parseInput[1];
        Assert.assertEquals(output,505);
    }
    @Test
    public void testFour(){
        String input = "40 60";

        ABFast abFast = new ABFast();
        int[] parseInput = abFast.parse(input);
        int output = parseInput[0] + parseInput[1];
        Assert.assertEquals(output,100);
    }
    @Test
    public void testFive(){
        String input = "1000 1000";

        ABFast abFast = new ABFast();
        int[] parseInput = abFast.parse(input);
        int output = parseInput[0] + parseInput[1];
        Assert.assertEquals(output,2000);
    }



}
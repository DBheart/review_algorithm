package algorithm.five;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

//TODO 자릿수를 섞어 쓰지 말자. double와 int를 비교하니까 비교가 안되고 넘어가서 오류가 많이 났다.
public class OverAverageTest {
    @Test
    public void testOne(){
        String input = "5 50 50 70 80 100";

        OverAverage overAverage = new OverAverage();

        String[] parseInput = overAverage.parse(input);

        double overAverageRate = overAverage.jegment(parseInput);

        Assert.assertEquals(overAverageRate,40.000,3);
    }
    @Test
    public void testTwo(){
        String input = "7 100 95 90 80 70 60 50";

        OverAverage overAverage = new OverAverage();

        String[] parseInput = overAverage.parse(input);

        double overAverageRate = overAverage.jegment(parseInput);

        Assert.assertEquals(overAverageRate,57.143,3);
    }
    @Test
    public void testThree(){
        String input = "3 70 90 80";

        OverAverage overAverage = new OverAverage();

        String[] parseInput = overAverage.parse(input);

        double overAverageRate = overAverage.jegment(parseInput);

        Assert.assertEquals(overAverageRate,33.333,3);
    }
    @Test
    public void testFour(){
        String input = "3 70 90 81";

        OverAverage overAverage = new OverAverage();

        String[] parseInput = overAverage.parse(input);

        double overAverageRate = overAverage.jegment(parseInput);

        Assert.assertEquals(overAverageRate,66.667,3);
    }

    //TODO 틀렸네? 반올림.. 하
    @Test
    public void testFive(){
        String input = "9 100 99 98 97 96 95 94 93 91";

        OverAverage overAverage = new OverAverage();

        String[] parseInput = overAverage.parse(input);

        double overAverageRate = overAverage.jegment(parseInput);

        Assert.assertEquals(overAverageRate,55.556,3);
    }

}
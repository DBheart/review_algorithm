package algorithm.five;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AverageTest {
    @Test
    public void testOne(){
        int inputCount = 3;
        int[] score = new int[]{40,80,60};

        Average average = new Average();
        double[] calScore = average.calculate(score,inputCount);

        double output = average.jegment(calScore,inputCount);

        Assert.assertEquals(output,75.0,2);
    }

    @Test
    public void testTwo(){
        int inputCount = 3;
        int[] score  = new int[]{10,20,30};

        Average average = new Average();
        double[] calScore = average.calculate(score,inputCount);

        double output = average.jegment(calScore,inputCount);

        Assert.assertEquals(output,66.666667,6);
    }

    @Test
    public void testThree(){
        int inputCount = 4;
        int[] score = new int[]{1, 100, 100, 100};

        Average average = new Average();
        double[] calScore = average.calculate(score,inputCount);

        double output = average.jegment(calScore,inputCount);

        Assert.assertEquals(output,75.25,2);
    }

    @Test
    public void testFour(){
        int inputCount = 5;
        int[] score = new int[]{1, 2, 4, 8, 16};

        Average average = new Average();
        double[] calScore = average.calculate(score,inputCount);

        double output = average.jegment(calScore,inputCount);

        Assert.assertEquals(output,38.75,2);
    }

    @Test
    public void testFive(){
        int inputCount = 2;
        int[] score = new int[]{3,10};

        Average average = new Average();
        double[] calScore = average.calculate(score,inputCount);

        double output = average.jegment(calScore,inputCount);

        Assert.assertEquals(output,65.0,1);
    }

}
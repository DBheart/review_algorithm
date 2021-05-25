package algorithm.five;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OXQuizTest {

    @Test
    public void testOne(){
        String input = "OOXXOXXOOO";
        OXQuiz oxQuiz = new OXQuiz();
        String[] parseInput = oxQuiz.parse(input);

        int output = oxQuiz.process(parseInput);

        Assert.assertEquals(output,10);

    }
    @Test
    public void testTwo(){
        String input = "OOXXOOXXOO";
        OXQuiz oxQuiz = new OXQuiz();

        String[] parseInput = oxQuiz.parse(input);

        int output = oxQuiz.process(parseInput);

        Assert.assertEquals(output,9);

    }
    @Test
    public void testThree(){
        String input = "OXOXOXOXOXOXOX";
        OXQuiz oxQuiz = new OXQuiz();

        String[] parseInput = oxQuiz.parse(input);

        int output = oxQuiz.process(parseInput);

        Assert.assertEquals(output,7);

    }
    @Test
    public void testFour(){
        String input = "OOOOOOOOOO";
        OXQuiz oxQuiz = new OXQuiz();

        String[] parseInput = oxQuiz.parse(input);

        int output = oxQuiz.process(parseInput);

        Assert.assertEquals(output,55);

    }
    @Test
    public void testFive(){
        String input = "OOOOXOOOOXOOOOX";
        OXQuiz oxQuiz = new OXQuiz();

        String[] parseInput = oxQuiz.parse(input);

        int output = oxQuiz.process(parseInput);

        Assert.assertEquals(output,30);

    }

}
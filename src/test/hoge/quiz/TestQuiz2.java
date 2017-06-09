package hoge.quiz;

import static java.util.Arrays.asList;

import org.junit.Assert;
import org.junit.Test;

public class TestQuiz2 {

    @Test
    public void test6() {
        // StringUtils.isBlank()
        Assert.assertEquals(true, StringUtils.isBlank(null));
        Assert.assertEquals(true, StringUtils.isBlank(""));
        Assert.assertEquals(false, StringUtils.isBlank("bob"));
        Assert.assertEquals(true, StringUtils.isBlank(" "));
        Assert.assertEquals(false, StringUtils.isBlank(" bob "));
        Assert.assertEquals(true, StringUtils.isBlank("  "));
        Assert.assertEquals(false, StringUtils.isBlank("　bob　"));
        Assert.assertEquals(true, StringUtils.isBlank("　"));
        Assert.assertEquals(false, StringUtils.isBlank("　bob　"));
    }

    @Test
    public void test7() {
        // StringUtils.indexOf()
        Assert.assertEquals(-1, StringUtils.indexOf(null, 'a'));
        Assert.assertEquals(-1, StringUtils.indexOf("", 'b'));
        Assert.assertEquals(0, StringUtils.indexOf("aabaabaa", 'a'));
        Assert.assertEquals(2, StringUtils.indexOf("aabaabaa", 'b'));
    }

    @Test
    public void test8() {
        // StringUtils.defaultString()
        Assert.assertEquals("", StringUtils.defaultString(null));
        Assert.assertEquals("", StringUtils.defaultString(""));
        Assert.assertEquals("bat", StringUtils.defaultString("bat"));
    }

    @Test
    public void test9() {
        // StringUtils.defaultString()
        Assert.assertEquals("NULL", StringUtils.defaultString(null, "NULL"));
        Assert.assertEquals("", StringUtils.defaultString("", "NULL"));
        Assert.assertEquals("bat", StringUtils.defaultString("bat", "NULL"));
    }

    @Test
    public void test10() {
        // StringUtils.length()
        Assert.assertEquals(0, StringUtils.length(null));
        Assert.assertEquals(0, StringUtils.length(""));
        Assert.assertEquals(5, StringUtils.length("abcde"));
    }

    @Test
    public void test11() {
        // StringUtils.substring()
        Assert.assertEquals(null, StringUtils.substring(null, 0));
        Assert.assertEquals("", StringUtils.substring("", 0));
        Assert.assertEquals("abc", StringUtils.substring("abc", 0));
        Assert.assertEquals("c", StringUtils.substring("abc", 2));
        Assert.assertEquals("", StringUtils.substring("abc", 4));
        Assert.assertEquals("bc", StringUtils.substring("abc", -2));
        Assert.assertEquals("abc", StringUtils.substring("abc", -4));
    }

    @Test
    public void test12() {
        // StringUtils.substring()
        Assert.assertEquals(null, StringUtils.substring(null, 0, 0));
        Assert.assertEquals("", StringUtils.substring("", 0 ,  0));
        Assert.assertEquals("ab", StringUtils.substring("abc", 0, 2));
        Assert.assertEquals("", StringUtils.substring("abc", 2, 0));
        Assert.assertEquals("c", StringUtils.substring("abc", 2, 4));
        Assert.assertEquals("", StringUtils.substring("abc", 4, 6));
        Assert.assertEquals("", StringUtils.substring("abc", 2, 2));
        Assert.assertEquals("b", StringUtils.substring("abc", -2, -1));
        Assert.assertEquals("ab", StringUtils.substring("abc", -4, 2));
    }

    @Test
    public void test13() {
        // StringUtils.replace()
        Assert.assertEquals(null, StringUtils.replace(null, "", ""));
        Assert.assertEquals("", StringUtils.replace("", "", ""));
        Assert.assertEquals("aba", StringUtils.replace("aba", "a", null));
        Assert.assertEquals("b", StringUtils.replace("aba", "a", ""));
        Assert.assertEquals("zbz", StringUtils.replace("aba", "a", "z"));
    }

}

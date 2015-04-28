package hoge.quiz;

import static java.util.Arrays.asList;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestQuiz {

	@Test
	public void test1() {
		// distinct
		Assert.assertEquals(null, StringUtils.distinct(null));
		Assert.assertEquals(asList("blue", "red", "black"),
				StringUtils.distinct(asList("blue", "red", "black", "blue")));
	}

	@Test
	public void test2() {
		// distinct
		Assert.assertEquals(null, StringUtils.distinct(null));
		Assert.assertEquals(asList("blue", "red", "black"),
				StringUtils.distinct(asList("blue", "red", "black", "blue")));
	}
}

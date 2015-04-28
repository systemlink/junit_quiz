package hoge.quiz;

import static java.util.Arrays.asList;

import org.junit.Assert;
import org.junit.Test;

public class TestQuiz {
	@Test
	public void test1() {
		// 曜日
		Assert.assertEquals("", DateUtils.toDayOfWeekForJapanese(0));
		Assert.assertEquals("日", DateUtils.toDayOfWeekForJapanese(1));
		Assert.assertEquals("月", DateUtils.toDayOfWeekForJapanese(2));
		Assert.assertEquals("火", DateUtils.toDayOfWeekForJapanese(3));
		Assert.assertEquals("水", DateUtils.toDayOfWeekForJapanese(4));
		Assert.assertEquals("木", DateUtils.toDayOfWeekForJapanese(5));
		Assert.assertEquals("金", DateUtils.toDayOfWeekForJapanese(6));
		Assert.assertEquals("土", DateUtils.toDayOfWeekForJapanese(7));
		Assert.assertEquals("", DateUtils.toDayOfWeekForJapanese(8));
	}

	@Test
	public void test2() {
		// 曜日 (例外処理）
		Assert.assertEquals("日", DateUtils.toDayOfWeekForJapaneseThrowsException(1));
		Assert.assertEquals("月", DateUtils.toDayOfWeekForJapaneseThrowsException(2));
		Assert.assertEquals("火", DateUtils.toDayOfWeekForJapaneseThrowsException(3));
		Assert.assertEquals("水", DateUtils.toDayOfWeekForJapaneseThrowsException(4));
		Assert.assertEquals("木", DateUtils.toDayOfWeekForJapaneseThrowsException(5));
		Assert.assertEquals("金", DateUtils.toDayOfWeekForJapaneseThrowsException(6));
		Assert.assertEquals("土", DateUtils.toDayOfWeekForJapaneseThrowsException(7));
		try {
			DateUtils.toDayOfWeekForJapaneseThrowsException(8);
			Assert.fail();
		} catch (IllegalArgumentException e) {
			Assert.assertEquals("引数に1-7の数字を指定してください。指定値=8", e.getMessage());
		}
	}

	@Test
	public void test3() {
		// StringUtils.distinct()
		Assert.assertEquals(null, StringUtils.distinct(null));
		Assert.assertEquals(asList("blue", "red", "black"), StringUtils.distinct(asList("blue", "red", "black", "blue")));
	}

	@Test
	public void test4() {
		// ArrayUtils.equals()
		Assert.assertFalse(ArrayUtils.equals(null, null));
		Assert.assertFalse(ArrayUtils.equals(asList("1", "2", "3"), null));
		Assert.assertFalse(ArrayUtils.equals(null, asList("1", "2", "3")));
		Assert.assertFalse(ArrayUtils.equals(asList("1", "2", "3"), asList("1")));
		Assert.assertFalse(ArrayUtils.equals(asList("1"), asList("1", "2", "3")));
		Assert.assertTrue(ArrayUtils.equals(asList("1", "2", "3"), asList("1", "2", "3")));
	}

	@Test
	public void test5() {
		// ArrayUtils.contains()
		Assert.assertFalse(ArrayUtils.contains(null, null));
		Assert.assertFalse(ArrayUtils.contains(asList("1", "2", "3"), null));
		Assert.assertFalse(ArrayUtils.contains(null, asList("1", "2", "3")));
		Assert.assertTrue(ArrayUtils.contains(asList("1", "2", "3"), asList("1")));
		Assert.assertFalse(ArrayUtils.contains(asList("1"), asList("1", "2", "3")));
		Assert.assertTrue(ArrayUtils.contains(asList("1", "2", "3"), asList("1", "2", "3")));
	}
}

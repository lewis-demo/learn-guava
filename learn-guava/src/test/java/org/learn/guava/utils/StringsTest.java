package org.learn.guava.utils;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.google.common.base.Strings;

/**
 * Test for Strings
 * 
 * @author lewis007
 * @since 1.0
 * @see com.google.common.base.Strings
 */
public class StringsTest {
	@Rule
	public ExpectedException expected = ExpectedException.none();

	@Test
	public void nullToEmpty() {
		Assert.assertEquals(Strings.nullToEmpty(null), "");
		Assert.assertEquals(Strings.nullToEmpty(""), "");
		Assert.assertEquals(Strings.nullToEmpty(" "), " ");
		Assert.assertEquals(Strings.nullToEmpty("test"), "test");
		Assert.assertEquals(Strings.nullToEmpty(" test "), " test ");

		Assert.assertNotEquals(Strings.nullToEmpty(" "), "");
		Assert.assertNotEquals(Strings.nullToEmpty(" test"), "test");
		Assert.assertNotEquals(Strings.nullToEmpty("test "), "test");
		Assert.assertNotEquals(Strings.nullToEmpty(" test "), "test");
	}

	@Test
	public void emptyToNull() {
		Assert.assertNull(Strings.emptyToNull(""));

		Assert.assertNotNull(Strings.emptyToNull(" "));
		Assert.assertNotNull(Strings.emptyToNull("test"));
	}

	@Test
	public void isNullOrEmpty() {
		Assert.assertEquals(Strings.isNullOrEmpty(null), true);
		Assert.assertEquals(Strings.isNullOrEmpty(""), true);

		Assert.assertEquals(Strings.isNullOrEmpty(" "), false);
		Assert.assertEquals(Strings.isNullOrEmpty("test"), false);
	}

	@Test
	public void padStart() {
		Assert.assertEquals(Strings.padStart("", 5, '-'), "-----");

		Assert.assertEquals(Strings.padStart("test", 5, '-'), "-test");
		Assert.assertNotEquals(Strings.padStart("test", 5, '-'), "-----test");

		Assert.assertEquals(Strings.padStart("test", 3, '-'), "test");
		Assert.assertNotEquals(Strings.padStart("test", 3, '-'), "tes");
		Assert.assertNotEquals(Strings.padStart("test", 3, '-'), "est");

		// 参数异常
		Assert.assertEquals(Strings.padStart("", 0, '-'), "");
		Assert.assertEquals(Strings.padStart("", -1, '-'), "");
		Assert.assertEquals(Strings.padStart("test", 5, ' '), " test");
	}

	@Test(expected = NullPointerException.class)
	public void padStartException() {
		Strings.padStart(null, 5, '-');
	}

	@Test
	public void padStartRule() {
		expected.expect(NullPointerException.class);
		Strings.padStart(null, 5, '-');
	}

	@Test
	public void padEnd() {
		Assert.assertEquals(Strings.padEnd("", 5, '-'), "-----");

		Assert.assertEquals(Strings.padEnd("test", 5, '-'), "test-");
		Assert.assertNotEquals(Strings.padEnd("test", 5, '-'), "test-----");

		Assert.assertEquals(Strings.padEnd("test", 3, '-'), "test");
		Assert.assertNotEquals(Strings.padEnd("test", 3, '-'), "tes");
		Assert.assertNotEquals(Strings.padEnd("test", 3, '-'), "est");

		// 参数异常
		Assert.assertEquals(Strings.padEnd("", 0, '-'), "");
		Assert.assertEquals(Strings.padEnd("", -1, '-'), "");
		Assert.assertEquals(Strings.padEnd("test", 5, ' '), "test ");
	}

	@Test(expected = NullPointerException.class)
	public void padEndException() {
		Strings.padEnd(null, 5, '-');
	}

	@Test
	public void padEndRule() {
		expected.expect(NullPointerException.class);
		Strings.padEnd(null, 5, '-');
	}
}

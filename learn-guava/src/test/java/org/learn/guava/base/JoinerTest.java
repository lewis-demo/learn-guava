package org.learn.guava.base;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

/**
 * Test for Joiner.
 * 
 * @author lewis007
 * @since 1.0
 * @see com.google.common.base.Joiner
 */
public class JoinerTest {
	@Test
	public void join() {
		Assert.assertEquals(Joiner.on(",").join(1, 2, 3, 4, 5), "1,2,3,4,5");
		Assert.assertEquals(Joiner.on(",").join(1, 2, 3, 4, 5.0d), "1,2,3,4,5.0");

		List<Object> list = Lists.newArrayList(1, 2, 3, 4, 5);
		Assert.assertEquals(Joiner.on(",").join(list), "1,2,3,4,5");
	}

	@Test
	public void joinSkipNulls() {
		Assert.assertEquals(Joiner.on(",").skipNulls().join(1, null, 2, 3, 4, 5), "1,2,3,4,5");

		List<Object> list = Lists.newArrayList(1, null, 2, 3, 4, 5);
		Assert.assertEquals(Joiner.on(",").skipNulls().join(list), "1,2,3,4,5");
	}

	@Test
	public void joinUseForNull() {
		Assert.assertEquals(Joiner.on(",").useForNull("-").join(1, null, 2, 3, 4, 5), "1,-,2,3,4,5");

		List<Object> list = Lists.newArrayList(1, null, 2, 3, 4, 5);
		Assert.assertEquals(Joiner.on(",").useForNull("-").join(list), "1,-,2,3,4,5");
	}

	@Test
	public void appendTo() {
		StringBuilder builder = new StringBuilder();
		Joiner.on(",").skipNulls().appendTo(builder, 1, 2, 3, 4, 5);
		Assert.assertEquals(builder.toString(), "1,2,3,4,5");

		Joiner.on("-").skipNulls().appendTo(builder, 6, 7, 8, 9);
		Assert.assertEquals(builder.toString(), "1,2,3,4,56-7-8-9");
	}

	@Test
	public void mapJoiner() {
		String expectedString = "Washington D.C=Redskins#New York City=Giants#Philadelphia=Eagles#Dallas=Cowboys";

		Map<String, String> testMap = Maps.newLinkedHashMap();
		testMap.put("Washington D.C", "Redskins");
		testMap.put("New York City", "Giants");
		testMap.put("Philadelphia", "Eagles");
		testMap.put("Dallas", "Cowboys");
		String returnedString = Joiner.on("#").withKeyValueSeparator("=").join(testMap);

		Assert.assertEquals(returnedString, expectedString);
	}
}

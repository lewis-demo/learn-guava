package org.learn.guava.base;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

/**
 * Test for Joiner
 * 
 * @author lewis007
 * @since 1.0
 * @see com.google.common.base.Joiner
 */
public class JoinerTest {
	@Test
	public void join() {
		Assert.assertEquals(Joiner.on(",").skipNulls().join(1, null, 2, 3, 4, 5), "1,2,3,4,5");

		List<Object> list1 = Lists.newArrayList(1, 2, 3, 4, 5);
		Assert.assertEquals(Joiner.on(",").skipNulls().join(list1), "1,2,3,4,5");

		List<Object> list2 = Lists.newArrayList(1, null, 2, 3, 4, 5);
		Assert.assertEquals(Joiner.on(",").skipNulls().join(list2), "1,2,3,4,5");

		List<Object> list3 = Lists.newArrayList(1, null, 2, 3, 4, 5);
		Assert.assertEquals(Joiner.on(",").useForNull("-").join(list3), "1,-,2,3,4,5");
	}
}

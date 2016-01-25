package org.learn.guava.base;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

/**
 * Test for Splitter.
 * 
 * @author lewis007
 * @since 1.0.0
 * @see com.google.common.base.Splitter
 */
public class SplitterTest {
	@Test
	public void split() {
		List<String> list = Splitter.on(",").trimResults().splitToList("1, 2, 3, 4, 5,");
		Assert.assertEquals(list, Lists.newArrayList("1", "2", "3", "4", "5", ""));
	}

	@Test
	public void splitTrimResults() {
		List<String> list = Splitter.on(",").trimResults(CharMatcher.is('-')).splitToList("1,-2,-3,-4,-5,");
		Assert.assertEquals(list, Lists.newArrayList("1", "2", "3", "4", "5", ""));
	}

	@Test
	public void splitTrimResults2() {
		List<String> list = Splitter.on(",").trimResults(CharMatcher.is('-')).splitToList(" 1,-2,-3,-4,-5,");
		Assert.assertEquals(list, Lists.newArrayList(" 1", "2", "3", "4", "5", ""));
	}

	@Test
	public void mapSpiltter() {
		Map<String, String> testMap = Maps.newLinkedHashMap();
		testMap.put("Washington D.C", "Redskins");
		testMap.put("New York City", "Giants");
		testMap.put("Philadelphia", "Eagles");
		testMap.put("Dallas", "Cowboys");

		String startString = "Washington D.C=Redskins#New York City=Giants#Philadelphia=Eagles#Dallas=Cowboys";
		Splitter.MapSplitter mapSplitter = Splitter.on("#").withKeyValueSeparator("=");
		Map<String, String> splitMap = mapSplitter.split(startString);

		Assert.assertEquals(splitMap, testMap);
	}
}

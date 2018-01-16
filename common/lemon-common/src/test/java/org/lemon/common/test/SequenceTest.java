package org.lemon.common.test;

import org.junit.Test;

import com.lemon.common.util.sequence.Sequence;

/**
 * 
 * @author jiangqk
 * @data 2018年1月8日 下午5:22:58
 */

public class SequenceTest {
	
	@Test
	public void execute() {
		Sequence sequence = new Sequence(30,23);
		System.out.println(sequence.nextId());
	}
}

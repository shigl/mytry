package com.imooc.ioc.interfaces;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.ioc.base.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestOneInterface extends UnitTestBase{
	public TestOneInterface(){
		super("classpath*:spring-ioc.xml");
	}
	
	@Test
	public void testHello(){
		OneInterface ofi = super.getBean("oneInterface");
		System.out.println(ofi.hello("我的输入参数"));
	}
}

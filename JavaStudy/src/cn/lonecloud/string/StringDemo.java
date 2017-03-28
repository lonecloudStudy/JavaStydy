package cn.lonecloud.string;

import org.junit.Test;

public class StringDemo {
	
	/**
	 * String.intern()的方法的作用是返回字符串对象的规范化表示形式
	 * 如果这个常量池中有这个类型的常量则直接返回
	 * @Description:
	 */
	@Test
	public void testIntern(){
		String str="1111";
		System.out.println(str.intern());
		String str2=new String("1111").intern();
		System.out.println(str2==str);
	}
}

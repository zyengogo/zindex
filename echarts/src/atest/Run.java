package atest;

import atest.bar.BarTest1;
import atest.bar.BarTest12;
import atest.bar.BarTest14;
import atest.bar.BarTest4;

public class Run {

	/** 
	 * 
	 * @author ZhaoYongEn.zhaoye@strongit.com.cn
	 * 2016-6-29 上午9:40:44 
	 * @param args 
	 */
	public static void main(String[] args) {
		BarTest1 b=new BarTest1();
		BarTest12 b12=new BarTest12();
		BarTest14 b14=new BarTest14();
		BarTest4 b4=new BarTest4();
		b.test();
		b12.test();
		b14.test();
		b4.test();

	}

}

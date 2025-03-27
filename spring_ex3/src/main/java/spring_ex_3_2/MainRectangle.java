package spring_ex_3_2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainRectangle {
	public static void main(String[] args) {
		String configLoc = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);

		MyRectangle myrectangle = ctx.getBean("myrectangle", MyRectangle.class);
		myrectangle.area();
		
	}
}

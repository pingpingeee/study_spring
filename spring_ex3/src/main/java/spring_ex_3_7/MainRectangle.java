package spring_ex_3_7;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainRectangle {
	public static void main(String[] args) {
		String configLoc = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);

		MyRectangle myRectangle = ctx.getBean("myRectangle", MyRectangle.class);
		myRectangle.process();
	}
}

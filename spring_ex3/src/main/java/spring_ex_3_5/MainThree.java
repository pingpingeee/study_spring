package spring_ex_3_5;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainThree {
	public static void main(String[] args) {
		String configLoc = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);

		MyThree myThree = ctx.getBean("myThree", MyThree.class);
		myThree.process();
	}
}

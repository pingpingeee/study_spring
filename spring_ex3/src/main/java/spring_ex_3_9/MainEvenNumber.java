package spring_ex_3_9;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainEvenNumber {
	public static void main(String[] args) {
		String configLoc = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);

		MyEvenNumber meEvenNumber = ctx.getBean("meEvenNumber", MyEvenNumber.class);
		meEvenNumber.process();
	}
}

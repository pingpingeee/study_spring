package spring_ex_6_5;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class MainNasdaq {
	public static void main(String[] args) {

		String configLoc = "classpath:applicationCTX.xml";
		String configLoc2 = "classpath:applicationCTX2.xml";

		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc, configLoc2);

		Nasdaq nasdaq1 = ctx.getBean("nasdaq1", Nasdaq.class);
		System.out.println(nasdaq1.getStock());
		System.out.println(nasdaq1.getCapRank());
		System.out.println(nasdaq1.getProduct());
		System.out.println("===========================");

		NasdaqInfo nasdaqInfo = ctx.getBean("nasdaqInfo", NasdaqInfo.class);
		Nasdaq nasdaq2 = nasdaqInfo.getNasdaq();
		System.out.println(nasdaq2.getStock());
		System.out.println(nasdaq2.getCapRank());
		System.out.println(nasdaq2.getProduct());
		System.out.println("===========================");

		Nasdaq nasdaq3 = ctx.getBean("nasdaq3", Nasdaq.class);
		System.out.println(nasdaq3.getStock());
		System.out.println(nasdaq3.getCapRank());
		System.out.println(nasdaq3.getProduct());

	}
}

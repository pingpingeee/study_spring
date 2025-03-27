package spring_ex_5_1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainCircle {
	public static void main(String[] args) {
		String configLoc = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);

		CircleInfo circleInfo = ctx.getBean("circleInfo", CircleInfo.class);
		circleInfo.getCircleInfo();

		Circle circle = ctx.getBean("circle2", Circle.class);
		circleInfo.setCircle(circle);

		circleInfo.getCircleInfo();

		ctx.close();
	}

}

package com.greenfox.pkrisz0.colors;

import com.greenfox.pkrisz0.colors.config.ColorConfig;
import com.greenfox.pkrisz0.colors.model.RedColor;
import com.greenfox.pkrisz0.colors.model.YellowColor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ColorsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ColorConfig.class);

		RedColor redColor = ctx.getBean(RedColor.class);
		YellowColor yellowColor = ctx.getBean(YellowColor.class);

		redColor.printColor();
		yellowColor.printColor();
	}
}

package com.ratel.learn.lifeCycleCallback;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author ratel
 * @date 2020/8/17
 */
public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.start();
//		可以获取环境变量
		ConfigurableEnvironment environment = context.getEnvironment();
//		指定当前运行环境
		environment.setActiveProfiles("dev");
		context.register(AppConfiguration.class);
//		context.scan("com.ratel.learn.lifeCycleCallback");
		TestProtoType bean = context.getBean(TestProtoType.class);
		System.out.println(bean.javaBean());
		System.out.println(bean.javaBean());
		context.stop();
//		context.close();
	}
}

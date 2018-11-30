package com.lms.learn;

import com.lms.learn.event.MyEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 其中@Configuration  @EnableAutoConfiguration @ComponentScan
 * 上面三个注解功能等价于SpringBootApplication
 */
@ServletComponentScan
@SpringBootApplication
public class LearnApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnApplication.class, args);
		//注册监听器
		//context.addApplicationListener(new MyListener());
		//context.addApplicationListener(new MyListenerTwo());
		//测试发布事件
		context.publishEvent(new MyEvent("测试事件"));
	}

	/**
	 * 为了打包springboot项目
	 * @param builder
	 * @return
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(this.getClass());
	}
}

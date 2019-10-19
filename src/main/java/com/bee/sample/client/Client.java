package com.bee.sample.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bee.sample.service.UserClientService;


/**
 * 
 * Spring的解耦策略：使用配置文件解耦类之间的关系——控制反转
 * 下一个问题：spring 如何建立对象间的关系---依赖注入？
 * @author hhluci
 *
 */
public class Client {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		
		UserClientService userClientService = ac.getBean("userClientService") instanceof UserClientService? 
				(UserClientService)ac.getBean("userClientService"):null;

		userClientService.saveCustom();
	}

}

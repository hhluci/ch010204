package com.bee.sample.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bee.sample.service.UserClientService;


/**
 * 
 * Spring�Ľ�����ԣ�ʹ�������ļ�������֮��Ĺ�ϵ�������Ʒ�ת
 * ��һ�����⣺spring ��ν��������Ĺ�ϵ---����ע�룿
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

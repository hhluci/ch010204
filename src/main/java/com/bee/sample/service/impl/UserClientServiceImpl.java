package com.bee.sample.service.impl;

import com.bee.sample.dao.UserClientDao;
import com.bee.sample.dao.impl.UserClientDaoImpl;
import com.bee.sample.service.UserClientService;

public class UserClientServiceImpl implements UserClientService {

	public UserClientServiceImpl() {
		System.out.println("正在调用构造方法:"+this.getClass().getName());
	}
	
	@Override
	public void saveCustom() {
		

		System.out.println("正在调用:"+this.getClass().getName());
		UserClientDao userClientDao = new UserClientDaoImpl();
		userClientDao.saveCustom();
	}

}

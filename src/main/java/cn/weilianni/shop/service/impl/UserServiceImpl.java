package cn.weilianni.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.weilianni.shop.dao.UserDao;
import cn.weilianni.shop.model.User;
import cn.weilianni.shop.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public User getUser() {
		return userDao.getUser();
	}

}

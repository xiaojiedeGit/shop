package cn.weilianni.shop.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.weilianni.shop.model.User;
import cn.weilianni.shop.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration({"classpath:applicationContext.xml"})
public class IUserServiceTest {

	
	@Autowired
	public UserService service;
	
	@Test
	public void getUserTest() {
		User user=service.getUser();
		System.out.println(user.toString());
	}
}

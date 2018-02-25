package com.ssm.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.model.User;
import com.ssm.server.UserService;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:application-context.xml"})
public class UserServerTest {
	@Autowired
    public UserService userService;
    
    @Test
    public void getUserByIdTest(){
    	try {
    		Map<String,Object> queryMap = new HashMap<String,Object>();
    		queryMap.put("userName", "管理员");
    		List<User> userList = userService.getUserList(queryMap);
    		System.out.println(userList.get(0).toString());
    		System.out.println(userList.get(0).toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}

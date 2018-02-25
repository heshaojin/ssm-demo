package com.ssm.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssm.model.User;
import com.ssm.server.UserService;

public class UserServiceTest2 {

	public static void main(String[] args) {
        ApplicationContext application = new ClassPathXmlApplicationContext("application-context.xml");
        UserService service = (UserService) application.getBean("userService");
        Map<String,Object> queryMap = new HashMap<String,Object>();
    	queryMap.put("userName", "管理员");
        List<User> userList = service.getUserList(queryMap);
        System.out.println(userList.get(0).toString());
    }
}

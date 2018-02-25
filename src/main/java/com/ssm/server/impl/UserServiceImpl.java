package com.ssm.server.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.dao.UserMapper;
import com.ssm.model.User;
import com.ssm.server.UserService;

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMpper;

	@Override
	public List<User> getUserList(Map<String, Object> map) {
		return userMpper.queryList(map);
	}

}

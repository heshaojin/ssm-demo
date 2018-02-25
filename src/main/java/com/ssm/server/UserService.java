package com.ssm.server;

import java.util.List;
import java.util.Map;

import com.ssm.model.User;

public interface UserService {

	List<User> getUserList(Map<String,Object> map);
}

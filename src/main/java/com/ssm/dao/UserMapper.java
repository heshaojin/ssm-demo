package com.ssm.dao;

import java.util.List;
import java.util.Map;

import com.ssm.model.User;

public interface UserMapper {
	
	List<User> queryList(Map<String,Object> queryMap);
	
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
package com.jpa02.service;

import com.jpa02.entity.UserInfo;

public interface UserInfoService extends BaseService<UserInfo,Long>{
	
	boolean login(String loginName,String password);

}

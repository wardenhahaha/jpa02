package com.jpa02.repository;

import com.jpa02.entity.UserInfo;

public interface UserInfoRepository extends BaseDao<UserInfo,Long>{

	UserInfo findByLoginName(String loginName);
	
}

package com.jpa02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.jpa02.entity.UserInfo;
import com.jpa02.repository.UserInfoRepository;

@Service
public class UserInfoServiceImpl implements UserInfoService{

	@Autowired
	private UserInfoRepository userInfoRepository;
	
	@Override
	public JpaRepository<UserInfo, Long> getRepository() {
		// TODO Auto-generated method stub
		return userInfoRepository;
	}

	@Override
	public boolean login(String loginName, String password) {
		// TODO Auto-generated method stub
		UserInfo userInfo=userInfoRepository.findByLoginName(loginName);
		if(password!=null&&password.equals(userInfo.getPassword())) {
			return true;
		}
		return false;
	}
	
}

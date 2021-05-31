package com.jpa02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jpa02.common.ResultCommon;
import com.jpa02.entity.UserInfo;
import com.jpa02.service.UserInfoService;
import com.jpa02.util.ResultUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags= {"UserInfoController"})
@RequestMapping("/api/userInfo")
public class UserInfoController {

	@Autowired
	private UserInfoService userInfoService;
	
	@ApiOperation(value="保存用户")
	//@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ResultCommon<UserInfo> save(@RequestBody UserInfo userInfo) {
		UserInfo entity=userInfoService.save(userInfo);
		return ResultUtil.returnSuccess(entity); 
	}
	
	@ApiOperation(value="删除用户")
	//@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value="/deleteById",method=RequestMethod.DELETE)
	public ResultCommon deleteById(@RequestParam Long userId) {
		userInfoService.deleteById(userId);
		return ResultUtil.returnSuccess(true);
	}
	
	@ApiOperation(value="获取所有用户")
	//@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public ResultCommon<List<UserInfo>> getAll() {
		List<UserInfo> list=userInfoService.getAll();
		return ResultUtil.returnSuccess(list); 
	}
	
	@ApiOperation(value="登录用户")
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ResultCommon login(@RequestParam String loginName,@RequestParam String password) {
		boolean index=userInfoService.login(loginName, password);
		return ResultUtil.returnSuccess(index);
	}
}

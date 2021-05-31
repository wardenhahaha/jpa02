package com.jpa02.util;

import com.jpa02.common.ErrorCodeEnum;
import com.jpa02.common.ResultCommon;

public class ResultUtil {
	public static  <T> ResultCommon<T> returnSuccess(T data) {
		ResultCommon<T> result = new ResultCommon<T>();
        result.setCode(ErrorCodeEnum.CODE_SUCCESS.getCode());
        result.setSuccess(true);
        result.setData(data);
        result.setMessage(ErrorCodeEnum.CODE_SUCCESS.getDesc());
        result.setStackTrace("");
        return result;
    }

}

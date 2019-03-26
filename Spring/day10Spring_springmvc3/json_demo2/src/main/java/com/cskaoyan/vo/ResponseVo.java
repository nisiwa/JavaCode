package com.cskaoyan.vo;

/**
 * Created by little Stone
 * Date 2019/3/26 Time 16:51
 */
public class ResponseVo {
	int successCode;//1: 2:
	String message;//两次密码不一致

	public int getSuccessCode() {
		return successCode;
	}

	public void setSuccessCode(int successCode) {
		this.successCode = successCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

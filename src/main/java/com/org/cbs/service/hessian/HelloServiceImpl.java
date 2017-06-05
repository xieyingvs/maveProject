package com.org.cbs.service.hessian;

import com.org.cbs.service.hessian.HelloService;

public class HelloServiceImpl implements HelloService {

	@Override
	public String helloWorld(String message) {
		// TODO Auto-generated method stub
		return "hello," + message+""+"郑国辉";

	}

}

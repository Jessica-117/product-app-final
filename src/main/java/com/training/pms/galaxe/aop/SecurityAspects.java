package com.training.pms.galaxe.aop;

import java.util.Date;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(0)
public class SecurityAspects {
	
	@Before(value =  "execution(* com.training.pms.galaxe.service.ProductServiceImpl.*(..))")
	public void doCheck() {
		System.out.println("###Security check in at :"+new Date()+ " By Aspects");
	}
	@After(value =  "execution(* com.training.pms.galaxe.service.ProductServiceImpl.*(..))")
	public void doCheckout() {
		System.out.println("###Security check out at :"+new Date()+ " By Aspects");
	}


}
